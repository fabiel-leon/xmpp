// This class was generated by the JAXRPC SI, do not edit.
// Contents subject to change without notice.
// JAX-RPC Standard Implementation (1.1.3, compilación R1)
// Generated source version: 1.1.3

package wspregrado;

import com.sun.xml.rpc.encoding.*;
import com.sun.xml.rpc.encoding.soap.SOAPConstants;
import com.sun.xml.rpc.streaming.*;
import com.sun.xml.rpc.util.exception.JAXRPCExceptionBase;
import com.sun.xml.rpc.util.exception.LocalizableExceptionAdapter;
import com.sun.xml.rpc.wsdl.document.schema.SchemaConstants;
import javax.xml.namespace.QName;

public class Area_SOAPSerializer extends ObjectSerializerBase implements Initializable {
    private static final javax.xml.namespace.QName ns1_IdArea_QNAME = new QName("", "IdArea");
    private static final javax.xml.namespace.QName ns3_string_TYPE_QNAME = SchemaConstants.QNAME_TYPE_STRING;
    private CombinedSerializer ns3_myns3_string__java_lang_String_String_Serializer;
    private static final javax.xml.namespace.QName ns1_NombreArea_QNAME = new QName("", "NombreArea");
    private static final int myIDAREA_INDEX = 0;
    private static final int myNOMBREAREA_INDEX = 1;
    
    public Area_SOAPSerializer(QName type, boolean encodeType, boolean isNullable, String encodingStyle) {
        super(type, encodeType, isNullable, encodingStyle);
    }
    
    public void initialize(InternalTypeMappingRegistry registry) throws java.lang.Exception {
        ns3_myns3_string__java_lang_String_String_Serializer = (CombinedSerializer)registry.getSerializer(SOAPConstants.NS_SOAP_ENCODING, java.lang.String.class, ns3_string_TYPE_QNAME);
    }
      public Object deserialize(QName name, XMLReader reader, SOAPDeserializationContext context) {
        boolean pushedEncodingStyle = false;
        Object localObject1 = null;
        SOAPDeserializationState state = null;
        try {
            pushedEncodingStyle = context.processEncodingStyle(reader);
            if (this.encodingStyle != null) {
                context.verifyEncodingStyle(this.encodingStyle);
            }
//            if (name != null) {
//                verifyName(reader, name);
//            }
            String id = getID(reader);
            boolean isNull = SerializerBase.getNullStatus(reader);

            if (!isNull) {
                //  verifyType(reader);
                if (id != null) {
                    state = context.getStateFor(id);
                    state.setDeserializer(this);
                }
                Object instance = doDeserialize(state, reader, context);
                if ((instance instanceof SOAPDeserializationState)) {
                    state = (SOAPDeserializationState) instance;
                } else if (state != null) {
                    state.setInstance(instance);
                }
                if (state != null) {
                    state.doneReading();
                    localObject1 = state;
                }
                localObject1 = instance;
            }
            if (!this.isNullable) {
                throw new DeserializationException("soap.unexpectedNull");
            }
            skipEmptyContent(reader);
            if (id != null) {
                state = context.getStateFor(id);
                state.setDeserializer(this);
                state.setInstance(null);
                state.doneReading();
            }
            state = null;
        } catch (DeserializationException e) {
            throw e;
        } catch (JAXRPCExceptionBase e) {
            throw new DeserializationException(e);
        } catch (Exception e) {
            throw new DeserializationException(new LocalizableExceptionAdapter(e));
        } finally {
            if (pushedEncodingStyle) {
                context.popEncodingStyle();
            }
        }
        return localObject1;
    }

    public java.lang.Object doDeserialize(SOAPDeserializationState state, XMLReader reader,
        SOAPDeserializationContext context) throws java.lang.Exception {
        clases.entidades.Area instance = new clases.entidades.Area();
        wspregrado.Area_SOAPBuilder builder = null;
        java.lang.Object member;
        boolean isComplete = true;
        javax.xml.namespace.QName elementName;
        
        reader.nextElementContent();
        for (int i=0; i<2; i++) {
            elementName = reader.getName();
            if (reader.getState() == XMLReader.END) {
                break;
            }
            if (elementName.equals(ns1_IdArea_QNAME)) {
                member = ns3_myns3_string__java_lang_String_String_Serializer.deserialize(ns1_IdArea_QNAME, reader, context);
                if (member instanceof SOAPDeserializationState) {
                    if (builder == null) {
                        builder = new wspregrado.Area_SOAPBuilder();
                    }
                    state = registerWithMemberState(instance, state, member, myIDAREA_INDEX, builder);
                    isComplete = false;
                } else {
                    instance.setIdArea((java.lang.String)member);
                }
                reader.nextElementContent();
                continue;
            }
            if (elementName.equals(ns1_NombreArea_QNAME)) {
                member = ns3_myns3_string__java_lang_String_String_Serializer.deserialize(ns1_NombreArea_QNAME, reader, context);
                if (member instanceof SOAPDeserializationState) {
                    if (builder == null) {
                        builder = new wspregrado.Area_SOAPBuilder();
                    }
                    state = registerWithMemberState(instance, state, member, myNOMBREAREA_INDEX, builder);
                    isComplete = false;
                } else {
                    instance.setNombreArea((java.lang.String)member);
                }
                reader.nextElementContent();
                continue;
            } else {
                throw new DeserializationException("soap.unexpectedElementName", new Object[] {ns1_NombreArea_QNAME, elementName});
            }
        }
        
        XMLReaderUtil.verifyReaderState(reader, XMLReader.END);
        return (isComplete ? (java.lang.Object)instance : (java.lang.Object)state);
    }
    
    public void doSerializeAttributes(java.lang.Object obj, XMLWriter writer, SOAPSerializationContext context) throws java.lang.Exception {
        clases.entidades.Area instance = (clases.entidades.Area)obj;
        
    }
    
    public void doSerializeInstance(java.lang.Object obj, XMLWriter writer, SOAPSerializationContext context) throws java.lang.Exception {
        clases.entidades.Area instance = (clases.entidades.Area)obj;
        
        ns3_myns3_string__java_lang_String_String_Serializer.serialize(instance.getIdArea(), ns1_IdArea_QNAME, null, writer, context);
        ns3_myns3_string__java_lang_String_String_Serializer.serialize(instance.getNombreArea(), ns1_NombreArea_QNAME, null, writer, context);
    }
}
