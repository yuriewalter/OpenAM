//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.6-b27-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.06.11 at 10:34:07 AM PDT 
//


package com.sun.identity.saml2.jaxb.metadata.impl;

public class OrganizationTypeImpl implements com.sun.identity.saml2.jaxb.metadata.OrganizationType, com.sun.xml.bind.JAXBObject, com.sun.identity.saml2.jaxb.assertion.impl.runtime.UnmarshallableObject, com.sun.identity.saml2.jaxb.assertion.impl.runtime.XMLSerializable, com.sun.identity.saml2.jaxb.assertion.impl.runtime.ValidatableObject
{

    protected com.sun.identity.saml2.jaxb.metadata.ExtensionsType _Extensions;
    protected com.sun.xml.bind.util.ListImpl _OrganizationDisplayName;
    protected com.sun.xml.bind.util.ListImpl _OrganizationURL;
    protected com.sun.xml.bind.util.ListImpl _OrganizationName;
    public final static Class version = (com.sun.identity.saml2.jaxb.metadata.impl.JAXBVersion.class);
    private static com.sun.msv.grammar.Grammar schemaFragment;

    private final static Class PRIMARY_INTERFACE_CLASS() {
        return (com.sun.identity.saml2.jaxb.metadata.OrganizationType.class);
    }

    public com.sun.identity.saml2.jaxb.metadata.ExtensionsType getExtensions() {
        return _Extensions;
    }

    public void setExtensions(com.sun.identity.saml2.jaxb.metadata.ExtensionsType value) {
        _Extensions = value;
    }

    protected com.sun.xml.bind.util.ListImpl _getOrganizationDisplayName() {
        if (_OrganizationDisplayName == null) {
            _OrganizationDisplayName = new com.sun.xml.bind.util.ListImpl(new java.util.ArrayList());
        }
        return _OrganizationDisplayName;
    }

    public java.util.List getOrganizationDisplayName() {
        return _getOrganizationDisplayName();
    }

    protected com.sun.xml.bind.util.ListImpl _getOrganizationURL() {
        if (_OrganizationURL == null) {
            _OrganizationURL = new com.sun.xml.bind.util.ListImpl(new java.util.ArrayList());
        }
        return _OrganizationURL;
    }

    public java.util.List getOrganizationURL() {
        return _getOrganizationURL();
    }

    protected com.sun.xml.bind.util.ListImpl _getOrganizationName() {
        if (_OrganizationName == null) {
            _OrganizationName = new com.sun.xml.bind.util.ListImpl(new java.util.ArrayList());
        }
        return _OrganizationName;
    }

    public java.util.List getOrganizationName() {
        return _getOrganizationName();
    }

    public com.sun.identity.saml2.jaxb.assertion.impl.runtime.UnmarshallingEventHandler createUnmarshaller(com.sun.identity.saml2.jaxb.assertion.impl.runtime.UnmarshallingContext context) {
        return new com.sun.identity.saml2.jaxb.metadata.impl.OrganizationTypeImpl.Unmarshaller(context);
    }

    public void serializeBody(com.sun.identity.saml2.jaxb.assertion.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        int idx2 = 0;
        final int len2 = ((_OrganizationDisplayName == null)? 0 :_OrganizationDisplayName.size());
        int idx3 = 0;
        final int len3 = ((_OrganizationURL == null)? 0 :_OrganizationURL.size());
        int idx4 = 0;
        final int len4 = ((_OrganizationName == null)? 0 :_OrganizationName.size());
        if (_Extensions!= null) {
            if (_Extensions instanceof javax.xml.bind.Element) {
                context.childAsBody(((com.sun.xml.bind.JAXBObject) _Extensions), "Extensions");
            } else {
                context.startElement("urn:oasis:names:tc:SAML:2.0:metadata", "Extensions");
                context.childAsURIs(((com.sun.xml.bind.JAXBObject) _Extensions), "Extensions");
                context.endNamespaceDecls();
                context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _Extensions), "Extensions");
                context.endAttributes();
                context.childAsBody(((com.sun.xml.bind.JAXBObject) _Extensions), "Extensions");
                context.endElement();
            }
        }
        while (idx4 != len4) {
            if (_OrganizationName.get(idx4) instanceof javax.xml.bind.Element) {
                context.childAsBody(((com.sun.xml.bind.JAXBObject) _OrganizationName.get(idx4 ++)), "OrganizationName");
            } else {
                context.startElement("urn:oasis:names:tc:SAML:2.0:metadata", "OrganizationName");
                int idx_2 = idx4;
                context.childAsURIs(((com.sun.xml.bind.JAXBObject) _OrganizationName.get(idx_2 ++)), "OrganizationName");
                context.endNamespaceDecls();
                int idx_3 = idx4;
                context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _OrganizationName.get(idx_3 ++)), "OrganizationName");
                context.endAttributes();
                context.childAsBody(((com.sun.xml.bind.JAXBObject) _OrganizationName.get(idx4 ++)), "OrganizationName");
                context.endElement();
            }
        }
        while (idx2 != len2) {
            if (_OrganizationDisplayName.get(idx2) instanceof javax.xml.bind.Element) {
                context.childAsBody(((com.sun.xml.bind.JAXBObject) _OrganizationDisplayName.get(idx2 ++)), "OrganizationDisplayName");
            } else {
                context.startElement("urn:oasis:names:tc:SAML:2.0:metadata", "OrganizationDisplayName");
                int idx_4 = idx2;
                context.childAsURIs(((com.sun.xml.bind.JAXBObject) _OrganizationDisplayName.get(idx_4 ++)), "OrganizationDisplayName");
                context.endNamespaceDecls();
                int idx_5 = idx2;
                context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _OrganizationDisplayName.get(idx_5 ++)), "OrganizationDisplayName");
                context.endAttributes();
                context.childAsBody(((com.sun.xml.bind.JAXBObject) _OrganizationDisplayName.get(idx2 ++)), "OrganizationDisplayName");
                context.endElement();
            }
        }
        while (idx3 != len3) {
            if (_OrganizationURL.get(idx3) instanceof javax.xml.bind.Element) {
                context.childAsBody(((com.sun.xml.bind.JAXBObject) _OrganizationURL.get(idx3 ++)), "OrganizationURL");
            } else {
                context.startElement("urn:oasis:names:tc:SAML:2.0:metadata", "OrganizationURL");
                int idx_6 = idx3;
                context.childAsURIs(((com.sun.xml.bind.JAXBObject) _OrganizationURL.get(idx_6 ++)), "OrganizationURL");
                context.endNamespaceDecls();
                int idx_7 = idx3;
                context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _OrganizationURL.get(idx_7 ++)), "OrganizationURL");
                context.endAttributes();
                context.childAsBody(((com.sun.xml.bind.JAXBObject) _OrganizationURL.get(idx3 ++)), "OrganizationURL");
                context.endElement();
            }
        }
    }

    public void serializeAttributes(com.sun.identity.saml2.jaxb.assertion.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        int idx2 = 0;
        final int len2 = ((_OrganizationDisplayName == null)? 0 :_OrganizationDisplayName.size());
        int idx3 = 0;
        final int len3 = ((_OrganizationURL == null)? 0 :_OrganizationURL.size());
        int idx4 = 0;
        final int len4 = ((_OrganizationName == null)? 0 :_OrganizationName.size());
        if (_Extensions!= null) {
            if (_Extensions instanceof javax.xml.bind.Element) {
                context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _Extensions), "Extensions");
            }
        }
        while (idx4 != len4) {
            if (_OrganizationName.get(idx4) instanceof javax.xml.bind.Element) {
                context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _OrganizationName.get(idx4 ++)), "OrganizationName");
            } else {
                idx4 += 1;
            }
        }
        while (idx2 != len2) {
            if (_OrganizationDisplayName.get(idx2) instanceof javax.xml.bind.Element) {
                context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _OrganizationDisplayName.get(idx2 ++)), "OrganizationDisplayName");
            } else {
                idx2 += 1;
            }
        }
        while (idx3 != len3) {
            if (_OrganizationURL.get(idx3) instanceof javax.xml.bind.Element) {
                context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _OrganizationURL.get(idx3 ++)), "OrganizationURL");
            } else {
                idx3 += 1;
            }
        }
    }

    public void serializeURIs(com.sun.identity.saml2.jaxb.assertion.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        int idx2 = 0;
        final int len2 = ((_OrganizationDisplayName == null)? 0 :_OrganizationDisplayName.size());
        int idx3 = 0;
        final int len3 = ((_OrganizationURL == null)? 0 :_OrganizationURL.size());
        int idx4 = 0;
        final int len4 = ((_OrganizationName == null)? 0 :_OrganizationName.size());
        if (_Extensions!= null) {
            if (_Extensions instanceof javax.xml.bind.Element) {
                context.childAsURIs(((com.sun.xml.bind.JAXBObject) _Extensions), "Extensions");
            }
        }
        while (idx4 != len4) {
            if (_OrganizationName.get(idx4) instanceof javax.xml.bind.Element) {
                context.childAsURIs(((com.sun.xml.bind.JAXBObject) _OrganizationName.get(idx4 ++)), "OrganizationName");
            } else {
                idx4 += 1;
            }
        }
        while (idx2 != len2) {
            if (_OrganizationDisplayName.get(idx2) instanceof javax.xml.bind.Element) {
                context.childAsURIs(((com.sun.xml.bind.JAXBObject) _OrganizationDisplayName.get(idx2 ++)), "OrganizationDisplayName");
            } else {
                idx2 += 1;
            }
        }
        while (idx3 != len3) {
            if (_OrganizationURL.get(idx3) instanceof javax.xml.bind.Element) {
                context.childAsURIs(((com.sun.xml.bind.JAXBObject) _OrganizationURL.get(idx3 ++)), "OrganizationURL");
            } else {
                idx3 += 1;
            }
        }
    }

    public Class getPrimaryInterface() {
        return (com.sun.identity.saml2.jaxb.metadata.OrganizationType.class);
    }

    public com.sun.msv.verifier.DocumentDeclaration createRawValidator() {
        if (schemaFragment == null) {
            schemaFragment = com.sun.xml.bind.validator.SchemaDeserializer.deserialize((
 "\u00ac\u00ed\u0000\u0005sr\u0000\u001fcom.sun.msv.grammar.SequenceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.su"
+"n.msv.grammar.BinaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0004exp1t\u0000 Lcom/sun/msv/gra"
+"mmar/Expression;L\u0000\u0004exp2q\u0000~\u0000\u0002xr\u0000\u001ecom.sun.msv.grammar.Expressi"
+"on\u00f8\u0018\u0082\u00e8N5~O\u0002\u0000\u0002L\u0000\u0013epsilonReducibilityt\u0000\u0013Ljava/lang/Boolean;L\u0000\u000b"
+"expandedExpq\u0000~\u0000\u0002xpppsq\u0000~\u0000\u0000ppsq\u0000~\u0000\u0000ppsr\u0000\u001dcom.sun.msv.grammar."
+"ChoiceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0001ppsq\u0000~\u0000\bsr\u0000\u0011java.lang.Boolean\u00cd r\u0080\u00d5"
+"\u009c\u00fa\u00ee\u0002\u0000\u0001Z\u0000\u0005valuexp\u0000psr\u0000\'com.sun.msv.grammar.trex.ElementPatter"
+"n\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\tnameClasst\u0000\u001fLcom/sun/msv/grammar/NameClass;xr"
+"\u0000\u001ecom.sun.msv.grammar.ElementExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002Z\u0000\u001aignoreUndeclar"
+"edAttributesL\u0000\fcontentModelq\u0000~\u0000\u0002xq\u0000~\u0000\u0003q\u0000~\u0000\fp\u0000sq\u0000~\u0000\bppsr\u0000 com"
+".sun.msv.grammar.OneOrMoreExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001ccom.sun.msv.gram"
+"mar.UnaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\u0003expq\u0000~\u0000\u0002xq\u0000~\u0000\u0003q\u0000~\u0000\fpsr\u0000 com.sun.ms"
+"v.grammar.AttributeExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0003expq\u0000~\u0000\u0002L\u0000\tnameClassq\u0000~\u0000"
+"\u000exq\u0000~\u0000\u0003q\u0000~\u0000\fpsr\u00002com.sun.msv.grammar.Expression$AnyStringExp"
+"ression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003sq\u0000~\u0000\u000b\u0001q\u0000~\u0000\u0018sr\u0000 com.sun.msv.grammar."
+"AnyNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.sun.msv.grammar.NameClass\u0000\u0000\u0000\u0000"
+"\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpsr\u00000com.sun.msv.grammar.Expression$EpsilonExpressio"
+"n\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003q\u0000~\u0000\u0019q\u0000~\u0000\u001esr\u0000#com.sun.msv.grammar.SimpleNa"
+"meClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\tlocalNamet\u0000\u0012Ljava/lang/String;L\u0000\fnamesp"
+"aceURIq\u0000~\u0000 xq\u0000~\u0000\u001bt\u00006com.sun.identity.saml2.jaxb.metadata.Ext"
+"ensionsElementt\u0000+http://java.sun.com/jaxb/xjc/dummy-elements"
+"sq\u0000~\u0000\rq\u0000~\u0000\fp\u0000sq\u0000~\u0000\u0000ppsq\u0000~\u0000\rpp\u0000sq\u0000~\u0000\bppsq\u0000~\u0000\u0012q\u0000~\u0000\fpsq\u0000~\u0000\u0015q\u0000~\u0000"
+"\fpq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u00003com.sun.identity.saml2.jaxb.metada"
+"ta.ExtensionsTypeq\u0000~\u0000#sq\u0000~\u0000\bppsq\u0000~\u0000\u0015q\u0000~\u0000\fpsr\u0000\u001bcom.sun.msv.gr"
+"ammar.DataExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\u0002dtt\u0000\u001fLorg/relaxng/datatype/Dataty"
+"pe;L\u0000\u0006exceptq\u0000~\u0000\u0002L\u0000\u0004namet\u0000\u001dLcom/sun/msv/util/StringPair;xq\u0000~"
+"\u0000\u0003ppsr\u0000\"com.sun.msv.datatype.xsd.QnameType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000*com"
+".sun.msv.datatype.xsd.BuiltinAtomicType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000%com.su"
+"n.msv.datatype.xsd.ConcreteType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\'com.sun.msv.da"
+"tatype.xsd.XSDatatypeImpl\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\fnamespaceUriq\u0000~\u0000 L\u0000\bt"
+"ypeNameq\u0000~\u0000 L\u0000\nwhiteSpacet\u0000.Lcom/sun/msv/datatype/xsd/WhiteS"
+"paceProcessor;xpt\u0000 http://www.w3.org/2001/XMLSchemat\u0000\u0005QNames"
+"r\u00005com.sun.msv.datatype.xsd.WhiteSpaceProcessor$Collapse\u0000\u0000\u0000\u0000"
+"\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000,com.sun.msv.datatype.xsd.WhiteSpaceProcessor\u0000\u0000\u0000\u0000\u0000"
+"\u0000\u0000\u0001\u0002\u0000\u0000xpsr\u00000com.sun.msv.grammar.Expression$NullSetExpression"
+"\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003q\u0000~\u0000\fpsr\u0000\u001bcom.sun.msv.util.StringPair\u00d0t\u001ejB\u008f"
+"\u008d\u00a0\u0002\u0000\u0002L\u0000\tlocalNameq\u0000~\u0000 L\u0000\fnamespaceURIq\u0000~\u0000 xpq\u0000~\u00009q\u0000~\u00008sq\u0000~\u0000\u001f"
+"t\u0000\u0004typet\u0000)http://www.w3.org/2001/XMLSchema-instanceq\u0000~\u0000\u001esq\u0000~"
+"\u0000\u001ft\u0000\nExtensionst\u0000$urn:oasis:names:tc:SAML:2.0:metadataq\u0000~\u0000\u001es"
+"q\u0000~\u0000\u0012ppsq\u0000~\u0000\bppsq\u0000~\u0000\rpp\u0000sq\u0000~\u0000\bppsq\u0000~\u0000\u0012q\u0000~\u0000\fpsq\u0000~\u0000\u0015q\u0000~\u0000\fpq\u0000~\u0000"
+"\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000<com.sun.identity.saml2.jaxb.metadata.Org"
+"anizationNameElementq\u0000~\u0000#sq\u0000~\u0000\rpp\u0000sq\u0000~\u0000\u0000ppsq\u0000~\u0000\rpp\u0000sq\u0000~\u0000\bpps"
+"q\u0000~\u0000\u0012q\u0000~\u0000\fpsq\u0000~\u0000\u0015q\u0000~\u0000\fpq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u00006com.sun.ident"
+"ity.saml2.jaxb.metadata.LocalizedNameTypeq\u0000~\u0000#sq\u0000~\u0000\bppsq\u0000~\u0000\u0015"
+"q\u0000~\u0000\fpq\u0000~\u00001q\u0000~\u0000Aq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000\u0010OrganizationNameq\u0000~\u0000Fsq\u0000~\u0000\u0012pps"
+"q\u0000~\u0000\bppsq\u0000~\u0000\rpp\u0000sq\u0000~\u0000\bppsq\u0000~\u0000\u0012q\u0000~\u0000\fpsq\u0000~\u0000\u0015q\u0000~\u0000\fpq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000"
+"~\u0000\u001esq\u0000~\u0000\u001ft\u0000Ccom.sun.identity.saml2.jaxb.metadata.Organizatio"
+"nDisplayNameElementq\u0000~\u0000#sq\u0000~\u0000\rpp\u0000sq\u0000~\u0000\u0000ppsq\u0000~\u0000\rpp\u0000sq\u0000~\u0000\bppsq"
+"\u0000~\u0000\u0012q\u0000~\u0000\fpsq\u0000~\u0000\u0015q\u0000~\u0000\fpq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001fq\u0000~\u0000Vq\u0000~\u0000#sq\u0000~\u0000\bp"
+"psq\u0000~\u0000\u0015q\u0000~\u0000\fpq\u0000~\u00001q\u0000~\u0000Aq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000\u0017OrganizationDisplayName"
+"q\u0000~\u0000Fsq\u0000~\u0000\u0012ppsq\u0000~\u0000\bppsq\u0000~\u0000\rpp\u0000sq\u0000~\u0000\bppsq\u0000~\u0000\u0012q\u0000~\u0000\fpsq\u0000~\u0000\u0015q\u0000~\u0000"
+"\fpq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000;com.sun.identity.saml2.jaxb.metada"
+"ta.OrganizationURLElementq\u0000~\u0000#sq\u0000~\u0000\rpp\u0000sq\u0000~\u0000\u0000ppsq\u0000~\u0000\rpp\u0000sq\u0000~"
+"\u0000\bppsq\u0000~\u0000\u0012q\u0000~\u0000\fpsq\u0000~\u0000\u0015q\u0000~\u0000\fpq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u00005com.sun."
+"identity.saml2.jaxb.metadata.LocalizedURITypeq\u0000~\u0000#sq\u0000~\u0000\bppsq"
+"\u0000~\u0000\u0015q\u0000~\u0000\fpq\u0000~\u00001q\u0000~\u0000Aq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000\u000fOrganizationURLq\u0000~\u0000Fsr\u0000\"co"
+"m.sun.msv.grammar.ExpressionPool\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\bexpTablet\u0000/Lco"
+"m/sun/msv/grammar/ExpressionPool$ClosedHash;xpsr\u0000-com.sun.ms"
+"v.grammar.ExpressionPool$ClosedHash\u00d7j\u00d0N\u00ef\u00e8\u00ed\u001c\u0003\u0000\u0003I\u0000\u0005countB\u0000\rstr"
+"eamVersionL\u0000\u0006parentt\u0000$Lcom/sun/msv/grammar/ExpressionPool;xp"
+"\u0000\u0000\u0000#\u0001pq\u0000~\u0000\u0011q\u0000~\u0000\'q\u0000~\u0000Jq\u0000~\u0000Rq\u0000~\u0000Gq\u0000~\u0000^q\u0000~\u0000fq\u0000~\u0000[q\u0000~\u0000qq\u0000~\u0000yq\u0000~\u0000"
+"nq\u0000~\u0000%q\u0000~\u0000Pq\u0000~\u0000dq\u0000~\u0000wq\u0000~\u0000\u0007q\u0000~\u0000\u0005q\u0000~\u0000\u0014q\u0000~\u0000(q\u0000~\u0000Kq\u0000~\u0000Sq\u0000~\u0000_q\u0000~\u0000"
+"gq\u0000~\u0000rq\u0000~\u0000zq\u0000~\u0000\tq\u0000~\u0000\u0006q\u0000~\u0000,q\u0000~\u0000Wq\u0000~\u0000jq\u0000~\u0000~q\u0000~\u0000\nq\u0000~\u0000Hq\u0000~\u0000\\q\u0000~\u0000"
+"ox"));
        }
        return new com.sun.msv.verifier.regexp.REDocumentDeclaration(schemaFragment);
    }

    public class Unmarshaller
        extends com.sun.identity.saml2.jaxb.assertion.impl.runtime.AbstractUnmarshallingEventHandlerImpl
    {


        public Unmarshaller(com.sun.identity.saml2.jaxb.assertion.impl.runtime.UnmarshallingContext context) {
            super(context, "-------------");
        }

        protected Unmarshaller(com.sun.identity.saml2.jaxb.assertion.impl.runtime.UnmarshallingContext context, int startState) {
            this(context);
            state = startState;
        }

        public Object owner() {
            return com.sun.identity.saml2.jaxb.metadata.impl.OrganizationTypeImpl.this;
        }

        public void enterElement(String ___uri, String ___local, String ___qname, org.xml.sax.Attributes __atts)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  0 :
                        if (("Extensions" == ___local)&&("urn:oasis:names:tc:SAML:2.0:metadata" == ___uri)) {
                            _Extensions = ((com.sun.identity.saml2.jaxb.metadata.impl.ExtensionsElementImpl) spawnChildFromEnterElement((com.sun.identity.saml2.jaxb.metadata.impl.ExtensionsElementImpl.class), 3, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("Extensions" == ___local)&&("urn:oasis:names:tc:SAML:2.0:metadata" == ___uri)) {
                            context.pushAttributes(__atts, false);
                            state = 1;
                            return ;
                        }
                        state = 3;
                        continue outer;
                    case  5 :
                        attIdx = context.getAttribute("http://www.w3.org/XML/1998/namespace", "lang");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().enterElement(___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        break;
                    case  4 :
                        if (("OrganizationName" == ___local)&&("urn:oasis:names:tc:SAML:2.0:metadata" == ___uri)) {
                            _getOrganizationName().add(((com.sun.identity.saml2.jaxb.metadata.impl.OrganizationNameElementImpl) spawnChildFromEnterElement((com.sun.identity.saml2.jaxb.metadata.impl.OrganizationNameElementImpl.class), 4, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("OrganizationName" == ___local)&&("urn:oasis:names:tc:SAML:2.0:metadata" == ___uri)) {
                            context.pushAttributes(__atts, true);
                            state = 5;
                            return ;
                        }
                        if (("OrganizationDisplayName" == ___local)&&("urn:oasis:names:tc:SAML:2.0:metadata" == ___uri)) {
                            _getOrganizationDisplayName().add(((com.sun.identity.saml2.jaxb.metadata.impl.OrganizationDisplayNameElementImpl) spawnChildFromEnterElement((com.sun.identity.saml2.jaxb.metadata.impl.OrganizationDisplayNameElementImpl.class), 7, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("OrganizationDisplayName" == ___local)&&("urn:oasis:names:tc:SAML:2.0:metadata" == ___uri)) {
                            context.pushAttributes(__atts, true);
                            state = 11;
                            return ;
                        }
                        break;
                    case  7 :
                        if (("OrganizationDisplayName" == ___local)&&("urn:oasis:names:tc:SAML:2.0:metadata" == ___uri)) {
                            _getOrganizationDisplayName().add(((com.sun.identity.saml2.jaxb.metadata.impl.OrganizationDisplayNameElementImpl) spawnChildFromEnterElement((com.sun.identity.saml2.jaxb.metadata.impl.OrganizationDisplayNameElementImpl.class), 7, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("OrganizationDisplayName" == ___local)&&("urn:oasis:names:tc:SAML:2.0:metadata" == ___uri)) {
                            context.pushAttributes(__atts, true);
                            state = 11;
                            return ;
                        }
                        if (("OrganizationURL" == ___local)&&("urn:oasis:names:tc:SAML:2.0:metadata" == ___uri)) {
                            _getOrganizationURL().add(((com.sun.identity.saml2.jaxb.metadata.impl.OrganizationURLElementImpl) spawnChildFromEnterElement((com.sun.identity.saml2.jaxb.metadata.impl.OrganizationURLElementImpl.class), 8, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("OrganizationURL" == ___local)&&("urn:oasis:names:tc:SAML:2.0:metadata" == ___uri)) {
                            context.pushAttributes(__atts, true);
                            state = 9;
                            return ;
                        }
                        break;
                    case  9 :
                        attIdx = context.getAttribute("http://www.w3.org/XML/1998/namespace", "lang");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().enterElement(___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        break;
                    case  1 :
                        if (!(("" == ___uri)||("urn:oasis:names:tc:SAML:2.0:metadata" == ___uri))) {
                            _Extensions = ((com.sun.identity.saml2.jaxb.metadata.impl.ExtensionsTypeImpl) spawnChildFromEnterElement((com.sun.identity.saml2.jaxb.metadata.impl.ExtensionsTypeImpl.class), 2, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        break;
                    case  8 :
                        if (("OrganizationURL" == ___local)&&("urn:oasis:names:tc:SAML:2.0:metadata" == ___uri)) {
                            _getOrganizationURL().add(((com.sun.identity.saml2.jaxb.metadata.impl.OrganizationURLElementImpl) spawnChildFromEnterElement((com.sun.identity.saml2.jaxb.metadata.impl.OrganizationURLElementImpl.class), 8, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("OrganizationURL" == ___local)&&("urn:oasis:names:tc:SAML:2.0:metadata" == ___uri)) {
                            context.pushAttributes(__atts, true);
                            state = 9;
                            return ;
                        }
                        revertToParentFromEnterElement(___uri, ___local, ___qname, __atts);
                        return ;
                    case  3 :
                        if (("OrganizationName" == ___local)&&("urn:oasis:names:tc:SAML:2.0:metadata" == ___uri)) {
                            _getOrganizationName().add(((com.sun.identity.saml2.jaxb.metadata.impl.OrganizationNameElementImpl) spawnChildFromEnterElement((com.sun.identity.saml2.jaxb.metadata.impl.OrganizationNameElementImpl.class), 4, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("OrganizationName" == ___local)&&("urn:oasis:names:tc:SAML:2.0:metadata" == ___uri)) {
                            context.pushAttributes(__atts, true);
                            state = 5;
                            return ;
                        }
                        break;
                    case  11 :
                        attIdx = context.getAttribute("http://www.w3.org/XML/1998/namespace", "lang");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().enterElement(___uri, ___local, ___qname, __atts);
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
                    case  0 :
                        state = 3;
                        continue outer;
                    case  2 :
                        if (("Extensions" == ___local)&&("urn:oasis:names:tc:SAML:2.0:metadata" == ___uri)) {
                            context.popAttributes();
                            state = 3;
                            return ;
                        }
                        break;
                    case  5 :
                        attIdx = context.getAttribute("http://www.w3.org/XML/1998/namespace", "lang");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveElement(___uri, ___local, ___qname);
                            return ;
                        }
                        break;
                    case  10 :
                        if (("OrganizationURL" == ___local)&&("urn:oasis:names:tc:SAML:2.0:metadata" == ___uri)) {
                            context.popAttributes();
                            state = 8;
                            return ;
                        }
                        break;
                    case  6 :
                        if (("OrganizationName" == ___local)&&("urn:oasis:names:tc:SAML:2.0:metadata" == ___uri)) {
                            context.popAttributes();
                            state = 4;
                            return ;
                        }
                        break;
                    case  9 :
                        attIdx = context.getAttribute("http://www.w3.org/XML/1998/namespace", "lang");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveElement(___uri, ___local, ___qname);
                            return ;
                        }
                        break;
                    case  12 :
                        if (("OrganizationDisplayName" == ___local)&&("urn:oasis:names:tc:SAML:2.0:metadata" == ___uri)) {
                            context.popAttributes();
                            state = 7;
                            return ;
                        }
                        break;
                    case  8 :
                        revertToParentFromLeaveElement(___uri, ___local, ___qname);
                        return ;
                    case  11 :
                        attIdx = context.getAttribute("http://www.w3.org/XML/1998/namespace", "lang");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveElement(___uri, ___local, ___qname);
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
                    case  0 :
                        state = 3;
                        continue outer;
                    case  5 :
                        if (("lang" == ___local)&&("http://www.w3.org/XML/1998/namespace" == ___uri)) {
                            _getOrganizationName().add(((com.sun.identity.saml2.jaxb.metadata.impl.LocalizedNameTypeImpl) spawnChildFromEnterAttribute((com.sun.identity.saml2.jaxb.metadata.impl.LocalizedNameTypeImpl.class), 6, ___uri, ___local, ___qname)));
                            return ;
                        }
                        break;
                    case  9 :
                        if (("lang" == ___local)&&("http://www.w3.org/XML/1998/namespace" == ___uri)) {
                            _getOrganizationURL().add(((com.sun.identity.saml2.jaxb.metadata.impl.LocalizedURITypeImpl) spawnChildFromEnterAttribute((com.sun.identity.saml2.jaxb.metadata.impl.LocalizedURITypeImpl.class), 10, ___uri, ___local, ___qname)));
                            return ;
                        }
                        break;
                    case  8 :
                        revertToParentFromEnterAttribute(___uri, ___local, ___qname);
                        return ;
                    case  11 :
                        if (("lang" == ___local)&&("http://www.w3.org/XML/1998/namespace" == ___uri)) {
                            _getOrganizationDisplayName().add(((com.sun.identity.saml2.jaxb.metadata.impl.LocalizedNameTypeImpl) spawnChildFromEnterAttribute((com.sun.identity.saml2.jaxb.metadata.impl.LocalizedNameTypeImpl.class), 12, ___uri, ___local, ___qname)));
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
                    case  0 :
                        state = 3;
                        continue outer;
                    case  5 :
                        attIdx = context.getAttribute("http://www.w3.org/XML/1998/namespace", "lang");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveAttribute(___uri, ___local, ___qname);
                            return ;
                        }
                        break;
                    case  9 :
                        attIdx = context.getAttribute("http://www.w3.org/XML/1998/namespace", "lang");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveAttribute(___uri, ___local, ___qname);
                            return ;
                        }
                        break;
                    case  8 :
                        revertToParentFromLeaveAttribute(___uri, ___local, ___qname);
                        return ;
                    case  11 :
                        attIdx = context.getAttribute("http://www.w3.org/XML/1998/namespace", "lang");
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
                        case  0 :
                            state = 3;
                            continue outer;
                        case  5 :
                            attIdx = context.getAttribute("http://www.w3.org/XML/1998/namespace", "lang");
                            if (attIdx >= 0) {
                                context.consumeAttribute(attIdx);
                                context.getCurrentHandler().text(value);
                                return ;
                            }
                            break;
                        case  9 :
                            attIdx = context.getAttribute("http://www.w3.org/XML/1998/namespace", "lang");
                            if (attIdx >= 0) {
                                context.consumeAttribute(attIdx);
                                context.getCurrentHandler().text(value);
                                return ;
                            }
                            break;
                        case  8 :
                            revertToParentFromText(value);
                            return ;
                        case  11 :
                            attIdx = context.getAttribute("http://www.w3.org/XML/1998/namespace", "lang");
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
