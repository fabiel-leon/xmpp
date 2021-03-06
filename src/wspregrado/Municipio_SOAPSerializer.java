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

public class Municipio_SOAPSerializer extends ObjectSerializerBase implements Initializable {
    private static final javax.xml.namespace.QName ns1_IdMunicipio_QNAME = new QName("", "IdMunicipio");
    private static final javax.xml.namespace.QName ns3_string_TYPE_QNAME = SchemaConstants.QNAME_TYPE_STRING;
    private CombinedSerializer ns3_myns3_string__java_lang_String_String_Serializer;
    private static final javax.xml.namespace.QName ns1_IdProvincia_QNAME = new QName("", "IdProvincia");
    private static final javax.xml.namespace.QName ns1_NombreMunicipio_QNAME = new QName("", "NombreMunicipio");
    private static final int myIDMUNICIPIO_INDEX = 0;
    private static final int myIDPROVINCIA_INDEX = 1;
    private static final int myNOMBREMUNICIPIO_INDEX = 2;
    
    public Municipio_SOAPSerializer(QName type, boolean encodeType, boolean isNullable, String encodingStyle) {
        super(type, encodeType, isNullable, encodingStyle);
    }
    
    public void initialize(InternalTypeMappingRegistry registry) throws java.lang.Exception {
        ns3_myns3_string__java_lang_String_String_Serializer = (CombinedSerializer)registry.getSerializer(SOAPConstants.NS_SOAP_ENCODING, java.lang.String.class, ns3_string_TYPE_QNAME);
    }
    
    public java.lang.Object doDeserialize(SOAPDeserializationState state, XMLReader reader,
        SOAPDeserializationContext context) throws java.lang.Exception {
        clases.entidades.Municipio instance = new clases.entidades.Municipio();
        wspregrado.Municipio_SOAPBuilder builder = null;
        java.lang.Object member;
        boolean isComplete = true;
        javax.xml.namespace.QName elementName;
        
        reader.nextElementContent();
        for (int i=0; i<3; i++) {
            elementName = reader.getName();
            if (reader.getState() == XMLReader.END) {
                break;
            }
            if (elementName.equals(ns1_IdMunicipio_QNAME)) {
                member = ns3_myns3_string__java_lang_String_String_Serializer.deserialize(ns1_IdMunicipio_QNAME, reader, context);
                if (member instanceof SOAPDeserializationState) {
                    if (builder == null) {
                        builder = new wspregrado.Municipio_SOAPBuilder();
                    }
                    state = registerWithMemberState(instance, state, member, myIDMUNICIPIO_INDEX, builder);
                    isComplete = false;
                } else {
                    instance.setIdMunicipio((java.lang.String)member);
                }
                reader.nextElementContent();
                continue;
            }
            if (elementName.equals(ns1_IdProvincia_QNAME)) {
                member = ns3_myns3_string__java_lang_String_String_Serializer.deserialize(ns1_IdProvincia_QNAME, reader, context);
                if (member instanceof SOAPDeserializationState) {
                    if (builder == null) {
                        builder = new wspregrado.Municipio_SOAPBuilder();
                    }
                    state = registerWithMemberState(instance, state, member, myIDPROVINCIA_INDEX, builder);
                    isComplete = false;
                } else {
                    instance.setIdProvincia((java.lang.String)member);
                }
                reader.nextElementContent();
                continue;
            }
            if (elementName.equals(ns1_NombreMunicipio_QNAME)) {
                member = ns3_myns3_string__java_lang_String_String_Serializer.deserialize(ns1_NombreMunicipio_QNAME, reader, context);
                if (member instanceof SOAPDeserializationState) {
                    if (builder == null) {
                        builder = new wspregrado.Municipio_SOAPBuilder();
                    }
                    state = registerWithMemberState(instance, state, member, myNOMBREMUNICIPIO_INDEX, builder);
                    isComplete = false;
                } else {
                    instance.setNombreMunicipio((java.lang.String)member);
                }
                reader.nextElementContent();
                continue;
            } else {
                throw new DeserializationException("soap.unexpectedElementName", new Object[] {ns1_NombreMunicipio_QNAME, elementName});
            }
        }
        
        XMLReaderUtil.verifyReaderState(reader, XMLReader.END);
        return (isComplete ? (java.lang.Object)instance : (java.lang.Object)state);
    }
    
    public void doSerializeAttributes(java.lang.Object obj, XMLWriter writer, SOAPSerializationContext context) throws java.lang.Exception {
        clases.entidades.Municipio instance = (clases.entidades.Municipio)obj;
        
    }
    
    public void doSerializeInstance(java.lang.Object obj, XMLWriter writer, SOAPSerializationContext context) throws java.lang.Exception {
        clases.entidades.Municipio instance = (clases.entidades.Municipio)obj;
        
        ns3_myns3_string__java_lang_String_String_Serializer.serialize(instance.getIdMunicipio(), ns1_IdMunicipio_QNAME, null, writer, context);
        ns3_myns3_string__java_lang_String_String_Serializer.serialize(instance.getIdProvincia(), ns1_IdProvincia_QNAME, null, writer, context);
        ns3_myns3_string__java_lang_String_String_Serializer.serialize(instance.getNombreMunicipio(), ns1_NombreMunicipio_QNAME, null, writer, context);
    }
}
