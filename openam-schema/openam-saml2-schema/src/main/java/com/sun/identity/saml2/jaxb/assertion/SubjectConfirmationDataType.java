//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.6-b27-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.06.11 at 10:34:07 AM PDT 
//


package com.sun.identity.saml2.jaxb.assertion;


/**
 * Java content class for SubjectConfirmationDataType complex type.
 * <p>The following schema fragment specifies the expected content contained within this java content object. (defined at file:/Users/allan/A-SVN/trunk/opensso/products/federation/library/xsd/saml2/saml-schema-assertion-2.0.xsd line 132)
 * <p>
 * <pre>
 * &lt;complexType name="SubjectConfirmationDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;any/>
 *       &lt;/sequence>
 *       &lt;attribute name="Address" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="InResponseTo" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *       &lt;attribute name="NotBefore" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="NotOnOrAfter" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="Recipient" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 */
public interface SubjectConfirmationDataType {


    /**
     * Gets the value of the notBefore property.
     * 
     * @return
     *     possible object is
     *     {@link java.util.Calendar}
     */
    java.util.Calendar getNotBefore();

    /**
     * Sets the value of the notBefore property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.util.Calendar}
     */
    void setNotBefore(java.util.Calendar value);

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link String}
     */
    String getAddress();

    /**
     * Sets the value of the address property.
     *
     * @param value
     *     allowed object is
     *     {@link String}
     */
    void setAddress(String value);

    /**
     * Gets the value of the notOnOrAfter property.
     *
     * @return
     *     possible object is
     *     {@link java.util.Calendar}
     */
    java.util.Calendar getNotOnOrAfter();

    /**
     * Sets the value of the notOnOrAfter property.
     *
     * @param value
     *     allowed object is
     *     {@link java.util.Calendar}
     */
    void setNotOnOrAfter(java.util.Calendar value);

    /**
     * Gets the value of the inResponseTo property.
     *
     * @return
     *     possible object is
     *     {@link String}
     */
    String getInResponseTo();

    /**
     * Sets the value of the inResponseTo property.
     *
     * @param value
     *     allowed object is
     *     {@link String}
     */
    void setInResponseTo(String value);

    /**
     * Gets the value of the Content property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the Content property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object}
     * {@link String}
     *
     */
    java.util.List getContent();

    /**
     * Gets the value of the recipient property.
     *
     * @return
     *     possible object is
     *     {@link String}
     */
    String getRecipient();

    /**
     * Sets the value of the recipient property.
     *
     * @param value
     *     allowed object is
     *     {@link String}
     */
    void setRecipient(String value);

}
