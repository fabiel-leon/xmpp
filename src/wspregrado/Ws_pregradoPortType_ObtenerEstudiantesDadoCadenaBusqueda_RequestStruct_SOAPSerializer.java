// This class was generated by the JAXRPC SI, do not edit.
// Contents subject to change without notice.
// JAX-RPC Standard Implementation (1.1.3, compilación R1)
// Generated source version: 1.1.3

package wspregrado;

import com.sun.xml.rpc.encoding.*;
import com.sun.xml.rpc.encoding.literal.DetailFragmentDeserializer;
import com.sun.xml.rpc.encoding.simpletype.*;
import com.sun.xml.rpc.encoding.soap.SOAPConstants;
import com.sun.xml.rpc.encoding.soap.SOAP12Constants;
import com.sun.xml.rpc.streaming.*;
import com.sun.xml.rpc.wsdl.document.schema.SchemaConstants;
import javax.xml.namespace.QName;

public class Ws_pregradoPortType_ObtenerEstudiantesDadoCadenaBusqueda_RequestStruct_SOAPSerializer extends ObjectSerializerBase implements Initializable {
    private static final javax.xml.namespace.QName ns1_Cadena_QNAME = new QName("", "Cadena");
    private static final javax.xml.namespace.QName ns3_string_TYPE_QNAME = SchemaConstants.QNAME_TYPE_STRING;
    private CombinedSerializer ns3_myns3_string__java_lang_String_String_Serializer;
    private static final int myCADENA_INDEX = 0;
    
    public Ws_pregradoPortType_ObtenerEstudiantesDadoCadenaBusqueda_RequestStruct_SOAPSerializer(QName type, boolean encodeType, boolean isNullable, String encodingStyle) {
        super(type, encodeType, isNullable, encodingStyle);
    }
    
    public void initialize(InternalTypeMappingRegistry registry) throws java.lang.Exception {
        ns3_myns3_string__java_lang_String_String_Serializer = (CombinedSerializer)registry.getSerializer(SOAPConstants.NS_SOAP_ENCODING, java.lang.String.class, ns3_string_TYPE_QNAME);
    }
    
    public java.lang.Object doDeserialize(SOAPDeserializationState state, XMLReader reader,
        SOAPDeserializationContext context) throws java.lang.Exception {
        wspregrado.Ws_pregradoPortType_ObtenerEstudiantesDadoCadenaBusqueda_RequestStruct instance = new wspregrado.Ws_pregradoPortType_ObtenerEstudiantesDadoCadenaBusqueda_RequestStruct();
        wspregrado.Ws_pregradoPortType_ObtenerEstudiantesDadoCadenaBusqueda_RequestStruct_SOAPBuilder builder = null;
        java.lang.Object member;
        boolean isComplete = true;
        javax.xml.namespace.QName elementName;
        
        reader.nextElementContent();
        elementName = reader.getName();
        if (reader.getState() == XMLReader.START) {
            if (elementName.equals(ns1_Cadena_QNAME)) {
                member = ns3_myns3_string__java_lang_String_String_Serializer.deserialize(ns1_Cadena_QNAME, reader, context);
                if (member instanceof SOAPDeserializationState) {
                    if (builder == null) {
                        builder = new wspregrado.Ws_pregradoPortType_ObtenerEstudiantesDadoCadenaBusqueda_RequestStruct_SOAPBuilder();
                    }
                    state = registerWithMemberState(instance, state, member, myCADENA_INDEX, builder);
                    isComplete = false;
                } else {
                    instance.setCadena((java.lang.String)member);
                }
                reader.nextElementContent();
            } else {
                throw new DeserializationException("soap.unexpectedElementName", new Object[] {ns1_Cadena_QNAME, elementName});
            }
        }
        
        XMLReaderUtil.verifyReaderState(reader, XMLReader.END);
        return (isComplete ? (java.lang.Object)instance : (java.lang.Object)state);
    }
    
    public void doSerializeAttributes(java.lang.Object obj, XMLWriter writer, SOAPSerializationContext context) throws java.lang.Exception {
        wspregrado.Ws_pregradoPortType_ObtenerEstudiantesDadoCadenaBusqueda_RequestStruct instance = (wspregrado.Ws_pregradoPortType_ObtenerEstudiantesDadoCadenaBusqueda_RequestStruct)obj;
        
    }
    
    public void doSerializeInstance(java.lang.Object obj, XMLWriter writer, SOAPSerializationContext context) throws java.lang.Exception {
        wspregrado.Ws_pregradoPortType_ObtenerEstudiantesDadoCadenaBusqueda_RequestStruct instance = (wspregrado.Ws_pregradoPortType_ObtenerEstudiantesDadoCadenaBusqueda_RequestStruct)obj;
        
        ns3_myns3_string__java_lang_String_String_Serializer.serialize(instance.getCadena(), ns1_Cadena_QNAME, null, writer, context);
    }
}
