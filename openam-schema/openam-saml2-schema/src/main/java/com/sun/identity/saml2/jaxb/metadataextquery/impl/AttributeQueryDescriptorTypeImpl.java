//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.6-b27-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.06.11 at 10:34:07 AM PDT 
//


package com.sun.identity.saml2.jaxb.metadataextquery.impl;

public class AttributeQueryDescriptorTypeImpl
    extends com.sun.identity.saml2.jaxb.metadataextquery.impl.QueryDescriptorTypeImpl
    implements com.sun.identity.saml2.jaxb.metadataextquery.AttributeQueryDescriptorType, com.sun.xml.bind.JAXBObject, com.sun.identity.saml2.jaxb.assertion.impl.runtime.UnmarshallableObject, com.sun.identity.saml2.jaxb.assertion.impl.runtime.XMLSerializable, com.sun.identity.saml2.jaxb.assertion.impl.runtime.ValidatableObject
{

    protected com.sun.xml.bind.util.ListImpl _AttributeConsumingService;
    public final static Class version = (com.sun.identity.saml2.jaxb.metadataextquery.impl.JAXBVersion.class);
    private static com.sun.msv.grammar.Grammar schemaFragment;

    private final static Class PRIMARY_INTERFACE_CLASS() {
        return (com.sun.identity.saml2.jaxb.metadataextquery.AttributeQueryDescriptorType.class);
    }

    protected com.sun.xml.bind.util.ListImpl _getAttributeConsumingService() {
        if (_AttributeConsumingService == null) {
            _AttributeConsumingService = new com.sun.xml.bind.util.ListImpl(new java.util.ArrayList());
        }
        return _AttributeConsumingService;
    }

    public java.util.List getAttributeConsumingService() {
        return _getAttributeConsumingService();
    }

    public com.sun.identity.saml2.jaxb.assertion.impl.runtime.UnmarshallingEventHandler createUnmarshaller(com.sun.identity.saml2.jaxb.assertion.impl.runtime.UnmarshallingContext context) {
        return new com.sun.identity.saml2.jaxb.metadataextquery.impl.AttributeQueryDescriptorTypeImpl.Unmarshaller(context);
    }

    public void serializeBody(com.sun.identity.saml2.jaxb.assertion.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        int idx1 = 0;
        final int len1 = ((_AttributeConsumingService == null)? 0 :_AttributeConsumingService.size());
        super.serializeBody(context);
        while (idx1 != len1) {
            if (_AttributeConsumingService.get(idx1) instanceof javax.xml.bind.Element) {
                context.childAsBody(((com.sun.xml.bind.JAXBObject) _AttributeConsumingService.get(idx1 ++)), "AttributeConsumingService");
            } else {
                context.startElement("urn:oasis:names:tc:SAML:2.0:metadata", "AttributeConsumingService");
                int idx_0 = idx1;
                context.childAsURIs(((com.sun.xml.bind.JAXBObject) _AttributeConsumingService.get(idx_0 ++)), "AttributeConsumingService");
                context.endNamespaceDecls();
                int idx_1 = idx1;
                context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _AttributeConsumingService.get(idx_1 ++)), "AttributeConsumingService");
                context.endAttributes();
                context.childAsBody(((com.sun.xml.bind.JAXBObject) _AttributeConsumingService.get(idx1 ++)), "AttributeConsumingService");
                context.endElement();
            }
        }
    }

    public void serializeAttributes(com.sun.identity.saml2.jaxb.assertion.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        int idx1 = 0;
        final int len1 = ((_AttributeConsumingService == null)? 0 :_AttributeConsumingService.size());
        super.serializeAttributes(context);
        while (idx1 != len1) {
            if (_AttributeConsumingService.get(idx1) instanceof javax.xml.bind.Element) {
                context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _AttributeConsumingService.get(idx1 ++)), "AttributeConsumingService");
            } else {
                idx1 += 1;
            }
        }
    }

    public void serializeURIs(com.sun.identity.saml2.jaxb.assertion.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        int idx1 = 0;
        final int len1 = ((_AttributeConsumingService == null)? 0 :_AttributeConsumingService.size());
        super.serializeURIs(context);
        while (idx1 != len1) {
            if (_AttributeConsumingService.get(idx1) instanceof javax.xml.bind.Element) {
                context.childAsURIs(((com.sun.xml.bind.JAXBObject) _AttributeConsumingService.get(idx1 ++)), "AttributeConsumingService");
            } else {
                idx1 += 1;
            }
        }
    }

    public Class getPrimaryInterface() {
        return (com.sun.identity.saml2.jaxb.metadataextquery.AttributeQueryDescriptorType.class);
    }

    public com.sun.msv.verifier.DocumentDeclaration createRawValidator() {
        if (schemaFragment == null) {
            schemaFragment = com.sun.xml.bind.validator.SchemaDeserializer.deserialize((
 "\u00ac\u00ed\u0000\u0005sr\u0000\u001fcom.sun.msv.grammar.SequenceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.su"
+"n.msv.grammar.BinaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0004exp1t\u0000 Lcom/sun/msv/gra"
+"mmar/Expression;L\u0000\u0004exp2q\u0000~\u0000\u0002xr\u0000\u001ecom.sun.msv.grammar.Expressi"
+"on\u00f8\u0018\u0082\u00e8N5~O\u0002\u0000\u0002L\u0000\u0013epsilonReducibilityt\u0000\u0013Ljava/lang/Boolean;L\u0000\u000b"
+"expandedExpq\u0000~\u0000\u0002xpppsq\u0000~\u0000\u0000ppsq\u0000~\u0000\u0000ppsq\u0000~\u0000\u0000ppsq\u0000~\u0000\u0000ppsq\u0000~\u0000\u0000pp"
+"sq\u0000~\u0000\u0000ppsq\u0000~\u0000\u0000ppsq\u0000~\u0000\u0000ppsq\u0000~\u0000\u0000ppsq\u0000~\u0000\u0000ppsq\u0000~\u0000\u0000ppsr\u0000\u001dcom.sun."
+"msv.grammar.ChoiceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0001ppsq\u0000~\u0000\u0011sr\u0000\u0011java.lang."
+"Boolean\u00cd r\u0080\u00d5\u009c\u00fa\u00ee\u0002\u0000\u0001Z\u0000\u0005valuexp\u0000psr\u0000\'com.sun.msv.grammar.trex.E"
+"lementPattern\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\tnameClasst\u0000\u001fLcom/sun/msv/grammar/"
+"NameClass;xr\u0000\u001ecom.sun.msv.grammar.ElementExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002Z\u0000\u001aig"
+"noreUndeclaredAttributesL\u0000\fcontentModelq\u0000~\u0000\u0002xq\u0000~\u0000\u0003q\u0000~\u0000\u0015p\u0000sq\u0000"
+"~\u0000\u0011ppsr\u0000 com.sun.msv.grammar.OneOrMoreExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001ccom."
+"sun.msv.grammar.UnaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\u0003expq\u0000~\u0000\u0002xq\u0000~\u0000\u0003q\u0000~\u0000\u0015psr"
+"\u0000 com.sun.msv.grammar.AttributeExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0003expq\u0000~\u0000\u0002L\u0000\tn"
+"ameClassq\u0000~\u0000\u0017xq\u0000~\u0000\u0003q\u0000~\u0000\u0015psr\u00002com.sun.msv.grammar.Expression$"
+"AnyStringExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003sq\u0000~\u0000\u0014\u0001q\u0000~\u0000!sr\u0000 com.sun."
+"msv.grammar.AnyNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.sun.msv.grammar.N"
+"ameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpsr\u00000com.sun.msv.grammar.Expression$Epsi"
+"lonExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003q\u0000~\u0000\"q\u0000~\u0000\'sr\u0000#com.sun.msv.gram"
+"mar.SimpleNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\tlocalNamet\u0000\u0012Ljava/lang/Stri"
+"ng;L\u0000\fnamespaceURIq\u0000~\u0000)xq\u0000~\u0000$t\u00003com.sun.identity.saml2.jaxb."
+"xmlsig.SignatureElementt\u0000+http://java.sun.com/jaxb/xjc/dummy"
+"-elementssq\u0000~\u0000\u0016q\u0000~\u0000\u0015p\u0000sq\u0000~\u0000\u0000ppsq\u0000~\u0000\u0016pp\u0000sq\u0000~\u0000\u0011ppsq\u0000~\u0000\u001bq\u0000~\u0000\u0015ps"
+"q\u0000~\u0000\u001eq\u0000~\u0000\u0015pq\u0000~\u0000!q\u0000~\u0000%q\u0000~\u0000\'sq\u0000~\u0000(t\u00000com.sun.identity.saml2.ja"
+"xb.xmlsig.SignatureTypeq\u0000~\u0000,sq\u0000~\u0000\u0011ppsq\u0000~\u0000\u001eq\u0000~\u0000\u0015psr\u0000\u001bcom.sun."
+"msv.grammar.DataExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\u0002dtt\u0000\u001fLorg/relaxng/datatype/"
+"Datatype;L\u0000\u0006exceptq\u0000~\u0000\u0002L\u0000\u0004namet\u0000\u001dLcom/sun/msv/util/StringPai"
+"r;xq\u0000~\u0000\u0003ppsr\u0000\"com.sun.msv.datatype.xsd.QnameType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000x"
+"r\u0000*com.sun.msv.datatype.xsd.BuiltinAtomicType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000%"
+"com.sun.msv.datatype.xsd.ConcreteType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\'com.sun."
+"msv.datatype.xsd.XSDatatypeImpl\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\fnamespaceUriq\u0000~"
+"\u0000)L\u0000\btypeNameq\u0000~\u0000)L\u0000\nwhiteSpacet\u0000.Lcom/sun/msv/datatype/xsd/"
+"WhiteSpaceProcessor;xpt\u0000 http://www.w3.org/2001/XMLSchemat\u0000\u0005"
+"QNamesr\u00005com.sun.msv.datatype.xsd.WhiteSpaceProcessor$Collap"
+"se\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000,com.sun.msv.datatype.xsd.WhiteSpaceProcesso"
+"r\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpsr\u00000com.sun.msv.grammar.Expression$NullSetExpr"
+"ession\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003q\u0000~\u0000\u0015psr\u0000\u001bcom.sun.msv.util.StringPair"
+"\u00d0t\u001ejB\u008f\u008d\u00a0\u0002\u0000\u0002L\u0000\tlocalNameq\u0000~\u0000)L\u0000\fnamespaceURIq\u0000~\u0000)xpq\u0000~\u0000Bq\u0000~\u0000A"
+"sq\u0000~\u0000(t\u0000\u0004typet\u0000)http://www.w3.org/2001/XMLSchema-instanceq\u0000~"
+"\u0000\'sq\u0000~\u0000(t\u0000\tSignaturet\u0000\"http://www.w3.org/2000/09/xmldsig#q\u0000~"
+"\u0000\'sq\u0000~\u0000\u0011ppsq\u0000~\u0000\u0011q\u0000~\u0000\u0015psq\u0000~\u0000\u0016q\u0000~\u0000\u0015p\u0000sq\u0000~\u0000\u0011ppsq\u0000~\u0000\u001bq\u0000~\u0000\u0015psq\u0000~\u0000"
+"\u001eq\u0000~\u0000\u0015pq\u0000~\u0000!q\u0000~\u0000%q\u0000~\u0000\'sq\u0000~\u0000(t\u00006com.sun.identity.saml2.jaxb.m"
+"etadata.ExtensionsElementq\u0000~\u0000,sq\u0000~\u0000\u0016q\u0000~\u0000\u0015p\u0000sq\u0000~\u0000\u0000ppsq\u0000~\u0000\u0016pp\u0000"
+"sq\u0000~\u0000\u0011ppsq\u0000~\u0000\u001bq\u0000~\u0000\u0015psq\u0000~\u0000\u001eq\u0000~\u0000\u0015pq\u0000~\u0000!q\u0000~\u0000%q\u0000~\u0000\'sq\u0000~\u0000(t\u00003com."
+"sun.identity.saml2.jaxb.metadata.ExtensionsTypeq\u0000~\u0000,sq\u0000~\u0000\u0011pp"
+"sq\u0000~\u0000\u001eq\u0000~\u0000\u0015pq\u0000~\u0000:q\u0000~\u0000Jq\u0000~\u0000\'sq\u0000~\u0000(t\u0000\nExtensionst\u0000$urn:oasis:n"
+"ames:tc:SAML:2.0:metadataq\u0000~\u0000\'sq\u0000~\u0000\u0011ppsq\u0000~\u0000\u001bq\u0000~\u0000\u0015psq\u0000~\u0000\u0011q\u0000~\u0000"
+"\u0015psq\u0000~\u0000\u0016q\u0000~\u0000\u0015p\u0000sq\u0000~\u0000\u0011ppsq\u0000~\u0000\u001bq\u0000~\u0000\u0015psq\u0000~\u0000\u001eq\u0000~\u0000\u0015pq\u0000~\u0000!q\u0000~\u0000%q\u0000~"
+"\u0000\'sq\u0000~\u0000(t\u00009com.sun.identity.saml2.jaxb.metadata.KeyDescripto"
+"rElementq\u0000~\u0000,sq\u0000~\u0000\u0016q\u0000~\u0000\u0015p\u0000sq\u0000~\u0000\u0000ppsq\u0000~\u0000\u0016pp\u0000sq\u0000~\u0000\u0011ppsq\u0000~\u0000\u001bq\u0000~"
+"\u0000\u0015psq\u0000~\u0000\u001eq\u0000~\u0000\u0015pq\u0000~\u0000!q\u0000~\u0000%q\u0000~\u0000\'sq\u0000~\u0000(t\u00006com.sun.identity.saml"
+"2.jaxb.metadata.KeyDescriptorTypeq\u0000~\u0000,sq\u0000~\u0000\u0011ppsq\u0000~\u0000\u001eq\u0000~\u0000\u0015pq\u0000"
+"~\u0000:q\u0000~\u0000Jq\u0000~\u0000\'sq\u0000~\u0000(t\u0000\rKeyDescriptorq\u0000~\u0000dq\u0000~\u0000\'sq\u0000~\u0000\u0011ppsq\u0000~\u0000\u0011q"
+"\u0000~\u0000\u0015psq\u0000~\u0000\u0016q\u0000~\u0000\u0015p\u0000sq\u0000~\u0000\u0011ppsq\u0000~\u0000\u001bq\u0000~\u0000\u0015psq\u0000~\u0000\u001eq\u0000~\u0000\u0015pq\u0000~\u0000!q\u0000~\u0000%"
+"q\u0000~\u0000\'sq\u0000~\u0000(t\u00008com.sun.identity.saml2.jaxb.metadata.Organizat"
+"ionElementq\u0000~\u0000,sq\u0000~\u0000\u0016q\u0000~\u0000\u0015p\u0000sq\u0000~\u0000\u0000ppsq\u0000~\u0000\u0016pp\u0000sq\u0000~\u0000\u0011ppsq\u0000~\u0000\u001bq"
+"\u0000~\u0000\u0015psq\u0000~\u0000\u001eq\u0000~\u0000\u0015pq\u0000~\u0000!q\u0000~\u0000%q\u0000~\u0000\'sq\u0000~\u0000(t\u00005com.sun.identity.sa"
+"ml2.jaxb.metadata.OrganizationTypeq\u0000~\u0000,sq\u0000~\u0000\u0011ppsq\u0000~\u0000\u001eq\u0000~\u0000\u0015pq"
+"\u0000~\u0000:q\u0000~\u0000Jq\u0000~\u0000\'sq\u0000~\u0000(t\u0000\fOrganizationq\u0000~\u0000dq\u0000~\u0000\'sq\u0000~\u0000\u0011ppsq\u0000~\u0000\u001bq"
+"\u0000~\u0000\u0015psq\u0000~\u0000\u0011q\u0000~\u0000\u0015psq\u0000~\u0000\u0016q\u0000~\u0000\u0015p\u0000sq\u0000~\u0000\u0011ppsq\u0000~\u0000\u001bq\u0000~\u0000\u0015psq\u0000~\u0000\u001eq\u0000~\u0000"
+"\u0015pq\u0000~\u0000!q\u0000~\u0000%q\u0000~\u0000\'sq\u0000~\u0000(t\u00009com.sun.identity.saml2.jaxb.metada"
+"ta.ContactPersonElementq\u0000~\u0000,sq\u0000~\u0000\u0016q\u0000~\u0000\u0015p\u0000sq\u0000~\u0000\u0000ppsq\u0000~\u0000\u0016pp\u0000sq"
+"\u0000~\u0000\u0011ppsq\u0000~\u0000\u001bq\u0000~\u0000\u0015psq\u0000~\u0000\u001eq\u0000~\u0000\u0015pq\u0000~\u0000!q\u0000~\u0000%q\u0000~\u0000\'sq\u0000~\u0000(t\u00000com.su"
+"n.identity.saml2.jaxb.metadata.ContactTypeq\u0000~\u0000,sq\u0000~\u0000\u0011ppsq\u0000~\u0000"
+"\u001eq\u0000~\u0000\u0015pq\u0000~\u0000:q\u0000~\u0000Jq\u0000~\u0000\'sq\u0000~\u0000(t\u0000\rContactPersonq\u0000~\u0000dq\u0000~\u0000\'sq\u0000~\u0000\u0011"
+"ppsq\u0000~\u0000\u001bq\u0000~\u0000\u0015psq\u0000~\u0000\u0016q\u0000~\u0000\u0015p\u0000sq\u0000~\u0000\u0000ppsq\u0000~\u00007q\u0000~\u0000\u0015psr\u0000#com.sun.m"
+"sv.datatype.xsd.AnyURIType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000<q\u0000~\u0000At\u0000\u0006anyURIq\u0000~"
+"\u0000Eq\u0000~\u0000Gsq\u0000~\u0000Hq\u0000~\u0000\u00aaq\u0000~\u0000Asq\u0000~\u0000\u0011ppsq\u0000~\u0000\u001eq\u0000~\u0000\u0015pq\u0000~\u0000:q\u0000~\u0000Jq\u0000~\u0000\'sq"
+"\u0000~\u0000(t\u0000\fNameIDFormatq\u0000~\u0000dq\u0000~\u0000\'sq\u0000~\u0000\u0011ppsq\u0000~\u0000\u001bq\u0000~\u0000\u0015psq\u0000~\u0000\u0011q\u0000~\u0000\u0015"
+"psq\u0000~\u0000\u0016q\u0000~\u0000\u0015p\u0000sq\u0000~\u0000\u0011ppsq\u0000~\u0000\u001bq\u0000~\u0000\u0015psq\u0000~\u0000\u001eq\u0000~\u0000\u0015pq\u0000~\u0000!q\u0000~\u0000%q\u0000~\u0000"
+"\'sq\u0000~\u0000(t\u0000Ecom.sun.identity.saml2.jaxb.metadata.AttributeCons"
+"umingServiceElementq\u0000~\u0000,sq\u0000~\u0000\u0016q\u0000~\u0000\u0015p\u0000sq\u0000~\u0000\u0000ppsq\u0000~\u0000\u0016pp\u0000sq\u0000~\u0000\u0011"
+"ppsq\u0000~\u0000\u001bq\u0000~\u0000\u0015psq\u0000~\u0000\u001eq\u0000~\u0000\u0015pq\u0000~\u0000!q\u0000~\u0000%q\u0000~\u0000\'sq\u0000~\u0000(t\u0000Bcom.sun.id"
+"entity.saml2.jaxb.metadata.AttributeConsumingServiceTypeq\u0000~\u0000"
+",sq\u0000~\u0000\u0011ppsq\u0000~\u0000\u001eq\u0000~\u0000\u0015pq\u0000~\u0000:q\u0000~\u0000Jq\u0000~\u0000\'sq\u0000~\u0000(t\u0000\u0019AttributeConsum"
+"ingServiceq\u0000~\u0000dq\u0000~\u0000\'sq\u0000~\u0000\u0011ppsq\u0000~\u0000\u001eq\u0000~\u0000\u0015psq\u0000~\u00007ppsr\u0000\u001fcom.sun."
+"msv.datatype.xsd.IDType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000#com.sun.msv.datatype.x"
+"sd.NcnameType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\"com.sun.msv.datatype.xsd.TokenTy"
+"pe\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000#com.sun.msv.datatype.xsd.StringType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001"
+"\u0002\u0000\u0001Z\u0000\risAlwaysValidxq\u0000~\u0000<q\u0000~\u0000At\u0000\u0002IDq\u0000~\u0000E\u0000q\u0000~\u0000Gsq\u0000~\u0000Hq\u0000~\u0000\u00cdq\u0000~"
+"\u0000Asq\u0000~\u0000(t\u0000\u0002IDt\u0000\u0000q\u0000~\u0000\'sq\u0000~\u0000\u0011ppsq\u0000~\u0000\u001eq\u0000~\u0000\u0015psq\u0000~\u00007ppsr\u0000%com.sun"
+".msv.datatype.xsd.DurationType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000<q\u0000~\u0000At\u0000\bdurat"
+"ionq\u0000~\u0000Eq\u0000~\u0000Gsq\u0000~\u0000Hq\u0000~\u0000\u00d7q\u0000~\u0000Asq\u0000~\u0000(t\u0000\rcacheDurationq\u0000~\u0000\u00d1q\u0000~\u0000"
+"\'sq\u0000~\u0000\u0011ppsq\u0000~\u0000\u001eq\u0000~\u0000\u0015pq\u0000~\u0000\u00a7sq\u0000~\u0000(t\u0000\berrorURLq\u0000~\u0000\u00d1q\u0000~\u0000\'sq\u0000~\u0000\u001ep"
+"psq\u0000~\u00007ppsr\u0000!com.sun.msv.datatype.xsd.ListType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\b"
+"itemTypet\u0000)Lcom/sun/msv/datatype/xsd/XSDatatypeImpl;xq\u0000~\u0000=q\u0000"
+"~\u0000dt\u0000\u000eanyURIListTypeq\u0000~\u0000Eq\u0000~\u0000\u00a9q\u0000~\u0000Gpsq\u0000~\u0000(t\u0000\u001aprotocolSupport"
+"Enumerationq\u0000~\u0000\u00d1sq\u0000~\u0000\u0011ppsq\u0000~\u0000\u001eq\u0000~\u0000\u0015psq\u0000~\u00007ppsr\u0000%com.sun.msv."
+"datatype.xsd.DateTimeType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000)com.sun.msv.datatype"
+".xsd.DateTimeBaseType\u0014W\u001a@3\u00a5\u00b4\u00e5\u0002\u0000\u0000xq\u0000~\u0000<q\u0000~\u0000At\u0000\bdateTimeq\u0000~\u0000Eq"
+"\u0000~\u0000Gsq\u0000~\u0000Hq\u0000~\u0000\u00edq\u0000~\u0000Asq\u0000~\u0000(t\u0000\nvalidUntilq\u0000~\u0000\u00d1q\u0000~\u0000\'sq\u0000~\u0000\u0011ppsq\u0000"
+"~\u0000\u001eq\u0000~\u0000\u0015psq\u0000~\u00007ppsr\u0000$com.sun.msv.datatype.xsd.BooleanType\u0000\u0000\u0000"
+"\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000<q\u0000~\u0000At\u0000\u0007booleanq\u0000~\u0000Eq\u0000~\u0000Gsq\u0000~\u0000Hq\u0000~\u0000\u00f6q\u0000~\u0000Asq\u0000~\u0000"
+"(t\u0000\u0014WantAssertionsSignedq\u0000~\u0000\u00d1q\u0000~\u0000\'sr\u0000\"com.sun.msv.grammar.Ex"
+"pressionPool\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\bexpTablet\u0000/Lcom/sun/msv/grammar/Ex"
+"pressionPool$ClosedHash;xpsr\u0000-com.sun.msv.grammar.Expression"
+"Pool$ClosedHash\u00d7j\u00d0N\u00ef\u00e8\u00ed\u001c\u0003\u0000\u0003I\u0000\u0005countB\u0000\rstreamVersionL\u0000\u0006parentt"
+"\u0000$Lcom/sun/msv/grammar/ExpressionPool;xp\u0000\u0000\u0000H\u0001pq\u0000~\u0000rq\u0000~\u0000jq\u0000~\u0000"
+"\\q\u0000~\u0000Tq\u0000~\u00001q\u0000~\u0000\u001dq\u0000~\u0000\u00a3q\u0000~\u0000\u00dbq\u0000~\u0000\u008fq\u0000~\u0000fq\u0000~\u0000\u00b1q\u0000~\u0000\u00bcq\u0000~\u0000\u00b4q\u0000~\u0000\u009aq\u0000~\u0000"
+"\u0092q\u0000~\u0000\u0085q\u0000~\u0000}q\u0000~\u0000qq\u0000~\u0000iq\u0000~\u0000[q\u0000~\u0000Sq\u0000~\u00000q\u0000~\u0000\u001aq\u0000~\u0000\tq\u0000~\u0000\u00f1q\u0000~\u0000\u00baq\u0000~\u0000"
+"\u0098q\u0000~\u0000\u0083q\u0000~\u0000oq\u0000~\u0000Yq\u0000~\u0000.q\u0000~\u0000zq\u0000~\u0000Pq\u0000~\u0000\u0012q\u0000~\u0000\u008eq\u0000~\u0000eq\u0000~\u0000\u00b0q\u0000~\u0000\u0090q\u0000~\u0000"
+"{q\u0000~\u0000gq\u0000~\u0000Qq\u0000~\u0000\u0013q\u0000~\u0000\u00b2q\u0000~\u0000\u0006q\u0000~\u0000\u00c5q\u0000~\u0000\u0005q\u0000~\u0000\fq\u0000~\u0000\nq\u0000~\u0000\u00e7q\u0000~\u0000\u00c1q\u0000~\u0000"
+"\u00acq\u0000~\u0000\u009fq\u0000~\u0000\u008aq\u0000~\u0000vq\u0000~\u0000`q\u0000~\u00005q\u0000~\u0000\u00d2q\u0000~\u0000\rq\u0000~\u0000\u0010q\u0000~\u0000\bq\u0000~\u0000\u000eq\u0000~\u0000\u00a6q\u0000~\u0000"
+"\u0007q\u0000~\u0000\u000fq\u0000~\u0000\u000bq\u0000~\u0000\u00a4q\u0000~\u0000\u00bdq\u0000~\u0000\u00b5q\u0000~\u0000\u009bq\u0000~\u0000\u0093q\u0000~\u0000\u0086q\u0000~\u0000~x"));
        }
        return new com.sun.msv.verifier.regexp.REDocumentDeclaration(schemaFragment);
    }

    public class Unmarshaller
        extends com.sun.identity.saml2.jaxb.assertion.impl.runtime.AbstractUnmarshallingEventHandlerImpl
    {


        public Unmarshaller(com.sun.identity.saml2.jaxb.assertion.impl.runtime.UnmarshallingContext context) {
            super(context, "-----");
        }

        protected Unmarshaller(com.sun.identity.saml2.jaxb.assertion.impl.runtime.UnmarshallingContext context, int startState) {
            this(context);
            state = startState;
        }

        public Object owner() {
            return com.sun.identity.saml2.jaxb.metadataextquery.impl.AttributeQueryDescriptorTypeImpl.this;
        }

        public void enterElement(String ___uri, String ___local, String ___qname, org.xml.sax.Attributes __atts)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  1 :
                        if (("AttributeConsumingService" == ___local)&&("urn:oasis:names:tc:SAML:2.0:metadata" == ___uri)) {
                            _getAttributeConsumingService().add(((com.sun.identity.saml2.jaxb.metadata.impl.AttributeConsumingServiceElementImpl) spawnChildFromEnterElement((com.sun.identity.saml2.jaxb.metadata.impl.AttributeConsumingServiceElementImpl.class), 4, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("AttributeConsumingService" == ___local)&&("urn:oasis:names:tc:SAML:2.0:metadata" == ___uri)) {
                            context.pushAttributes(__atts, false);
                            state = 2;
                            return ;
                        }
                        state = 4;
                        continue outer;
                    case  2 :
                        attIdx = context.getAttribute("", "index");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().enterElement(___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        break;
                    case  0 :
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
                    case  4 :
                        if (("AttributeConsumingService" == ___local)&&("urn:oasis:names:tc:SAML:2.0:metadata" == ___uri)) {
                            _getAttributeConsumingService().add(((com.sun.identity.saml2.jaxb.metadata.impl.AttributeConsumingServiceElementImpl) spawnChildFromEnterElement((com.sun.identity.saml2.jaxb.metadata.impl.AttributeConsumingServiceElementImpl.class), 4, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("AttributeConsumingService" == ___local)&&("urn:oasis:names:tc:SAML:2.0:metadata" == ___uri)) {
                            context.pushAttributes(__atts, false);
                            state = 2;
                            return ;
                        }
                        revertToParentFromEnterElement(___uri, ___local, ___qname, __atts);
                        return ;
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
                    case  1 :
                        state = 4;
                        continue outer;
                    case  3 :
                        if (("AttributeConsumingService" == ___local)&&("urn:oasis:names:tc:SAML:2.0:metadata" == ___uri)) {
                            context.popAttributes();
                            state = 4;
                            return ;
                        }
                        break;
                    case  2 :
                        attIdx = context.getAttribute("", "index");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveElement(___uri, ___local, ___qname);
                            return ;
                        }
                        break;
                    case  0 :
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
                    case  4 :
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
                    case  1 :
                        state = 4;
                        continue outer;
                    case  2 :
                        if (("index" == ___local)&&("" == ___uri)) {
                            _getAttributeConsumingService().add(((com.sun.identity.saml2.jaxb.metadata.impl.AttributeConsumingServiceTypeImpl) spawnChildFromEnterAttribute((com.sun.identity.saml2.jaxb.metadata.impl.AttributeConsumingServiceTypeImpl.class), 3, ___uri, ___local, ___qname)));
                            return ;
                        }
                        break;
                    case  0 :
                        if (("WantAssertionsSigned" == ___local)&&("" == ___uri)) {
                            spawnHandlerFromEnterAttribute((((com.sun.identity.saml2.jaxb.metadataextquery.impl.QueryDescriptorTypeImpl)com.sun.identity.saml2.jaxb.metadataextquery.impl.AttributeQueryDescriptorTypeImpl.this).new Unmarshaller(context)), 1, ___uri, ___local, ___qname);
                            return ;
                        }
                        if (("ID" == ___local)&&("" == ___uri)) {
                            spawnHandlerFromEnterAttribute((((com.sun.identity.saml2.jaxb.metadataextquery.impl.QueryDescriptorTypeImpl)com.sun.identity.saml2.jaxb.metadataextquery.impl.AttributeQueryDescriptorTypeImpl.this).new Unmarshaller(context)), 1, ___uri, ___local, ___qname);
                            return ;
                        }
                        if (("cacheDuration" == ___local)&&("" == ___uri)) {
                            spawnHandlerFromEnterAttribute((((com.sun.identity.saml2.jaxb.metadataextquery.impl.QueryDescriptorTypeImpl)com.sun.identity.saml2.jaxb.metadataextquery.impl.AttributeQueryDescriptorTypeImpl.this).new Unmarshaller(context)), 1, ___uri, ___local, ___qname);
                            return ;
                        }
                        if (("errorURL" == ___local)&&("" == ___uri)) {
                            spawnHandlerFromEnterAttribute((((com.sun.identity.saml2.jaxb.metadataextquery.impl.QueryDescriptorTypeImpl)com.sun.identity.saml2.jaxb.metadataextquery.impl.AttributeQueryDescriptorTypeImpl.this).new Unmarshaller(context)), 1, ___uri, ___local, ___qname);
                            return ;
                        }
                        if (("protocolSupportEnumeration" == ___local)&&("" == ___uri)) {
                            spawnHandlerFromEnterAttribute((((com.sun.identity.saml2.jaxb.metadataextquery.impl.QueryDescriptorTypeImpl)com.sun.identity.saml2.jaxb.metadataextquery.impl.AttributeQueryDescriptorTypeImpl.this).new Unmarshaller(context)), 1, ___uri, ___local, ___qname);
                            return ;
                        }
                        break;
                    case  4 :
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
                    case  1 :
                        state = 4;
                        continue outer;
                    case  2 :
                        attIdx = context.getAttribute("", "index");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveAttribute(___uri, ___local, ___qname);
                            return ;
                        }
                        break;
                    case  0 :
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
                    case  4 :
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
                        case  1 :
                            state = 4;
                            continue outer;
                        case  2 :
                            attIdx = context.getAttribute("", "index");
                            if (attIdx >= 0) {
                                context.consumeAttribute(attIdx);
                                context.getCurrentHandler().text(value);
                                return ;
                            }
                            break;
                        case  0 :
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
                        case  4 :
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
