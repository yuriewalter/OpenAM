//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.6-b27-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.06.11 at 10:34:07 AM PDT 
//


package com.sun.identity.saml2.jaxb.schema;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.sun.identity.saml2.jaxb.schema package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
public class ObjectFactory
    extends com.sun.identity.saml2.jaxb.assertion.impl.runtime.DefaultJAXBContextImpl
{

    private static java.util.HashMap defaultImplementations = new java.util.HashMap(16, 0.75F);
    private static java.util.HashMap rootTagMap = new java.util.HashMap();
    public final static com.sun.identity.saml2.jaxb.assertion.impl.runtime.GrammarInfo grammarInfo = new com.sun.identity.saml2.jaxb.assertion.impl.runtime.GrammarInfoImpl(rootTagMap, defaultImplementations, (com.sun.identity.saml2.jaxb.schema.ObjectFactory.class));
    public final static Class version = (com.sun.identity.saml2.jaxb.schema.impl.JAXBVersion.class);

    static {
        defaultImplementations.put((com.sun.identity.saml2.jaxb.schema.AnyType.class), "com.sun.identity.saml2.jaxb.schema.impl.AnyTypeImpl");
    }

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.sun.identity.saml2.jaxb.schema
     *
     */
    public ObjectFactory() {
        super(grammarInfo);
    }

    /**
     * Create an instance of the specified Java content interface.
     *
     * @param javaContentInterface
     *     the Class object of the javacontent interface to instantiate
     * @return
     *     a new instance
     * @throws JAXBException
     *     if an error occurs
     */
    public Object newInstance(Class javaContentInterface)
        throws javax.xml.bind.JAXBException
    {
        return super.newInstance(javaContentInterface);
    }

    /**
     * Get the specified property. This method can only be
     * used to get provider specific properties.
     * Attempting to get an undefined property will result
     * in a PropertyException being thrown.
     *
     * @param name
     *     the name of the property to retrieve
     * @return
     *     the value of the requested property
     * @throws PropertyException
     *     when there is an error retrieving the given property or value
     */
    public Object getProperty(String name)
        throws javax.xml.bind.PropertyException
    {
        return super.getProperty(name);
    }

    /**
     * Set the specified property. This method can only be
     * used to set provider specific properties.
     * Attempting to set an undefined property will result
     * in a PropertyException being thrown.
     *
     * @param name
     *     the name of the property to retrieve
     * @param value
     *     the value of the property to be set
     * @throws PropertyException
     *     when there is an error processing the given property or value
     */
    public void setProperty(String name, Object value)
        throws javax.xml.bind.PropertyException
    {
        super.setProperty(name, value);
    }

    /**
     * Create an instance of AnyType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.sun.identity.saml2.jaxb.schema.AnyType createAnyType()
        throws javax.xml.bind.JAXBException
    {
        return new com.sun.identity.saml2.jaxb.schema.impl.AnyTypeImpl();
    }

}
