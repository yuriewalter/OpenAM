//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.6-b27-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.06.11 at 10:34:07 AM PDT 
//


package com.sun.identity.saml2.jaxb.metadata.impl;

public class QueryDescriptorElementImpl
    extends com.sun.identity.saml2.jaxb.metadata.impl.QueryDescriptorTypeImpl
    implements com.sun.identity.saml2.jaxb.metadata.QueryDescriptorElement, com.sun.xml.bind.RIElement, com.sun.xml.bind.JAXBObject, com.sun.identity.saml2.jaxb.assertion.impl.runtime.UnmarshallableObject, com.sun.identity.saml2.jaxb.assertion.impl.runtime.XMLSerializable, com.sun.identity.saml2.jaxb.assertion.impl.runtime.ValidatableObject
{

    public final static Class version = (com.sun.identity.saml2.jaxb.metadata.impl.JAXBVersion.class);
    private static com.sun.msv.grammar.Grammar schemaFragment;

    private final static Class PRIMARY_INTERFACE_CLASS() {
        return (com.sun.identity.saml2.jaxb.metadata.QueryDescriptorElement.class);
    }

    public String ____jaxb_ri____getNamespaceURI() {
        return "urn:oasis:names:tc:SAML:2.0:metadata";
    }

    public String ____jaxb_ri____getLocalName() {
        return "QueryDescriptor";
    }

    public com.sun.identity.saml2.jaxb.assertion.impl.runtime.UnmarshallingEventHandler createUnmarshaller(com.sun.identity.saml2.jaxb.assertion.impl.runtime.UnmarshallingContext context) {
        return new com.sun.identity.saml2.jaxb.metadata.impl.QueryDescriptorElementImpl.Unmarshaller(context);
    }

    public void serializeBody(com.sun.identity.saml2.jaxb.assertion.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        context.startElement("urn:oasis:names:tc:SAML:2.0:metadata", "QueryDescriptor");
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
        return (com.sun.identity.saml2.jaxb.metadata.QueryDescriptorElement.class);
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
+"q\u0000~\u0000\u0007ppsq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0007ppsq\u0000~\u0000"
+"\u0007ppsq\u0000~\u0000\u0007ppsr\u0000\u001dcom.sun.msv.grammar.ChoiceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000"
+"\bppsq\u0000~\u0000\u0015sr\u0000\u0011java.lang.Boolean\u00cd r\u0080\u00d5\u009c\u00fa\u00ee\u0002\u0000\u0001Z\u0000\u0005valuexp\u0000psq\u0000~\u0000\u0000q"
+"\u0000~\u0000\u0019p\u0000sq\u0000~\u0000\u0015ppsr\u0000 com.sun.msv.grammar.OneOrMoreExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000"
+"\u0000xr\u0000\u001ccom.sun.msv.grammar.UnaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\u0003expq\u0000~\u0000\u0003xq\u0000~\u0000"
+"\u0004q\u0000~\u0000\u0019psr\u0000 com.sun.msv.grammar.AttributeExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0003exp"
+"q\u0000~\u0000\u0003L\u0000\tnameClassq\u0000~\u0000\u0001xq\u0000~\u0000\u0004q\u0000~\u0000\u0019psr\u00002com.sun.msv.grammar.Ex"
+"pression$AnyStringExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0004sq\u0000~\u0000\u0018\u0001q\u0000~\u0000\"sr\u0000"
+" com.sun.msv.grammar.AnyNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.sun.msv."
+"grammar.NameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpsr\u00000com.sun.msv.grammar.Expres"
+"sion$EpsilonExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0004q\u0000~\u0000#q\u0000~\u0000(sr\u0000#com.sun"
+".msv.grammar.SimpleNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\tlocalNamet\u0000\u0012Ljava/"
+"lang/String;L\u0000\fnamespaceURIq\u0000~\u0000*xq\u0000~\u0000%t\u00003com.sun.identity.sa"
+"ml2.jaxb.xmlsig.SignatureElementt\u0000+http://java.sun.com/jaxb/"
+"xjc/dummy-elementssq\u0000~\u0000\u0000q\u0000~\u0000\u0019p\u0000sq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\u0015ppsq\u0000~"
+"\u0000\u001cq\u0000~\u0000\u0019psq\u0000~\u0000\u001fq\u0000~\u0000\u0019pq\u0000~\u0000\"q\u0000~\u0000&q\u0000~\u0000(sq\u0000~\u0000)t\u00000com.sun.identity"
+".saml2.jaxb.xmlsig.SignatureTypeq\u0000~\u0000-sq\u0000~\u0000\u0015ppsq\u0000~\u0000\u001fq\u0000~\u0000\u0019psr\u0000"
+"\u001bcom.sun.msv.grammar.DataExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\u0002dtt\u0000\u001fLorg/relaxng/"
+"datatype/Datatype;L\u0000\u0006exceptq\u0000~\u0000\u0003L\u0000\u0004namet\u0000\u001dLcom/sun/msv/util/"
+"StringPair;xq\u0000~\u0000\u0004ppsr\u0000\"com.sun.msv.datatype.xsd.QnameType\u0000\u0000\u0000"
+"\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000*com.sun.msv.datatype.xsd.BuiltinAtomicType\u0000\u0000\u0000\u0000\u0000\u0000"
+"\u0000\u0001\u0002\u0000\u0000xr\u0000%com.sun.msv.datatype.xsd.ConcreteType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000"
+"\'com.sun.msv.datatype.xsd.XSDatatypeImpl\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\fnamesp"
+"aceUriq\u0000~\u0000*L\u0000\btypeNameq\u0000~\u0000*L\u0000\nwhiteSpacet\u0000.Lcom/sun/msv/data"
+"type/xsd/WhiteSpaceProcessor;xpt\u0000 http://www.w3.org/2001/XML"
+"Schemat\u0000\u0005QNamesr\u00005com.sun.msv.datatype.xsd.WhiteSpaceProcess"
+"or$Collapse\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000,com.sun.msv.datatype.xsd.WhiteSpac"
+"eProcessor\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpsr\u00000com.sun.msv.grammar.Expression$Nu"
+"llSetExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0004q\u0000~\u0000\u0019psr\u0000\u001bcom.sun.msv.util.S"
+"tringPair\u00d0t\u001ejB\u008f\u008d\u00a0\u0002\u0000\u0002L\u0000\tlocalNameq\u0000~\u0000*L\u0000\fnamespaceURIq\u0000~\u0000*xpq"
+"\u0000~\u0000Cq\u0000~\u0000Bsq\u0000~\u0000)t\u0000\u0004typet\u0000)http://www.w3.org/2001/XMLSchema-in"
+"stanceq\u0000~\u0000(sq\u0000~\u0000)t\u0000\tSignaturet\u0000\"http://www.w3.org/2000/09/xm"
+"ldsig#q\u0000~\u0000(sq\u0000~\u0000\u0015ppsq\u0000~\u0000\u0015q\u0000~\u0000\u0019psq\u0000~\u0000\u0000q\u0000~\u0000\u0019p\u0000sq\u0000~\u0000\u0015ppsq\u0000~\u0000\u001cq\u0000"
+"~\u0000\u0019psq\u0000~\u0000\u001fq\u0000~\u0000\u0019pq\u0000~\u0000\"q\u0000~\u0000&q\u0000~\u0000(sq\u0000~\u0000)t\u00006com.sun.identity.sam"
+"l2.jaxb.metadata.ExtensionsElementq\u0000~\u0000-sq\u0000~\u0000\u0000q\u0000~\u0000\u0019p\u0000sq\u0000~\u0000\u0007pp"
+"sq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\u0015ppsq\u0000~\u0000\u001cq\u0000~\u0000\u0019psq\u0000~\u0000\u001fq\u0000~\u0000\u0019pq\u0000~\u0000\"q\u0000~\u0000&q\u0000~\u0000(sq\u0000~"
+"\u0000)t\u00003com.sun.identity.saml2.jaxb.metadata.ExtensionsTypeq\u0000~\u0000"
+"-sq\u0000~\u0000\u0015ppsq\u0000~\u0000\u001fq\u0000~\u0000\u0019pq\u0000~\u0000;q\u0000~\u0000Kq\u0000~\u0000(sq\u0000~\u0000)t\u0000\nExtensionst\u0000$ur"
+"n:oasis:names:tc:SAML:2.0:metadataq\u0000~\u0000(sq\u0000~\u0000\u0015ppsq\u0000~\u0000\u001cq\u0000~\u0000\u0019ps"
+"q\u0000~\u0000\u0015q\u0000~\u0000\u0019psq\u0000~\u0000\u0000q\u0000~\u0000\u0019p\u0000sq\u0000~\u0000\u0015ppsq\u0000~\u0000\u001cq\u0000~\u0000\u0019psq\u0000~\u0000\u001fq\u0000~\u0000\u0019pq\u0000~\u0000"
+"\"q\u0000~\u0000&q\u0000~\u0000(sq\u0000~\u0000)t\u00009com.sun.identity.saml2.jaxb.metadata.Key"
+"DescriptorElementq\u0000~\u0000-sq\u0000~\u0000\u0000q\u0000~\u0000\u0019p\u0000sq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\u0015pp"
+"sq\u0000~\u0000\u001cq\u0000~\u0000\u0019psq\u0000~\u0000\u001fq\u0000~\u0000\u0019pq\u0000~\u0000\"q\u0000~\u0000&q\u0000~\u0000(sq\u0000~\u0000)t\u00006com.sun.iden"
+"tity.saml2.jaxb.metadata.KeyDescriptorTypeq\u0000~\u0000-sq\u0000~\u0000\u0015ppsq\u0000~\u0000"
+"\u001fq\u0000~\u0000\u0019pq\u0000~\u0000;q\u0000~\u0000Kq\u0000~\u0000(sq\u0000~\u0000)t\u0000\rKeyDescriptorq\u0000~\u0000eq\u0000~\u0000(sq\u0000~\u0000\u0015"
+"ppsq\u0000~\u0000\u0015q\u0000~\u0000\u0019psq\u0000~\u0000\u0000q\u0000~\u0000\u0019p\u0000sq\u0000~\u0000\u0015ppsq\u0000~\u0000\u001cq\u0000~\u0000\u0019psq\u0000~\u0000\u001fq\u0000~\u0000\u0019pq"
+"\u0000~\u0000\"q\u0000~\u0000&q\u0000~\u0000(sq\u0000~\u0000)t\u00008com.sun.identity.saml2.jaxb.metadata."
+"OrganizationElementq\u0000~\u0000-sq\u0000~\u0000\u0000q\u0000~\u0000\u0019p\u0000sq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\u0015"
+"ppsq\u0000~\u0000\u001cq\u0000~\u0000\u0019psq\u0000~\u0000\u001fq\u0000~\u0000\u0019pq\u0000~\u0000\"q\u0000~\u0000&q\u0000~\u0000(sq\u0000~\u0000)t\u00005com.sun.id"
+"entity.saml2.jaxb.metadata.OrganizationTypeq\u0000~\u0000-sq\u0000~\u0000\u0015ppsq\u0000~"
+"\u0000\u001fq\u0000~\u0000\u0019pq\u0000~\u0000;q\u0000~\u0000Kq\u0000~\u0000(sq\u0000~\u0000)t\u0000\fOrganizationq\u0000~\u0000eq\u0000~\u0000(sq\u0000~\u0000\u0015"
+"ppsq\u0000~\u0000\u001cq\u0000~\u0000\u0019psq\u0000~\u0000\u0015q\u0000~\u0000\u0019psq\u0000~\u0000\u0000q\u0000~\u0000\u0019p\u0000sq\u0000~\u0000\u0015ppsq\u0000~\u0000\u001cq\u0000~\u0000\u0019ps"
+"q\u0000~\u0000\u001fq\u0000~\u0000\u0019pq\u0000~\u0000\"q\u0000~\u0000&q\u0000~\u0000(sq\u0000~\u0000)t\u00009com.sun.identity.saml2.ja"
+"xb.metadata.ContactPersonElementq\u0000~\u0000-sq\u0000~\u0000\u0000q\u0000~\u0000\u0019p\u0000sq\u0000~\u0000\u0007ppsq"
+"\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\u0015ppsq\u0000~\u0000\u001cq\u0000~\u0000\u0019psq\u0000~\u0000\u001fq\u0000~\u0000\u0019pq\u0000~\u0000\"q\u0000~\u0000&q\u0000~\u0000(sq\u0000~\u0000)"
+"t\u00000com.sun.identity.saml2.jaxb.metadata.ContactTypeq\u0000~\u0000-sq\u0000~"
+"\u0000\u0015ppsq\u0000~\u0000\u001fq\u0000~\u0000\u0019pq\u0000~\u0000;q\u0000~\u0000Kq\u0000~\u0000(sq\u0000~\u0000)t\u0000\rContactPersonq\u0000~\u0000eq\u0000"
+"~\u0000(sq\u0000~\u0000\u0015ppsq\u0000~\u0000\u001cq\u0000~\u0000\u0019psq\u0000~\u0000\u0000q\u0000~\u0000\u0019p\u0000sq\u0000~\u0000\u0007ppsq\u0000~\u00008q\u0000~\u0000\u0019psr\u0000#"
+"com.sun.msv.datatype.xsd.AnyURIType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000=q\u0000~\u0000Bt\u0000\u0006"
+"anyURIq\u0000~\u0000Fq\u0000~\u0000Hsq\u0000~\u0000Iq\u0000~\u0000\u00abq\u0000~\u0000Bsq\u0000~\u0000\u0015ppsq\u0000~\u0000\u001fq\u0000~\u0000\u0019pq\u0000~\u0000;q\u0000~"
+"\u0000Kq\u0000~\u0000(sq\u0000~\u0000)t\u0000\fNameIDFormatq\u0000~\u0000eq\u0000~\u0000(sq\u0000~\u0000\u0015ppsq\u0000~\u0000\u001fq\u0000~\u0000\u0019psq"
+"\u0000~\u00008ppsr\u0000\u001fcom.sun.msv.datatype.xsd.IDType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000#com."
+"sun.msv.datatype.xsd.NcnameType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\"com.sun.msv.da"
+"tatype.xsd.TokenType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000#com.sun.msv.datatype.xsd."
+"StringType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001Z\u0000\risAlwaysValidxq\u0000~\u0000=q\u0000~\u0000Bt\u0000\u0002IDq\u0000~\u0000F\u0000q"
+"\u0000~\u0000Hsq\u0000~\u0000Iq\u0000~\u0000\u00b9q\u0000~\u0000Bsq\u0000~\u0000)t\u0000\u0002IDt\u0000\u0000q\u0000~\u0000(sq\u0000~\u0000\u0015ppsq\u0000~\u0000\u001fq\u0000~\u0000\u0019ps"
+"q\u0000~\u00008ppsr\u0000%com.sun.msv.datatype.xsd.DurationType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000x"
+"q\u0000~\u0000=q\u0000~\u0000Bt\u0000\bdurationq\u0000~\u0000Fq\u0000~\u0000Hsq\u0000~\u0000Iq\u0000~\u0000\u00c3q\u0000~\u0000Bsq\u0000~\u0000)t\u0000\rcach"
+"eDurationq\u0000~\u0000\u00bdq\u0000~\u0000(sq\u0000~\u0000\u0015ppsq\u0000~\u0000\u001fq\u0000~\u0000\u0019pq\u0000~\u0000\u00a8sq\u0000~\u0000)t\u0000\berrorUR"
+"Lq\u0000~\u0000\u00bdq\u0000~\u0000(sq\u0000~\u0000\u001fppsq\u0000~\u00008ppsr\u0000!com.sun.msv.datatype.xsd.List"
+"Type\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\bitemTypet\u0000)Lcom/sun/msv/datatype/xsd/XSDat"
+"atypeImpl;xq\u0000~\u0000>q\u0000~\u0000et\u0000\u000eanyURIListTypeq\u0000~\u0000Fq\u0000~\u0000\u00aaq\u0000~\u0000Hpsq\u0000~\u0000)"
+"t\u0000\u001aprotocolSupportEnumerationq\u0000~\u0000\u00bdsq\u0000~\u0000\u0015ppsq\u0000~\u0000\u001fq\u0000~\u0000\u0019psq\u0000~\u00008"
+"ppsr\u0000%com.sun.msv.datatype.xsd.DateTimeType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000)co"
+"m.sun.msv.datatype.xsd.DateTimeBaseType\u0014W\u001a@3\u00a5\u00b4\u00e5\u0002\u0000\u0000xq\u0000~\u0000=q\u0000~\u0000"
+"Bt\u0000\bdateTimeq\u0000~\u0000Fq\u0000~\u0000Hsq\u0000~\u0000Iq\u0000~\u0000\u00d9q\u0000~\u0000Bsq\u0000~\u0000)t\u0000\nvalidUntilq\u0000~"
+"\u0000\u00bdq\u0000~\u0000(sq\u0000~\u0000\u0015ppsq\u0000~\u0000\u001fq\u0000~\u0000\u0019psq\u0000~\u00008ppsr\u0000$com.sun.msv.datatype."
+"xsd.BooleanType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000=q\u0000~\u0000Bt\u0000\u0007booleanq\u0000~\u0000Fq\u0000~\u0000Hsq\u0000"
+"~\u0000Iq\u0000~\u0000\u00e2q\u0000~\u0000Bsq\u0000~\u0000)t\u0000\u0014WantAssertionsSignedq\u0000~\u0000\u00bdq\u0000~\u0000(sq\u0000~\u0000\u0015pp"
+"sq\u0000~\u0000\u001fq\u0000~\u0000\u0019pq\u0000~\u0000;q\u0000~\u0000Kq\u0000~\u0000(sq\u0000~\u0000)t\u0000\u000fQueryDescriptorq\u0000~\u0000esr\u0000\""
+"com.sun.msv.grammar.ExpressionPool\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\bexpTablet\u0000/L"
+"com/sun/msv/grammar/ExpressionPool$ClosedHash;xpsr\u0000-com.sun."
+"msv.grammar.ExpressionPool$ClosedHash\u00d7j\u00d0N\u00ef\u00e8\u00ed\u001c\u0003\u0000\u0003I\u0000\u0005countB\u0000\rs"
+"treamVersionL\u0000\u0006parentt\u0000$Lcom/sun/msv/grammar/ExpressionPool;"
+"xp\u0000\u0000\u0000@\u0001pq\u0000~\u0000]q\u0000~\u0000Uq\u0000~\u0000\u00b1q\u0000~\u00002q\u0000~\u0000\u001eq\u0000~\u0000\nq\u0000~\u0000\u00a4q\u0000~\u0000\u000bq\u0000~\u0000\u00beq\u0000~\u0000\u0090q\u0000"
+"~\u0000gq\u0000~\u0000\u009bq\u0000~\u0000\u0093q\u0000~\u0000\u0086q\u0000~\u0000~q\u0000~\u0000rq\u0000~\u0000jq\u0000~\u0000\\q\u0000~\u0000Tq\u0000~\u00001q\u0000~\u0000\u001bq\u0000~\u0000\u000eq\u0000"
+"~\u0000\u0099q\u0000~\u0000\u0084q\u0000~\u0000pq\u0000~\u0000Zq\u0000~\u0000/q\u0000~\u0000\u00c7q\u0000~\u0000{q\u0000~\u0000Qq\u0000~\u0000\u0016q\u0000~\u0000\u008fq\u0000~\u0000fq\u0000~\u0000\u0091q\u0000"
+"~\u0000|q\u0000~\u0000hq\u0000~\u0000Rq\u0000~\u0000\u0017q\u0000~\u0000\tq\u0000~\u0000\u0010q\u0000~\u0000\u00adq\u0000~\u0000\u00a0q\u0000~\u0000\u008bq\u0000~\u0000wq\u0000~\u0000aq\u0000~\u00006q\u0000"
+"~\u0000\u00e6q\u0000~\u0000\u0011q\u0000~\u0000\u000fq\u0000~\u0000\u0014q\u0000~\u0000\u00ddq\u0000~\u0000\u0012q\u0000~\u0000\u00a7q\u0000~\u0000\fq\u0000~\u0000\rq\u0000~\u0000\u00d3q\u0000~\u0000\u0013q\u0000~\u0000\u00a5q\u0000"
+"~\u0000\u009cq\u0000~\u0000\u0094q\u0000~\u0000\u0087q\u0000~\u0000\u007fq\u0000~\u0000sq\u0000~\u0000kx"));
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
            return com.sun.identity.saml2.jaxb.metadata.impl.QueryDescriptorElementImpl.this;
        }

        public void enterElement(String ___uri, String ___local, String ___qname, org.xml.sax.Attributes __atts)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  3 :
                        revertToParentFromEnterElement(___uri, ___local, ___qname, __atts);
                        return ;
                    case  1 :
                        attIdx = context.getAttribute("", "WantAssertionsSigned");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().enterElement(___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        attIdx = context.getAttribute("", "ID");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().enterElement(___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        attIdx = context.getAttribute("", "cacheDuration");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().enterElement(___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        attIdx = context.getAttribute("", "errorURL");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().enterElement(___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        attIdx = context.getAttribute("", "protocolSupportEnumeration");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().enterElement(___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        break;
                    case  0 :
                        if (("QueryDescriptor" == ___local)&&("urn:oasis:names:tc:SAML:2.0:metadata" == ___uri)) {
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
                    case  3 :
                        revertToParentFromLeaveElement(___uri, ___local, ___qname);
                        return ;
                    case  1 :
                        attIdx = context.getAttribute("", "WantAssertionsSigned");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveElement(___uri, ___local, ___qname);
                            return ;
                        }
                        attIdx = context.getAttribute("", "ID");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveElement(___uri, ___local, ___qname);
                            return ;
                        }
                        attIdx = context.getAttribute("", "cacheDuration");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveElement(___uri, ___local, ___qname);
                            return ;
                        }
                        attIdx = context.getAttribute("", "errorURL");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveElement(___uri, ___local, ___qname);
                            return ;
                        }
                        attIdx = context.getAttribute("", "protocolSupportEnumeration");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveElement(___uri, ___local, ___qname);
                            return ;
                        }
                        break;
                    case  2 :
                        if (("QueryDescriptor" == ___local)&&("urn:oasis:names:tc:SAML:2.0:metadata" == ___uri)) {
                            context.popAttributes();
                            state = 3;
                            return ;
                        }
                        break;
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
                    case  1 :
                        if (("WantAssertionsSigned" == ___local)&&("" == ___uri)) {
                            spawnHandlerFromEnterAttribute((((com.sun.identity.saml2.jaxb.metadata.impl.QueryDescriptorTypeImpl)com.sun.identity.saml2.jaxb.metadata.impl.QueryDescriptorElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname);
                            return ;
                        }
                        if (("ID" == ___local)&&("" == ___uri)) {
                            spawnHandlerFromEnterAttribute((((com.sun.identity.saml2.jaxb.metadata.impl.QueryDescriptorTypeImpl)com.sun.identity.saml2.jaxb.metadata.impl.QueryDescriptorElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname);
                            return ;
                        }
                        if (("cacheDuration" == ___local)&&("" == ___uri)) {
                            spawnHandlerFromEnterAttribute((((com.sun.identity.saml2.jaxb.metadata.impl.QueryDescriptorTypeImpl)com.sun.identity.saml2.jaxb.metadata.impl.QueryDescriptorElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname);
                            return ;
                        }
                        if (("errorURL" == ___local)&&("" == ___uri)) {
                            spawnHandlerFromEnterAttribute((((com.sun.identity.saml2.jaxb.metadata.impl.QueryDescriptorTypeImpl)com.sun.identity.saml2.jaxb.metadata.impl.QueryDescriptorElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname);
                            return ;
                        }
                        if (("protocolSupportEnumeration" == ___local)&&("" == ___uri)) {
                            spawnHandlerFromEnterAttribute((((com.sun.identity.saml2.jaxb.metadata.impl.QueryDescriptorTypeImpl)com.sun.identity.saml2.jaxb.metadata.impl.QueryDescriptorElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname);
                            return ;
                        }
                        break;
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
                    case  1 :
                        attIdx = context.getAttribute("", "WantAssertionsSigned");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveAttribute(___uri, ___local, ___qname);
                            return ;
                        }
                        attIdx = context.getAttribute("", "ID");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveAttribute(___uri, ___local, ___qname);
                            return ;
                        }
                        attIdx = context.getAttribute("", "cacheDuration");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveAttribute(___uri, ___local, ___qname);
                            return ;
                        }
                        attIdx = context.getAttribute("", "errorURL");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveAttribute(___uri, ___local, ___qname);
                            return ;
                        }
                        attIdx = context.getAttribute("", "protocolSupportEnumeration");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveAttribute(___uri, ___local, ___qname);
                            return ;
                        }
                        break;
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
                        case  1 :
                            attIdx = context.getAttribute("", "WantAssertionsSigned");
                            if (attIdx >= 0) {
                                context.consumeAttribute(attIdx);
                                context.getCurrentHandler().text(value);
                                return ;
                            }
                            attIdx = context.getAttribute("", "ID");
                            if (attIdx >= 0) {
                                context.consumeAttribute(attIdx);
                                context.getCurrentHandler().text(value);
                                return ;
                            }
                            attIdx = context.getAttribute("", "cacheDuration");
                            if (attIdx >= 0) {
                                context.consumeAttribute(attIdx);
                                context.getCurrentHandler().text(value);
                                return ;
                            }
                            attIdx = context.getAttribute("", "errorURL");
                            if (attIdx >= 0) {
                                context.consumeAttribute(attIdx);
                                context.getCurrentHandler().text(value);
                                return ;
                            }
                            attIdx = context.getAttribute("", "protocolSupportEnumeration");
                            if (attIdx >= 0) {
                                context.consumeAttribute(attIdx);
                                context.getCurrentHandler().text(value);
                                return ;
                            }
                            break;
                    }
                } catch (RuntimeException e) {
                    handleUnexpectedTextException(value, e);
                }
                break;
            }
        }

    }

}
