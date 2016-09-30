/*
 * The contents of this file are subject to the terms of the Common Development and
 * Distribution License (the License). You may not use this file except in compliance with the
 * License.
 *
 * You can obtain a copy of the License at legal/CDDLv1.0.txt. See the License for the
 * specific language governing permission and limitations under the License.
 *
 * When distributing Covered Software, include this CDDL Header Notice in each file and include
 * the License file at legal/CDDLv1.0.txt. If applicable, add the following below the CDDL
 * Header, with the fields enclosed by brackets [] replaced by your own identifying
 * information: "Portions copyright [year] [name of copyright owner]".
 *
 * Copyright 2016 ForgeRock AS.
 */

package com.iplanet.dpro.session.service;

import java.util.concurrent.ConcurrentHashMap;

import javax.inject.Inject;
import javax.inject.Singleton;

import org.forgerock.openam.session.service.SessionAccessManager;

import com.iplanet.dpro.session.SessionID;

/**
 * Stores sessions used for authentication which must not yet be written to the store.
 * This comprises both sessions which shouldn't be written to the store (e.g. stateless, authentication),
 * as well as sessions which have yet to be added to the store.
 *
 * Authentication sessions will be stored for the duration of their {@link InternalSession#getTimeLeft()}
 * value, after which they will be removed from this store.
 *
 * Thread Safety: This class is thread safe.
 */
@Singleton
public class AuthenticationSessionStore {
    private final ConcurrentHashMap<SessionID, InternalSession> store = new ConcurrentHashMap<>();

    private final SessionAccessManager sessionAccessManager;

    @Inject
    public AuthenticationSessionStore(SessionAccessManager sessionAccessManager) {
        this.sessionAccessManager = sessionAccessManager;
    }

    public void addSession(InternalSession session) {
        cullExpiredSessions();
        if (session.isStored()) {
            throw new IllegalStateException("Session was added to temporary store when it is already persisted.");
        }
        if (store.containsKey(session.getID())) {
            throw new IllegalStateException("Session was added to temporary store twice.");
        }
        session.cancel();

        store.put(session.getID(), session);
    }

    /**
     * Lookup the Session based on its Session ID.
     *
     * Side effect: Calling this method will cull any expired Sessions from this store.
     *
     * @param sessionID Looks up the InternalSession by its SessionID.
     * @return Null if no Session was found otherwise a non null Session.
     */
    public InternalSession getSession(SessionID sessionID) {
        if (sessionID == null) {
            return null;
        }
        cullSessionIfNecessary(sessionID);
        return store.get(sessionID);
    }

    /**
     * Moves the specified session out of this store and into the persistent store.
     *
     * @param sessionID Non null sessionID for the session to be promoted.
     * @throws IllegalStateException if session not found in the store.
     */
    public void promoteSession(SessionID sessionID) {
        InternalSession session = getSession(sessionID);
        if (session == null) {
            throw new IllegalStateException("Attempted to promote non existent session");
        }

        session.setStored(true);
        sessionAccessManager.persistInternalSession(session);
        session.reschedule();
        removeSession(sessionID);
    }

    private void cullExpiredSessions() {
        for (SessionID sessionId : store.keySet()) {
            cullSessionIfNecessary(sessionId);
        }
    }

    private void cullSessionIfNecessary(SessionID sessionId) {
        if (shouldRemove(sessionId)) {
            removeSession(sessionId);
        }
    }

    private boolean shouldRemove(SessionID sessionId) {
        return store.containsKey(sessionId) && store.get(sessionId).getTimeLeft() == 0;
    }

    /**
     * There are cases where an authentication session is created but never used. In these cases
     * we should remove it from the store.
     *
     * @param sessionID Non null SessionID to remove from the store.
     * @return The {@link InternalSession} that was removed.
     * @throws IllegalStateException If the session was not found in the store.
     */
    public InternalSession removeSession(SessionID sessionID) {
        if (sessionID == null || !store.containsKey(sessionID)) {
            throw new IllegalStateException("Attempted to remove a non existent session");
        }
        return store.remove(sessionID);
    }
}
