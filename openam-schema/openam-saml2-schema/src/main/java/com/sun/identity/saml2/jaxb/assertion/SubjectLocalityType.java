//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.6-b27-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.06.11 at 10:34:07 AM PDT 
//


package com.sun.identity.saml2.jaxb.assertion;


/**
 * Java content class for SubjectLocalityType complex type.
 * <p>The following schema fragment specifies the expected content contained within this java content object. (defined at file:/Users/allan/A-SVN/trunk/opensso/products/federation/library/xsd/saml2/saml-schema-assertion-2.0.xsd line 225)
 * <p>
 * <pre>
 * &lt;complexType name="SubjectLocalityType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="Address" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="DNSName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 */
public interface SubjectLocalityType {


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
     * Gets the value of the dnsName property.
     *
     * @return
     *     possible object is
     *     {@link String}
     */
    String getDNSName();

    /**
     * Sets the value of the dnsName property.
     *
     * @param value
     *     allowed object is
     *     {@link String}
     */
    void setDNSName(String value);

}
