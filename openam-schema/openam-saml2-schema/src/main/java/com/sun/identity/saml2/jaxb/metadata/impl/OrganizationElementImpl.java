//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.6-b27-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.06.11 at 10:34:07 AM PDT 
//


package com.sun.identity.saml2.jaxb.metadata.impl;

public class OrganizationElementImpl
    extends com.sun.identity.saml2.jaxb.metadata.impl.OrganizationTypeImpl
    implements com.sun.identity.saml2.jaxb.metadata.OrganizationElement, com.sun.xml.bind.RIElement, com.sun.xml.bind.JAXBObject, com.sun.identity.saml2.jaxb.assertion.impl.runtime.UnmarshallableObject, com.sun.identity.saml2.jaxb.assertion.impl.runtime.XMLSerializable, com.sun.identity.saml2.jaxb.assertion.impl.runtime.ValidatableObject
{

    public final static Class version = (com.sun.identity.saml2.jaxb.metadata.impl.JAXBVersion.class);
    private static com.sun.msv.grammar.Grammar schemaFragment;

    private final static Class PRIMARY_INTERFACE_CLASS() {
        return (com.sun.identity.saml2.jaxb.metadata.OrganizationElement.class);
    }

    public String ____jaxb_ri____getNamespaceURI() {
        return "urn:oasis:names:tc:SAML:2.0:metadata";
    }

    public String ____jaxb_ri____getLocalName() {
        return "Organization";
    }

    public com.sun.identity.saml2.jaxb.assertion.impl.runtime.UnmarshallingEventHandler createUnmarshaller(com.sun.identity.saml2.jaxb.assertion.impl.runtime.UnmarshallingContext context) {
        return new com.sun.identity.saml2.jaxb.metadata.impl.OrganizationElementImpl.Unmarshaller(context);
    }

    public void serializeBody(com.sun.identity.saml2.jaxb.assertion.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        context.startElement("urn:oasis:names:tc:SAML:2.0:metadata", "Organization");
        super.serializeURIs(context);
        context.endNamespaceDecls();
        super.serializeAttributes(context);
        context.endAttributes();
        super.serializeBody(context);
        context.endElement();
    }

    public void serializeAttributes(com.sun.identity.saml2.jaxb.assertion.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
    }

    public void serializeURIs(com.sun.identity.saml2.jaxb.assertion.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
    }

    public Class getPrimaryInterface() {
        return (com.sun.identity.saml2.jaxb.metadata.OrganizationElement.class);
    }

    public com.sun.msv.verifier.DocumentDeclaration createRawValidator() {
        if (schemaFragment == null) {
            schemaFragment = com.sun.xml.bind.validator.SchemaDeserializer.deserialize((
 "\u00ac\u00ed\u0000\u0005sr\u0000\'com.sun.msv.grammar.trex.ElementPattern\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000"
+"\tnameClasst\u0000\u001fLcom/sun/msv/grammar/NameClass;xr\u0000\u001ecom.sun.msv."
+"grammar.ElementExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002Z\u0000\u001aignoreUndeclaredAttributesL\u0000"
+"\fcontentModelt\u0000 Lcom/sun/msv/grammar/Expression;xr\u0000\u001ecom.sun."
+"msv.grammar.Expression\u00f8\u0018\u0082\u00e8N5~O\u0002\u0000\u0002L\u0000\u0013epsilonReducibilityt\u0000\u0013Lj"
+"ava/lang/Boolean;L\u0000\u000bexpandedExpq\u0000~\u0000\u0003xppp\u0000sr\u0000\u001fcom.sun.msv.gra"
+"mmar.SequenceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.sun.msv.grammar.BinaryExp"
+"\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0004exp1q\u0000~\u0000\u0003L\u0000\u0004exp2q\u0000~\u0000\u0003xq\u0000~\u0000\u0004ppsq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0007pps"
+"q\u0000~\u0000\u0007ppsr\u0000\u001dcom.sun.msv.grammar.ChoiceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\bpps"
+"q\u0000~\u0000\rsr\u0000\u0011java.lang.Boolean\u00cd r\u0080\u00d5\u009c\u00fa\u00ee\u0002\u0000\u0001Z\u0000\u0005valuexp\u0000psq\u0000~\u0000\u0000q\u0000~\u0000\u0011"
+"p\u0000sq\u0000~\u0000\rppsr\u0000 com.sun.msv.grammar.OneOrMoreExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000"
+"\u001ccom.sun.msv.grammar.UnaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\u0003expq\u0000~\u0000\u0003xq\u0000~\u0000\u0004q\u0000~"
+"\u0000\u0011psr\u0000 com.sun.msv.grammar.AttributeExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0003expq\u0000~\u0000"
+"\u0003L\u0000\tnameClassq\u0000~\u0000\u0001xq\u0000~\u0000\u0004q\u0000~\u0000\u0011psr\u00002com.sun.msv.grammar.Expres"
+"sion$AnyStringExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0004sq\u0000~\u0000\u0010\u0001q\u0000~\u0000\u001asr\u0000 com"
+".sun.msv.grammar.AnyNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.sun.msv.gram"
+"mar.NameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpsr\u00000com.sun.msv.grammar.Expression"
+"$EpsilonExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0004q\u0000~\u0000\u001bq\u0000~\u0000 sr\u0000#com.sun.msv"
+".grammar.SimpleNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\tlocalNamet\u0000\u0012Ljava/lang"
+"/String;L\u0000\fnamespaceURIq\u0000~\u0000\"xq\u0000~\u0000\u001dt\u00006com.sun.identity.saml2."
+"jaxb.metadata.ExtensionsElementt\u0000+http://java.sun.com/jaxb/x"
+"jc/dummy-elementssq\u0000~\u0000\u0000q\u0000~\u0000\u0011p\u0000sq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\rppsq\u0000~\u0000"
+"\u0014q\u0000~\u0000\u0011psq\u0000~\u0000\u0017q\u0000~\u0000\u0011pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u00003com.sun.identity."
+"saml2.jaxb.metadata.ExtensionsTypeq\u0000~\u0000%sq\u0000~\u0000\rppsq\u0000~\u0000\u0017q\u0000~\u0000\u0011ps"
+"r\u0000\u001bcom.sun.msv.grammar.DataExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\u0002dtt\u0000\u001fLorg/relaxn"
+"g/datatype/Datatype;L\u0000\u0006exceptq\u0000~\u0000\u0003L\u0000\u0004namet\u0000\u001dLcom/sun/msv/uti"
+"l/StringPair;xq\u0000~\u0000\u0004ppsr\u0000\"com.sun.msv.datatype.xsd.QnameType\u0000"
+"\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000*com.sun.msv.datatype.xsd.BuiltinAtomicType\u0000\u0000\u0000\u0000"
+"\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000%com.sun.msv.datatype.xsd.ConcreteType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000x"
+"r\u0000\'com.sun.msv.datatype.xsd.XSDatatypeImpl\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\fname"
+"spaceUriq\u0000~\u0000\"L\u0000\btypeNameq\u0000~\u0000\"L\u0000\nwhiteSpacet\u0000.Lcom/sun/msv/da"
+"tatype/xsd/WhiteSpaceProcessor;xpt\u0000 http://www.w3.org/2001/X"
+"MLSchemat\u0000\u0005QNamesr\u00005com.sun.msv.datatype.xsd.WhiteSpaceProce"
+"ssor$Collapse\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000,com.sun.msv.datatype.xsd.WhiteSp"
+"aceProcessor\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpsr\u00000com.sun.msv.grammar.Expression$"
+"NullSetExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0004q\u0000~\u0000\u0011psr\u0000\u001bcom.sun.msv.util"
+".StringPair\u00d0t\u001ejB\u008f\u008d\u00a0\u0002\u0000\u0002L\u0000\tlocalNameq\u0000~\u0000\"L\u0000\fnamespaceURIq\u0000~\u0000\"x"
+"pq\u0000~\u0000;q\u0000~\u0000:sq\u0000~\u0000!t\u0000\u0004typet\u0000)http://www.w3.org/2001/XMLSchema-"
+"instanceq\u0000~\u0000 sq\u0000~\u0000!t\u0000\nExtensionst\u0000$urn:oasis:names:tc:SAML:2"
+".0:metadataq\u0000~\u0000 sq\u0000~\u0000\u0014ppsq\u0000~\u0000\rppsq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\rppsq\u0000~\u0000\u0014q\u0000~\u0000\u0011"
+"psq\u0000~\u0000\u0017q\u0000~\u0000\u0011pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000<com.sun.identity.saml2."
+"jaxb.metadata.OrganizationNameElementq\u0000~\u0000%sq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\u0007pps"
+"q\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\rppsq\u0000~\u0000\u0014q\u0000~\u0000\u0011psq\u0000~\u0000\u0017q\u0000~\u0000\u0011pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000"
+"!t\u00006com.sun.identity.saml2.jaxb.metadata.LocalizedNameTypeq\u0000"
+"~\u0000%sq\u0000~\u0000\rppsq\u0000~\u0000\u0017q\u0000~\u0000\u0011pq\u0000~\u00003q\u0000~\u0000Cq\u0000~\u0000 sq\u0000~\u0000!t\u0000\u0010OrganizationN"
+"ameq\u0000~\u0000Hsq\u0000~\u0000\u0014ppsq\u0000~\u0000\rppsq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\rppsq\u0000~\u0000\u0014q\u0000~\u0000\u0011psq\u0000~\u0000\u0017q"
+"\u0000~\u0000\u0011pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000Ccom.sun.identity.saml2.jaxb.met"
+"adata.OrganizationDisplayNameElementq\u0000~\u0000%sq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\u0007ppsq"
+"\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\rppsq\u0000~\u0000\u0014q\u0000~\u0000\u0011psq\u0000~\u0000\u0017q\u0000~\u0000\u0011pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!"
+"q\u0000~\u0000Xq\u0000~\u0000%sq\u0000~\u0000\rppsq\u0000~\u0000\u0017q\u0000~\u0000\u0011pq\u0000~\u00003q\u0000~\u0000Cq\u0000~\u0000 sq\u0000~\u0000!t\u0000\u0017Organi"
+"zationDisplayNameq\u0000~\u0000Hsq\u0000~\u0000\u0014ppsq\u0000~\u0000\rppsq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\rppsq\u0000~\u0000"
+"\u0014q\u0000~\u0000\u0011psq\u0000~\u0000\u0017q\u0000~\u0000\u0011pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000;com.sun.identity."
+"saml2.jaxb.metadata.OrganizationURLElementq\u0000~\u0000%sq\u0000~\u0000\u0000pp\u0000sq\u0000~"
+"\u0000\u0007ppsq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\rppsq\u0000~\u0000\u0014q\u0000~\u0000\u0011psq\u0000~\u0000\u0017q\u0000~\u0000\u0011pq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 "
+"sq\u0000~\u0000!t\u00005com.sun.identity.saml2.jaxb.metadata.LocalizedURITy"
+"peq\u0000~\u0000%sq\u0000~\u0000\rppsq\u0000~\u0000\u0017q\u0000~\u0000\u0011pq\u0000~\u00003q\u0000~\u0000Cq\u0000~\u0000 sq\u0000~\u0000!t\u0000\u000fOrganizat"
+"ionURLq\u0000~\u0000Hsq\u0000~\u0000\rppsq\u0000~\u0000\u0017q\u0000~\u0000\u0011pq\u0000~\u00003q\u0000~\u0000Cq\u0000~\u0000 sq\u0000~\u0000!t\u0000\fOrgan"
+"izationq\u0000~\u0000Hsr\u0000\"com.sun.msv.grammar.ExpressionPool\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000"
+"\u0001L\u0000\bexpTablet\u0000/Lcom/sun/msv/grammar/ExpressionPool$ClosedHas"
+"h;xpsr\u0000-com.sun.msv.grammar.ExpressionPool$ClosedHash\u00d7j\u00d0N\u00ef\u00e8\u00ed"
+"\u001c\u0003\u0000\u0003I\u0000\u0005countB\u0000\rstreamVersionL\u0000\u0006parentt\u0000$Lcom/sun/msv/grammar"
+"/ExpressionPool;xp\u0000\u0000\u0000%\u0001pq\u0000~\u0000\u0013q\u0000~\u0000)q\u0000~\u0000Lq\u0000~\u0000Tq\u0000~\u0000Iq\u0000~\u0000`q\u0000~\u0000hq"
+"\u0000~\u0000]q\u0000~\u0000sq\u0000~\u0000{q\u0000~\u0000pq\u0000~\u0000\'q\u0000~\u0000Rq\u0000~\u0000fq\u0000~\u0000yq\u0000~\u0000\fq\u0000~\u0000\nq\u0000~\u0000\u0016q\u0000~\u0000*q"
+"\u0000~\u0000Mq\u0000~\u0000Uq\u0000~\u0000aq\u0000~\u0000iq\u0000~\u0000tq\u0000~\u0000|q\u0000~\u0000\u000eq\u0000~\u0000\tq\u0000~\u0000\u000bq\u0000~\u0000.q\u0000~\u0000Yq\u0000~\u0000lq"
+"\u0000~\u0000\u0080q\u0000~\u0000\u0084q\u0000~\u0000\u000fq\u0000~\u0000Jq\u0000~\u0000^q\u0000~\u0000qx"));
        }
        return new com.sun.msv.verifier.regexp.REDocumentDeclaration(schemaFragment);
    }

    public class Unmarshaller
        extends com.sun.identity.saml2.jaxb.assertion.impl.runtime.AbstractUnmarshallingEventHandlerImpl
    {


        public Unmarshaller(com.sun.identity.saml2.jaxb.assertion.impl.runtime.UnmarshallingContext context) {
            super(context, "----");
        }

        protected Unmarshaller(com.sun.identity.saml2.jaxb.assertion.impl.runtime.UnmarshallingContext context, int startState) {
            this(context);
            state = startState;
        }

        public Object owner() {
            return com.sun.identity.saml2.jaxb.metadata.impl.OrganizationElementImpl.this;
        }

        public void enterElement(String ___uri, String ___local, String ___qname, org.xml.sax.Attributes __atts)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  1 :
                        if (("Extensions" == ___local)&&("urn:oasis:names:tc:SAML:2.0:metadata" == ___uri)) {
                            spawnHandlerFromEnterElement((((com.sun.identity.saml2.jaxb.metadata.impl.OrganizationTypeImpl)com.sun.identity.saml2.jaxb.metadata.impl.OrganizationElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("Extensions" == ___local)&&("urn:oasis:names:tc:SAML:2.0:metadata" == ___uri)) {
                            spawnHandlerFromEnterElement((((com.sun.identity.saml2.jaxb.metadata.impl.OrganizationTypeImpl)com.sun.identity.saml2.jaxb.metadata.impl.OrganizationElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("OrganizationName" == ___local)&&("urn:oasis:names:tc:SAML:2.0:metadata" == ___uri)) {
                            spawnHandlerFromEnterElement((((com.sun.identity.saml2.jaxb.metadata.impl.OrganizationTypeImpl)com.sun.identity.saml2.jaxb.metadata.impl.OrganizationElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("OrganizationName" == ___local)&&("urn:oasis:names:tc:SAML:2.0:metadata" == ___uri)) {
                            spawnHandlerFromEnterElement((((com.sun.identity.saml2.jaxb.metadata.impl.OrganizationTypeImpl)com.sun.identity.saml2.jaxb.metadata.impl.OrganizationElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        break;
                    case  3 :
                        revertToParentFromEnterElement(___uri, ___local, ___qname, __atts);
                        return ;
                    case  0 :
                        if (("Organization" == ___local)&&("urn:oasis:names:tc:SAML:2.0:metadata" == ___uri)) {
                            context.pushAttributes(__atts, false);
                            state = 1;
                            return ;
                        }
                        break;
                }
                super.enterElement(___uri, ___local, ___qname, __atts);
                break;
            }
        }

        public void leaveElement(String ___uri, String ___local, String ___qname)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  2 :
                        if (("Organization" == ___local)&&("urn:oasis:names:tc:SAML:2.0:metadata" == ___uri)) {
                            context.popAttributes();
                            state = 3;
                            return ;
                        }
                        break;
                    case  3 :
                        revertToParentFromLeaveElement(___uri, ___local, ___qname);
                        return ;
                }
                super.leaveElement(___uri, ___local, ___qname);
                break;
            }
        }

        public void enterAttribute(String ___uri, String ___local, String ___qname)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  3 :
                        revertToParentFromEnterAttribute(___uri, ___local, ___qname);
                        return ;
                }
                super.enterAttribute(___uri, ___local, ___qname);
                break;
            }
        }

        public void leaveAttribute(String ___uri, String ___local, String ___qname)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  3 :
                        revertToParentFromLeaveAttribute(___uri, ___local, ___qname);
                        return ;
                }
                super.leaveAttribute(___uri, ___local, ___qname);
                break;
            }
        }

        public void handleText(final String value)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                try {
                    switch (state) {
                        case  3 :
                            revertToParentFromText(value);
                            return ;
                    }
                } catch (RuntimeException e) {
                    handleUnexpectedTextException(value, e);
                }
                break;
            }
        }

    }

}
