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

public class Ws_pregradoPortType_ObtenerEstudiantesDadoIdGrupo_ResponseStruct_SOAPSerializer extends ObjectSerializerBase implements Initializable {
    private static final javax.xml.namespace.QName ns1_ObtenerEstudiantesDadoIdGrupoReturn_QNAME = new QName("", "ObtenerEstudiantesDadoIdGrupoReturn");
    private static final javax.xml.namespace.QName ns2_EstudianteGrupoArray_TYPE_QNAME = new QName("urn:pregrado", "EstudianteGrupoArray");
    private CombinedSerializer ns2_myns2_EstudianteGrupoArray__EstudianteGrupoArray_SOAPSerializer1;
    private static final int myOBTENERESTUDIANTESDADOIDGRUPORETURN_INDEX = 0;
    
    public Ws_pregradoPortType_ObtenerEstudiantesDadoIdGrupo_ResponseStruct_SOAPSerializer(QName type, boolean encodeType, boolean isNullable, String encodingStyle) {
        super(type, encodeType, isNullable, encodingStyle);
    }
    
    public void initialize(InternalTypeMappingRegistry registry) throws java.lang.Exception {
        ns2_myns2_EstudianteGrupoArray__EstudianteGrupoArray_SOAPSerializer1 = (CombinedSerializer)registry.getSerializer(SOAPConstants.NS_SOAP_ENCODING, clases.entidades.EstudianteGrupo[].class, ns2_EstudianteGrupoArray_TYPE_QNAME);
    }
    
    public java.lang.Object doDeserialize(SOAPDeserializationState state, XMLReader reader,
        SOAPDeserializationContext context) throws java.lang.Exception {
        wspregrado.Ws_pregradoPortType_ObtenerEstudiantesDadoIdGrupo_ResponseStruct instance = new wspregrado.Ws_pregradoPortType_ObtenerEstudiantesDadoIdGrupo_ResponseStruct();
        wspregrado.Ws_pregradoPortType_ObtenerEstudiantesDadoIdGrupo_ResponseStruct_SOAPBuilder builder = null;
        java.lang.Object member;
        boolean isComplete = true;
        javax.xml.namespace.QName elementName;
        
        reader.nextElementContent();
        elementName = reader.getName();
        if (reader.getState() == XMLReader.START) {
            if (elementName.equals(ns1_ObtenerEstudiantesDadoIdGrupoReturn_QNAME)) {
                member = ns2_myns2_EstudianteGrupoArray__EstudianteGrupoArray_SOAPSerializer1.deserialize(ns1_ObtenerEstudiantesDadoIdGrupoReturn_QNAME, reader, context);
                if (member instanceof SOAPDeserializationState) {
                    if (builder == null) {
                        builder = new wspregrado.Ws_pregradoPortType_ObtenerEstudiantesDadoIdGrupo_ResponseStruct_SOAPBuilder();
                    }
                    state = registerWithMemberState(instance, state, member, myOBTENERESTUDIANTESDADOIDGRUPORETURN_INDEX, builder);
                    isComplete = false;
                } else {
                    instance.setObtenerEstudiantesDadoIdGrupoReturn((clases.entidades.EstudianteGrupo[])member);
                }
                reader.nextElementContent();
            } else {
                throw new DeserializationException("soap.unexpectedElementName", new Object[] {ns1_ObtenerEstudiantesDadoIdGrupoReturn_QNAME, elementName});
            }
        }
        
        XMLReaderUtil.verifyReaderState(reader, XMLReader.END);
        return (isComplete ? (java.lang.Object)instance : (java.lang.Object)state);
    }
    
    public void doSerializeAttributes(java.lang.Object obj, XMLWriter writer, SOAPSerializationContext context) throws java.lang.Exception {
        wspregrado.Ws_pregradoPortType_ObtenerEstudiantesDadoIdGrupo_ResponseStruct instance = (wspregrado.Ws_pregradoPortType_ObtenerEstudiantesDadoIdGrupo_ResponseStruct)obj;
        
    }
    
    public void doSerializeInstance(java.lang.Object obj, XMLWriter writer, SOAPSerializationContext context) throws java.lang.Exception {
        wspregrado.Ws_pregradoPortType_ObtenerEstudiantesDadoIdGrupo_ResponseStruct instance = (wspregrado.Ws_pregradoPortType_ObtenerEstudiantesDadoIdGrupo_ResponseStruct)obj;
        
        ns2_myns2_EstudianteGrupoArray__EstudianteGrupoArray_SOAPSerializer1.serialize(instance.getObtenerEstudiantesDadoIdGrupoReturn(), ns1_ObtenerEstudiantesDadoIdGrupoReturn_QNAME, null, writer, context);
    }
    protected void verifyName(XMLReader reader, javax.xml.namespace.QName expectedName) throws java.lang.Exception {
    }
}
