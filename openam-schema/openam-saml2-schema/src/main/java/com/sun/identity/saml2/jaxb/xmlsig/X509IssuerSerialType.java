//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.6-b27-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.06.11 at 10:34:07 AM PDT 
//


package com.sun.identity.saml2.jaxb.xmlsig;


/**
 * Java content class for X509IssuerSerialType complex type.
 * <p>The following schema fragment specifies the expected content contained within this java content object. (defined at file:/Users/allan/A-SVN/trunk/opensso/products/federation/library/xsd/saml2/xmldsig-core-schema.xsd line 199)
 * <p>
 * <pre>
 * &lt;complexType name="X509IssuerSerialType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="X509IssuerName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="X509SerialNumber" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 */
public interface X509IssuerSerialType {


    /**
     * Gets the value of the x509SerialNumber property.
     * 
     * @return
     *     possible object is
     *     {@link java.math.BigInteger}
     */
    java.math.BigInteger getX509SerialNumber();

    /**
     * Sets the value of the x509SerialNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.math.BigInteger}
     */
    void setX509SerialNumber(java.math.BigInteger value);

    /**
     * Gets the value of the x509IssuerName property.
     * 
     * @return
     *     possible object is
     *     {@link String}
     */
    String getX509IssuerName();

    /**
     * Sets the value of the x509IssuerName property.
     *
     * @param value
     *     allowed object is
     *     {@link String}
     */
    void setX509IssuerName(String value);

}
