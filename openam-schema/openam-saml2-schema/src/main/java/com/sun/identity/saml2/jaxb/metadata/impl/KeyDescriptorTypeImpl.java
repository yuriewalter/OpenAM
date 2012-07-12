//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.6-b27-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.06.11 at 10:34:07 AM PDT 
//


package com.sun.identity.saml2.jaxb.metadata.impl;

public class KeyDescriptorTypeImpl implements com.sun.identity.saml2.jaxb.metadata.KeyDescriptorType, com.sun.xml.bind.JAXBObject, com.sun.identity.saml2.jaxb.assertion.impl.runtime.UnmarshallableObject, com.sun.identity.saml2.jaxb.assertion.impl.runtime.XMLSerializable, com.sun.identity.saml2.jaxb.assertion.impl.runtime.ValidatableObject
{

    protected com.sun.identity.saml2.jaxb.xmlsig.KeyInfoType _KeyInfo;
    protected com.sun.xml.bind.util.ListImpl _EncryptionMethod;
    protected String _Use;
    public final static Class version = (com.sun.identity.saml2.jaxb.metadata.impl.JAXBVersion.class);
    private static com.sun.msv.grammar.Grammar schemaFragment;

    private final static Class PRIMARY_INTERFACE_CLASS() {
        return (com.sun.identity.saml2.jaxb.metadata.KeyDescriptorType.class);
    }

    public com.sun.identity.saml2.jaxb.xmlsig.KeyInfoType getKeyInfo() {
        return _KeyInfo;
    }

    public void setKeyInfo(com.sun.identity.saml2.jaxb.xmlsig.KeyInfoType value) {
        _KeyInfo = value;
    }

    protected com.sun.xml.bind.util.ListImpl _getEncryptionMethod() {
        if (_EncryptionMethod == null) {
            _EncryptionMethod = new com.sun.xml.bind.util.ListImpl(new java.util.ArrayList());
        }
        return _EncryptionMethod;
    }

    public java.util.List getEncryptionMethod() {
        return _getEncryptionMethod();
    }

    public String getUse() {
        return _Use;
    }

    public void setUse(String value) {
        _Use = value;
    }

    public com.sun.identity.saml2.jaxb.assertion.impl.runtime.UnmarshallingEventHandler createUnmarshaller(com.sun.identity.saml2.jaxb.assertion.impl.runtime.UnmarshallingContext context) {
        return new com.sun.identity.saml2.jaxb.metadata.impl.KeyDescriptorTypeImpl.Unmarshaller(context);
    }

    public void serializeBody(com.sun.identity.saml2.jaxb.assertion.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        int idx2 = 0;
        final int len2 = ((_EncryptionMethod == null)? 0 :_EncryptionMethod.size());
        if (_KeyInfo instanceof javax.xml.bind.Element) {
            context.childAsBody(((com.sun.xml.bind.JAXBObject) _KeyInfo), "KeyInfo");
        } else {
            context.startElement("http://www.w3.org/2000/09/xmldsig#", "KeyInfo");
            context.childAsURIs(((com.sun.xml.bind.JAXBObject) _KeyInfo), "KeyInfo");
            context.endNamespaceDecls();
            context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _KeyInfo), "KeyInfo");
            context.endAttributes();
            context.childAsBody(((com.sun.xml.bind.JAXBObject) _KeyInfo), "KeyInfo");
            context.endElement();
        }
        while (idx2 != len2) {
            if (_EncryptionMethod.get(idx2) instanceof javax.xml.bind.Element) {
                context.childAsBody(((com.sun.xml.bind.JAXBObject) _EncryptionMethod.get(idx2 ++)), "EncryptionMethod");
            } else {
                context.startElement("urn:oasis:names:tc:SAML:2.0:metadata", "EncryptionMethod");
                int idx_2 = idx2;
                context.childAsURIs(((com.sun.xml.bind.JAXBObject) _EncryptionMethod.get(idx_2 ++)), "EncryptionMethod");
                context.endNamespaceDecls();
                int idx_3 = idx2;
                context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _EncryptionMethod.get(idx_3 ++)), "EncryptionMethod");
                context.endAttributes();
                context.childAsBody(((com.sun.xml.bind.JAXBObject) _EncryptionMethod.get(idx2 ++)), "EncryptionMethod");
                context.endElement();
            }
        }
    }

    public void serializeAttributes(com.sun.identity.saml2.jaxb.assertion.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        int idx2 = 0;
        final int len2 = ((_EncryptionMethod == null)? 0 :_EncryptionMethod.size());
        if (_Use!= null) {
            context.startAttribute("", "use");
            try {
                context.text(((String) _Use), "Use");
            } catch (Exception e) {
                com.sun.identity.saml2.jaxb.assertion.impl.runtime.Util.handlePrintConversionException(this, e, context);
            }
            context.endAttribute();
        }
        if (_KeyInfo instanceof javax.xml.bind.Element) {
            context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _KeyInfo), "KeyInfo");
        }
        while (idx2 != len2) {
            if (_EncryptionMethod.get(idx2) instanceof javax.xml.bind.Element) {
                context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _EncryptionMethod.get(idx2 ++)), "EncryptionMethod");
            } else {
                idx2 += 1;
            }
        }
    }

    public void serializeURIs(com.sun.identity.saml2.jaxb.assertion.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        int idx2 = 0;
        final int len2 = ((_EncryptionMethod == null)? 0 :_EncryptionMethod.size());
        if (_KeyInfo instanceof javax.xml.bind.Element) {
            context.childAsURIs(((com.sun.xml.bind.JAXBObject) _KeyInfo), "KeyInfo");
        }
        while (idx2 != len2) {
            if (_EncryptionMethod.get(idx2) instanceof javax.xml.bind.Element) {
                context.childAsURIs(((com.sun.xml.bind.JAXBObject) _EncryptionMethod.get(idx2 ++)), "EncryptionMethod");
            } else {
                idx2 += 1;
            }
        }
    }

    public Class getPrimaryInterface() {
        return (com.sun.identity.saml2.jaxb.metadata.KeyDescriptorType.class);
    }

    public com.sun.msv.verifier.DocumentDeclaration createRawValidator() {
        if (schemaFragment == null) {
            schemaFragment = com.sun.xml.bind.validator.SchemaDeserializer.deserialize((
 "\u00ac\u00ed\u0000\u0005sr\u0000\u001fcom.sun.msv.grammar.SequenceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.su"
+"n.msv.grammar.BinaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0004exp1t\u0000 Lcom/sun/msv/gra"
+"mmar/Expression;L\u0000\u0004exp2q\u0000~\u0000\u0002xr\u0000\u001ecom.sun.msv.grammar.Expressi"
+"on\u00f8\u0018\u0082\u00e8N5~O\u0002\u0000\u0002L\u0000\u0013epsilonReducibilityt\u0000\u0013Ljava/lang/Boolean;L\u0000\u000b"
+"expandedExpq\u0000~\u0000\u0002xpppsq\u0000~\u0000\u0000ppsr\u0000\u001dcom.sun.msv.grammar.ChoiceEx"
+"p\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0001ppsr\u0000\'com.sun.msv.grammar.trex.ElementPatt"
+"ern\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\tnameClasst\u0000\u001fLcom/sun/msv/grammar/NameClass;"
+"xr\u0000\u001ecom.sun.msv.grammar.ElementExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002Z\u0000\u001aignoreUndecl"
+"aredAttributesL\u0000\fcontentModelq\u0000~\u0000\u0002xq\u0000~\u0000\u0003pp\u0000sq\u0000~\u0000\u0007ppsr\u0000 com.s"
+"un.msv.grammar.OneOrMoreExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001ccom.sun.msv.gramma"
+"r.UnaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\u0003expq\u0000~\u0000\u0002xq\u0000~\u0000\u0003sr\u0000\u0011java.lang.Boolean\u00cd"
+" r\u0080\u00d5\u009c\u00fa\u00ee\u0002\u0000\u0001Z\u0000\u0005valuexp\u0000psr\u0000 com.sun.msv.grammar.AttributeExp\u0000\u0000"
+"\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0003expq\u0000~\u0000\u0002L\u0000\tnameClassq\u0000~\u0000\nxq\u0000~\u0000\u0003q\u0000~\u0000\u0012psr\u00002com.sun"
+".msv.grammar.Expression$AnyStringExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003"
+"sq\u0000~\u0000\u0011\u0001q\u0000~\u0000\u0016sr\u0000 com.sun.msv.grammar.AnyNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000x"
+"r\u0000\u001dcom.sun.msv.grammar.NameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpsr\u00000com.sun.msv"
+".grammar.Expression$EpsilonExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003q\u0000~\u0000\u0017q"
+"\u0000~\u0000\u001csr\u0000#com.sun.msv.grammar.SimpleNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\tloc"
+"alNamet\u0000\u0012Ljava/lang/String;L\u0000\fnamespaceURIq\u0000~\u0000\u001exq\u0000~\u0000\u0019t\u00001com."
+"sun.identity.saml2.jaxb.xmlsig.KeyInfoElementt\u0000+http://java."
+"sun.com/jaxb/xjc/dummy-elementssq\u0000~\u0000\tpp\u0000sq\u0000~\u0000\u0000ppsq\u0000~\u0000\tpp\u0000sq\u0000"
+"~\u0000\u0007ppsq\u0000~\u0000\u000eq\u0000~\u0000\u0012psq\u0000~\u0000\u0013q\u0000~\u0000\u0012pq\u0000~\u0000\u0016q\u0000~\u0000\u001aq\u0000~\u0000\u001csq\u0000~\u0000\u001dt\u0000.com.sun"
+".identity.saml2.jaxb.xmlsig.KeyInfoTypeq\u0000~\u0000!sq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0013q\u0000"
+"~\u0000\u0012psr\u0000\u001bcom.sun.msv.grammar.DataExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\u0002dtt\u0000\u001fLorg/r"
+"elaxng/datatype/Datatype;L\u0000\u0006exceptq\u0000~\u0000\u0002L\u0000\u0004namet\u0000\u001dLcom/sun/ms"
+"v/util/StringPair;xq\u0000~\u0000\u0003ppsr\u0000\"com.sun.msv.datatype.xsd.Qname"
+"Type\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000*com.sun.msv.datatype.xsd.BuiltinAtomicTyp"
+"e\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000%com.sun.msv.datatype.xsd.ConcreteType\u0000\u0000\u0000\u0000\u0000\u0000\u0000"
+"\u0001\u0002\u0000\u0000xr\u0000\'com.sun.msv.datatype.xsd.XSDatatypeImpl\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000"
+"\fnamespaceUriq\u0000~\u0000\u001eL\u0000\btypeNameq\u0000~\u0000\u001eL\u0000\nwhiteSpacet\u0000.Lcom/sun/m"
+"sv/datatype/xsd/WhiteSpaceProcessor;xpt\u0000 http://www.w3.org/2"
+"001/XMLSchemat\u0000\u0005QNamesr\u00005com.sun.msv.datatype.xsd.WhiteSpace"
+"Processor$Collapse\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000,com.sun.msv.datatype.xsd.Wh"
+"iteSpaceProcessor\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpsr\u00000com.sun.msv.grammar.Expres"
+"sion$NullSetExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003q\u0000~\u0000\u0012psr\u0000\u001bcom.sun.msv"
+".util.StringPair\u00d0t\u001ejB\u008f\u008d\u00a0\u0002\u0000\u0002L\u0000\tlocalNameq\u0000~\u0000\u001eL\u0000\fnamespaceURIq"
+"\u0000~\u0000\u001expq\u0000~\u00007q\u0000~\u00006sq\u0000~\u0000\u001dt\u0000\u0004typet\u0000)http://www.w3.org/2001/XMLSc"
+"hema-instanceq\u0000~\u0000\u001csq\u0000~\u0000\u001dt\u0000\u0007KeyInfot\u0000\"http://www.w3.org/2000/"
+"09/xmldsig#sq\u0000~\u0000\u0007ppsq\u0000~\u0000\u000eq\u0000~\u0000\u0012psq\u0000~\u0000\u0007q\u0000~\u0000\u0012psq\u0000~\u0000\tq\u0000~\u0000\u0012p\u0000sq\u0000~"
+"\u0000\u0007ppsq\u0000~\u0000\u000eq\u0000~\u0000\u0012psq\u0000~\u0000\u0013q\u0000~\u0000\u0012pq\u0000~\u0000\u0016q\u0000~\u0000\u001aq\u0000~\u0000\u001csq\u0000~\u0000\u001dt\u0000<com.sun."
+"identity.saml2.jaxb.metadata.EncryptionMethodElementq\u0000~\u0000!sq\u0000"
+"~\u0000\tq\u0000~\u0000\u0012p\u0000sq\u0000~\u0000\u0000ppsq\u0000~\u0000\tpp\u0000sq\u0000~\u0000\u0007ppsq\u0000~\u0000\u000eq\u0000~\u0000\u0012psq\u0000~\u0000\u0013q\u0000~\u0000\u0012pq"
+"\u0000~\u0000\u0016q\u0000~\u0000\u001aq\u0000~\u0000\u001csq\u0000~\u0000\u001dt\u00007com.sun.identity.saml2.jaxb.xmlenc.En"
+"cryptionMethodTypeq\u0000~\u0000!sq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0013q\u0000~\u0000\u0012pq\u0000~\u0000/q\u0000~\u0000?q\u0000~\u0000\u001csq"
+"\u0000~\u0000\u001dt\u0000\u0010EncryptionMethodt\u0000$urn:oasis:names:tc:SAML:2.0:metada"
+"taq\u0000~\u0000\u001csq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0013q\u0000~\u0000\u0012psq\u0000~\u0000,ppsr\u0000)com.sun.msv.datatype."
+"xsd.EnumerationFacet\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\u0006valuest\u0000\u000fLjava/util/Set;xr"
+"\u00009com.sun.msv.datatype.xsd.DataTypeWithValueConstraintFacet\""
+"\u00a7Ro\u00ca\u00c7\u008aT\u0002\u0000\u0000xr\u0000*com.sun.msv.datatype.xsd.DataTypeWithFacet\u0000\u0000\u0000\u0000"
+"\u0000\u0000\u0000\u0001\u0002\u0000\u0005Z\u0000\fisFacetFixedZ\u0000\u0012needValueCheckFlagL\u0000\bbaseTypet\u0000)Lco"
+"m/sun/msv/datatype/xsd/XSDatatypeImpl;L\u0000\fconcreteTypet\u0000\'Lcom"
+"/sun/msv/datatype/xsd/ConcreteType;L\u0000\tfacetNameq\u0000~\u0000\u001exq\u0000~\u00003q\u0000"
+"~\u0000Zt\u0000\bKeyTypessr\u00005com.sun.msv.datatype.xsd.WhiteSpaceProcess"
+"or$Preserve\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u00009\u0000\u0000sr\u0000#com.sun.msv.datatype.xsd.S"
+"tringType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001Z\u0000\risAlwaysValidxq\u0000~\u00001q\u0000~\u00006t\u0000\u0006stringq\u0000~\u0000"
+"g\u0001q\u0000~\u0000it\u0000\u000benumerationsr\u0000\u0011java.util.HashSet\u00baD\u0085\u0095\u0096\u00b8\u00b74\u0003\u0000\u0000xpw\f\u0000\u0000\u0000"
+"\u0010?@\u0000\u0000\u0000\u0000\u0000\u0002t\u0000\u0007signingt\u0000\nencryptionxq\u0000~\u0000<sq\u0000~\u0000=q\u0000~\u0000eq\u0000~\u0000Zsq\u0000~\u0000\u001d"
+"t\u0000\u0003uset\u0000\u0000q\u0000~\u0000\u001csr\u0000\"com.sun.msv.grammar.ExpressionPool\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001"
+"\u0002\u0000\u0001L\u0000\bexpTablet\u0000/Lcom/sun/msv/grammar/ExpressionPool$ClosedH"
+"ash;xpsr\u0000-com.sun.msv.grammar.ExpressionPool$ClosedHash\u00d7j\u00d0N\u00ef"
+"\u00e8\u00ed\u001c\u0003\u0000\u0003I\u0000\u0005countB\u0000\rstreamVersionL\u0000\u0006parentt\u0000$Lcom/sun/msv/gramm"
+"ar/ExpressionPool;xp\u0000\u0000\u0000\u0013\u0001pq\u0000~\u0000[q\u0000~\u0000\rq\u0000~\u0000%q\u0000~\u0000Iq\u0000~\u0000Qq\u0000~\u0000Fq\u0000~\u0000"
+"#q\u0000~\u0000Oq\u0000~\u0000Eq\u0000~\u0000\u0010q\u0000~\u0000&q\u0000~\u0000Jq\u0000~\u0000Rq\u0000~\u0000\u0005q\u0000~\u0000\u0006q\u0000~\u0000*q\u0000~\u0000Vq\u0000~\u0000\bq\u0000~\u0000"
+"Gx"));
        }
        return new com.sun.msv.verifier.regexp.REDocumentDeclaration(schemaFragment);
    }

    public class Unmarshaller
        extends com.sun.identity.saml2.jaxb.assertion.impl.runtime.AbstractUnmarshallingEventHandlerImpl
    {


        public Unmarshaller(com.sun.identity.saml2.jaxb.assertion.impl.runtime.UnmarshallingContext context) {
            super(context, "----------");
        }

        protected Unmarshaller(com.sun.identity.saml2.jaxb.assertion.impl.runtime.UnmarshallingContext context, int startState) {
            this(context);
            state = startState;
        }

        public Object owner() {
            return com.sun.identity.saml2.jaxb.metadata.impl.KeyDescriptorTypeImpl.this;
        }

        public void enterElement(String ___uri, String ___local, String ___qname, org.xml.sax.Attributes __atts)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  7 :
                        if (("EncryptionMethod" == ___local)&&("urn:oasis:names:tc:SAML:2.0:metadata" == ___uri)) {
                            _getEncryptionMethod().add(((com.sun.identity.saml2.jaxb.metadata.impl.EncryptionMethodElementImpl) spawnChildFromEnterElement((com.sun.identity.saml2.jaxb.metadata.impl.EncryptionMethodElementImpl.class), 7, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("EncryptionMethod" == ___local)&&("urn:oasis:names:tc:SAML:2.0:metadata" == ___uri)) {
                            context.pushAttributes(__atts, true);
                            state = 8;
                            return ;
                        }
                        revertToParentFromEnterElement(___uri, ___local, ___qname, __atts);
                        return ;
                    case  8 :
                        attIdx = context.getAttribute("", "Algorithm");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().enterElement(___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        break;
                    case  4 :
                        attIdx = context.getAttribute("", "Id");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().enterElement(___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("KeyName" == ___local)&&("http://www.w3.org/2000/09/xmldsig#" == ___uri)) {
                            _KeyInfo = ((com.sun.identity.saml2.jaxb.xmlsig.impl.KeyInfoTypeImpl) spawnChildFromEnterElement((com.sun.identity.saml2.jaxb.xmlsig.impl.KeyInfoTypeImpl.class), 5, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("KeyValue" == ___local)&&("http://www.w3.org/2000/09/xmldsig#" == ___uri)) {
                            _KeyInfo = ((com.sun.identity.saml2.jaxb.xmlsig.impl.KeyInfoTypeImpl) spawnChildFromEnterElement((com.sun.identity.saml2.jaxb.xmlsig.impl.KeyInfoTypeImpl.class), 5, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("RetrievalMethod" == ___local)&&("http://www.w3.org/2000/09/xmldsig#" == ___uri)) {
                            _KeyInfo = ((com.sun.identity.saml2.jaxb.xmlsig.impl.KeyInfoTypeImpl) spawnChildFromEnterElement((com.sun.identity.saml2.jaxb.xmlsig.impl.KeyInfoTypeImpl.class), 5, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("X509Data" == ___local)&&("http://www.w3.org/2000/09/xmldsig#" == ___uri)) {
                            _KeyInfo = ((com.sun.identity.saml2.jaxb.xmlsig.impl.KeyInfoTypeImpl) spawnChildFromEnterElement((com.sun.identity.saml2.jaxb.xmlsig.impl.KeyInfoTypeImpl.class), 5, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("PGPData" == ___local)&&("http://www.w3.org/2000/09/xmldsig#" == ___uri)) {
                            _KeyInfo = ((com.sun.identity.saml2.jaxb.xmlsig.impl.KeyInfoTypeImpl) spawnChildFromEnterElement((com.sun.identity.saml2.jaxb.xmlsig.impl.KeyInfoTypeImpl.class), 5, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("SPKIData" == ___local)&&("http://www.w3.org/2000/09/xmldsig#" == ___uri)) {
                            _KeyInfo = ((com.sun.identity.saml2.jaxb.xmlsig.impl.KeyInfoTypeImpl) spawnChildFromEnterElement((com.sun.identity.saml2.jaxb.xmlsig.impl.KeyInfoTypeImpl.class), 5, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("MgmtData" == ___local)&&("http://www.w3.org/2000/09/xmldsig#" == ___uri)) {
                            _KeyInfo = ((com.sun.identity.saml2.jaxb.xmlsig.impl.KeyInfoTypeImpl) spawnChildFromEnterElement((com.sun.identity.saml2.jaxb.xmlsig.impl.KeyInfoTypeImpl.class), 5, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (!(("" == ___uri)||("http://www.w3.org/2000/09/xmldsig#" == ___uri))) {
                            _KeyInfo = ((com.sun.identity.saml2.jaxb.xmlsig.impl.KeyInfoTypeImpl) spawnChildFromEnterElement((com.sun.identity.saml2.jaxb.xmlsig.impl.KeyInfoTypeImpl.class), 5, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        _KeyInfo = ((com.sun.identity.saml2.jaxb.xmlsig.impl.KeyInfoTypeImpl) spawnChildFromEnterElement((com.sun.identity.saml2.jaxb.xmlsig.impl.KeyInfoTypeImpl.class), 5, ___uri, ___local, ___qname, __atts));
                        return ;
                    case  0 :
                        attIdx = context.getAttribute("", "use");
                        if (attIdx >= 0) {
                            final String v = context.eatAttribute(attIdx);
                            state = 3;
                            eatText1(v);
                            continue outer;
                        }
                        state = 3;
                        continue outer;
                    case  3 :
                        if (("KeyInfo" == ___local)&&("http://www.w3.org/2000/09/xmldsig#" == ___uri)) {
                            _KeyInfo = ((com.sun.identity.saml2.jaxb.xmlsig.impl.KeyInfoElementImpl) spawnChildFromEnterElement((com.sun.identity.saml2.jaxb.xmlsig.impl.KeyInfoElementImpl.class), 6, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("KeyInfo" == ___local)&&("http://www.w3.org/2000/09/xmldsig#" == ___uri)) {
                            context.pushAttributes(__atts, true);
                            state = 4;
                            return ;
                        }
                        break;
                    case  6 :
                        if (("EncryptionMethod" == ___local)&&("urn:oasis:names:tc:SAML:2.0:metadata" == ___uri)) {
                            _getEncryptionMethod().add(((com.sun.identity.saml2.jaxb.metadata.impl.EncryptionMethodElementImpl) spawnChildFromEnterElement((com.sun.identity.saml2.jaxb.metadata.impl.EncryptionMethodElementImpl.class), 7, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("EncryptionMethod" == ___local)&&("urn:oasis:names:tc:SAML:2.0:metadata" == ___uri)) {
                            context.pushAttributes(__atts, true);
                            state = 8;
                            return ;
                        }
                        state = 7;
                        continue outer;
                }
                super.enterElement(___uri, ___local, ___qname, __atts);
                break;
            }
        }

        private void eatText1(final String value)
            throws org.xml.sax.SAXException
        {
            try {
                _Use = value;
            } catch (Exception e) {
                handleParseConversionException(e);
            }
        }

        public void leaveElement(String ___uri, String ___local, String ___qname)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  9 :
                        if (("EncryptionMethod" == ___local)&&("urn:oasis:names:tc:SAML:2.0:metadata" == ___uri)) {
                            context.popAttributes();
                            state = 7;
                            return ;
                        }
                        break;
                    case  7 :
                        revertToParentFromLeaveElement(___uri, ___local, ___qname);
                        return ;
                    case  8 :
                        attIdx = context.getAttribute("", "Algorithm");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveElement(___uri, ___local, ___qname);
                            return ;
                        }
                        break;
                    case  4 :
                        attIdx = context.getAttribute("", "Id");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveElement(___uri, ___local, ___qname);
                            return ;
                        }
                        _KeyInfo = ((com.sun.identity.saml2.jaxb.xmlsig.impl.KeyInfoTypeImpl) spawnChildFromLeaveElement((com.sun.identity.saml2.jaxb.xmlsig.impl.KeyInfoTypeImpl.class), 5, ___uri, ___local, ___qname));
                        return ;
                    case  0 :
                        attIdx = context.getAttribute("", "use");
                        if (attIdx >= 0) {
                            final String v = context.eatAttribute(attIdx);
                            state = 3;
                            eatText1(v);
                            continue outer;
                        }
                        state = 3;
                        continue outer;
                    case  6 :
                        state = 7;
                        continue outer;
                    case  5 :
                        if (("KeyInfo" == ___local)&&("http://www.w3.org/2000/09/xmldsig#" == ___uri)) {
                            context.popAttributes();
                            state = 6;
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
                    case  7 :
                        revertToParentFromEnterAttribute(___uri, ___local, ___qname);
                        return ;
                    case  8 :
                        if (("Algorithm" == ___local)&&("" == ___uri)) {
                            _getEncryptionMethod().add(((com.sun.identity.saml2.jaxb.xmlenc.impl.EncryptionMethodTypeImpl) spawnChildFromEnterAttribute((com.sun.identity.saml2.jaxb.xmlenc.impl.EncryptionMethodTypeImpl.class), 9, ___uri, ___local, ___qname)));
                            return ;
                        }
                        break;
                    case  4 :
                        if (("Id" == ___local)&&("" == ___uri)) {
                            _KeyInfo = ((com.sun.identity.saml2.jaxb.xmlsig.impl.KeyInfoTypeImpl) spawnChildFromEnterAttribute((com.sun.identity.saml2.jaxb.xmlsig.impl.KeyInfoTypeImpl.class), 5, ___uri, ___local, ___qname));
                            return ;
                        }
                        _KeyInfo = ((com.sun.identity.saml2.jaxb.xmlsig.impl.KeyInfoTypeImpl) spawnChildFromEnterAttribute((com.sun.identity.saml2.jaxb.xmlsig.impl.KeyInfoTypeImpl.class), 5, ___uri, ___local, ___qname));
                        return ;
                    case  0 :
                        if (("use" == ___local)&&("" == ___uri)) {
                            state = 1;
                            return ;
                        }
                        state = 3;
                        continue outer;
                    case  6 :
                        state = 7;
                        continue outer;
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
                    case  7 :
                        revertToParentFromLeaveAttribute(___uri, ___local, ___qname);
                        return ;
                    case  2 :
                        if (("use" == ___local)&&("" == ___uri)) {
                            state = 3;
                            return ;
                        }
                        break;
                    case  8 :
                        attIdx = context.getAttribute("", "Algorithm");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveAttribute(___uri, ___local, ___qname);
                            return ;
                        }
                        break;
                    case  4 :
                        attIdx = context.getAttribute("", "Id");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveAttribute(___uri, ___local, ___qname);
                            return ;
                        }
                        _KeyInfo = ((com.sun.identity.saml2.jaxb.xmlsig.impl.KeyInfoTypeImpl) spawnChildFromLeaveAttribute((com.sun.identity.saml2.jaxb.xmlsig.impl.KeyInfoTypeImpl.class), 5, ___uri, ___local, ___qname));
                        return ;
                    case  0 :
                        attIdx = context.getAttribute("", "use");
                        if (attIdx >= 0) {
                            final String v = context.eatAttribute(attIdx);
                            state = 3;
                            eatText1(v);
                            continue outer;
                        }
                        state = 3;
                        continue outer;
                    case  6 :
                        state = 7;
                        continue outer;
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
                        case  7 :
                            revertToParentFromText(value);
                            return ;
                        case  8 :
                            attIdx = context.getAttribute("", "Algorithm");
                            if (attIdx >= 0) {
                                context.consumeAttribute(attIdx);
                                context.getCurrentHandler().text(value);
                                return ;
                            }
                            break;
                        case  4 :
                            attIdx = context.getAttribute("", "Id");
                            if (attIdx >= 0) {
                                context.consumeAttribute(attIdx);
                                context.getCurrentHandler().text(value);
                                return ;
                            }
                            _KeyInfo = ((com.sun.identity.saml2.jaxb.xmlsig.impl.KeyInfoTypeImpl) spawnChildFromText((com.sun.identity.saml2.jaxb.xmlsig.impl.KeyInfoTypeImpl.class), 5, value));
                            return ;
                        case  1 :
                            state = 2;
                            eatText1(value);
                            return ;
                        case  0 :
                            attIdx = context.getAttribute("", "use");
                            if (attIdx >= 0) {
                                final String v = context.eatAttribute(attIdx);
                                state = 3;
                                eatText1(v);
                                continue outer;
                            }
                            state = 3;
                            continue outer;
                        case  6 :
                            state = 7;
                            continue outer;
                    }
                } catch (RuntimeException e) {
                    handleUnexpectedTextException(value, e);
                }
                break;
            }
        }

    }

}
