//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.6-b27-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.06.11 at 10:34:07 AM PDT 
//


package com.sun.identity.saml2.jaxb.metadata;


/**
 * Java content class for AdditionalMetadataLocationType complex type.
 * <p>The following schema fragment specifies the expected content contained within this java content object. (defined at file:/Users/allan/A-SVN/trunk/opensso/products/federation/library/xsd/saml2/saml-schema-metadata-2.0.xsd line 201)
 * <p>
 * <pre>
 * &lt;complexType name="AdditionalMetadataLocationType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>anyURI">
 *       &lt;attribute name="namespace" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 */
public interface AdditionalMetadataLocationType {


    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String}
     */
    String getValue();

    /**
     * Sets the value of the value property.
     *
     * @param value
     *     allowed object is
     *     {@link String}
     */
    void setValue(String value);

    /**
     * Gets the value of the namespace property.
     *
     * @return
     *     possible object is
     *     {@link String}
     */
    String getNamespace();

    /**
     * Sets the value of the namespace property.
     *
     * @param value
     *     allowed object is
     *     {@link String}
     */
    void setNamespace(String value);

}
