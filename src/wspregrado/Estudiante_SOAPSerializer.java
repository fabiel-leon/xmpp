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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.namespace.QName;

public class Estudiante_SOAPSerializer extends ObjectSerializerBase implements Initializable {
    private static final javax.xml.namespace.QName ns1_IdExpediente_QNAME = new QName("", "IdExpediente");
    private static final javax.xml.namespace.QName ns3_string_TYPE_QNAME = SchemaConstants.QNAME_TYPE_STRING;
    private CombinedSerializer ns3_myns3_string__java_lang_String_String_Serializer;
    private static final javax.xml.namespace.QName ns1_PrimerNombre_QNAME = new QName("", "PrimerNombre");
    private static final javax.xml.namespace.QName ns1_SegundoNombre_QNAME = new QName("", "SegundoNombre");
    private static final javax.xml.namespace.QName ns1_PrimerApellido_QNAME = new QName("", "PrimerApellido");
    private static final javax.xml.namespace.QName ns1_SegundoApellido_QNAME = new QName("", "SegundoApellido");
    private static final javax.xml.namespace.QName ns1_CI_QNAME = new QName("", "CI");
    private static final javax.xml.namespace.QName ns1_Estado_QNAME = new QName("", "Estado");
    private static final javax.xml.namespace.QName ns2_Estado_TYPE_QNAME = new QName("urn:pregrado", "Estado");
    private CombinedSerializer ns2_myEstado_SOAPSerializer;
    private static final javax.xml.namespace.QName ns1_Genero_QNAME = new QName("", "Genero");
    private static final javax.xml.namespace.QName ns1_Municipio_QNAME = new QName("", "Municipio");
    private static final javax.xml.namespace.QName ns2_Municipio_TYPE_QNAME = new QName("urn:pregrado", "Municipio");
    private CombinedSerializer ns2_myMunicipio_SOAPSerializer;
    private static final javax.xml.namespace.QName ns1_CategoriaPersona_QNAME = new QName("", "CategoriaPersona");
    private static final javax.xml.namespace.QName ns2_CategoriaPersona_TYPE_QNAME = new QName("urn:pregrado", "CategoriaPersona");
    private CombinedSerializer ns2_myCategoriaPersona_SOAPSerializer;
    private static final javax.xml.namespace.QName ns1_Area_QNAME = new QName("", "Area");
    private static final javax.xml.namespace.QName ns2_Area_TYPE_QNAME = new QName("urn:pregrado", "Area");
    private CombinedSerializer ns2_myArea_SOAPSerializer;
    private static final javax.xml.namespace.QName ns1_Grupo_QNAME = new QName("", "Grupo");
    private static final javax.xml.namespace.QName ns2_Grupo_TYPE_QNAME = new QName("urn:pregrado", "Grupo");
    private CombinedSerializer ns2_myGrupo_SOAPSerializer;
    private static final javax.xml.namespace.QName ns1_Nivel_QNAME = new QName("", "Nivel");
    private static final javax.xml.namespace.QName ns2_Nivel_TYPE_QNAME = new QName("urn:pregrado", "Nivel");
    private CombinedSerializer ns2_myNivel_SOAPSerializer;
    private static final int myIDEXPEDIENTE_INDEX = 0;
    private static final int myPRIMERNOMBRE_INDEX = 1;
    private static final int mySEGUNDONOMBRE_INDEX = 2;
    private static final int myPRIMERAPELLIDO_INDEX = 3;
    private static final int mySEGUNDOAPELLIDO_INDEX = 4;
    private static final int myCI_INDEX = 5;
    private static final int myESTADO_INDEX = 6;
    private static final int myGENERO_INDEX = 7;
    private static final int myMUNICIPIO_INDEX = 8;
    private static final int myCATEGORIAPERSONA_INDEX = 9;
    private static final int myAREA_INDEX = 10;
    private static final int myGRUPO_INDEX = 11;
    private static final int myNIVEL_INDEX = 12;
    
    public Estudiante_SOAPSerializer(QName type, boolean encodeType, boolean isNullable, String encodingStyle) {
        super(type, encodeType, isNullable, encodingStyle);
    }
    
    public void initialize(InternalTypeMappingRegistry registry) throws java.lang.Exception {
        ns3_myns3_string__java_lang_String_String_Serializer = (CombinedSerializer)registry.getSerializer(SOAPConstants.NS_SOAP_ENCODING, java.lang.String.class, ns3_string_TYPE_QNAME);
        ns2_myEstado_SOAPSerializer = (CombinedSerializer)registry.getSerializer(SOAPConstants.NS_SOAP_ENCODING, clases.entidades.Estado.class, ns2_Estado_TYPE_QNAME);
        ns2_myMunicipio_SOAPSerializer = (CombinedSerializer)registry.getSerializer(SOAPConstants.NS_SOAP_ENCODING, clases.entidades.Municipio.class, ns2_Municipio_TYPE_QNAME);
        ns2_myCategoriaPersona_SOAPSerializer = (CombinedSerializer)registry.getSerializer(SOAPConstants.NS_SOAP_ENCODING, clases.entidades.CategoriaPersona.class, ns2_CategoriaPersona_TYPE_QNAME);
        ns2_myArea_SOAPSerializer = (CombinedSerializer)registry.getSerializer(SOAPConstants.NS_SOAP_ENCODING, clases.entidades.Area.class, ns2_Area_TYPE_QNAME);
        ns2_myGrupo_SOAPSerializer = (CombinedSerializer)registry.getSerializer(SOAPConstants.NS_SOAP_ENCODING, clases.entidades.Grupo.class, ns2_Grupo_TYPE_QNAME);
        ns2_myNivel_SOAPSerializer = (CombinedSerializer)registry.getSerializer(SOAPConstants.NS_SOAP_ENCODING, clases.entidades.Nivel.class, ns2_Nivel_TYPE_QNAME);
    }
    public Object deserialize(QName name, XMLReader reader, SOAPDeserializationContext context) {
        boolean pushedEncodingStyle = false;
        SOAPDeserializationState state = null;
        Object instance;
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
            Object localObject1;
            if (!isNull) {
           //          verifyType(reader);
                if (id != null) {
                    state = context.getStateFor(id);
                    state.setDeserializer(this);
                }
                instance = doDeserialize(state, reader, context);

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
        }
        catch (Exception ex) {
            Logger.getLogger(Estudiante_SOAPSerializer.class.getName()).log(Level.SEVERE, null, ex);
        }        //        catch (DeserializationException e) {
//            throw e;
//        } catch (JAXRPCExceptionBase e) {
//            throw new DeserializationException(e);
//        } catch (Exception e) {
//            throw new DeserializationException(new LocalizableExceptionAdapter(e));
//        } 
        finally {
            if (pushedEncodingStyle) {
                context.popEncodingStyle();
            }
        } //To change body of generated methods, choose Tools | Templates.
        return null;
    }

    public java.lang.Object doDeserialize(SOAPDeserializationState state, XMLReader reader,
        SOAPDeserializationContext context) throws java.lang.Exception {
        clases.entidades.Estudiante instance = new clases.entidades.Estudiante();
        wspregrado.Estudiante_SOAPBuilder builder = null;
        java.lang.Object member;
        boolean isComplete = true;
        javax.xml.namespace.QName elementName;
        
        reader.nextElementContent();
        for (int i=0; i<13; i++) {
            elementName = reader.getName();
            if (reader.getState() == XMLReader.END) {
                break;
            }
            if (elementName.equals(ns1_IdExpediente_QNAME)) {
                member = ns3_myns3_string__java_lang_String_String_Serializer.deserialize(ns1_IdExpediente_QNAME, reader, context);
                if (member instanceof SOAPDeserializationState) {
                    if (builder == null) {
                        builder = new wspregrado.Estudiante_SOAPBuilder();
                    }
                    state = registerWithMemberState(instance, state, member, myIDEXPEDIENTE_INDEX, builder);
                    isComplete = false;
                } else {
                    instance.setIdExpediente((java.lang.String)member);
                }
                reader.nextElementContent();
                continue;
            }
            if (elementName.equals(ns1_PrimerNombre_QNAME)) {
                member = ns3_myns3_string__java_lang_String_String_Serializer.deserialize(ns1_PrimerNombre_QNAME, reader, context);
                if (member instanceof SOAPDeserializationState) {
                    if (builder == null) {
                        builder = new wspregrado.Estudiante_SOAPBuilder();
                    }
                    state = registerWithMemberState(instance, state, member, myPRIMERNOMBRE_INDEX, builder);
                    isComplete = false;
                } else {
                    instance.setPrimerNombre((java.lang.String)member);
                }
                reader.nextElementContent();
                continue;
            }
            if (elementName.equals(ns1_SegundoNombre_QNAME)) {
                member = ns3_myns3_string__java_lang_String_String_Serializer.deserialize(ns1_SegundoNombre_QNAME, reader, context);
                if (member instanceof SOAPDeserializationState) {
                    if (builder == null) {
                        builder = new wspregrado.Estudiante_SOAPBuilder();
                    }
                    state = registerWithMemberState(instance, state, member, mySEGUNDONOMBRE_INDEX, builder);
                    isComplete = false;
                } else {
                    instance.setSegundoNombre((java.lang.String)member);
                }
                reader.nextElementContent();
                continue;
            }
            if (elementName.equals(ns1_PrimerApellido_QNAME)) {
                member = ns3_myns3_string__java_lang_String_String_Serializer.deserialize(ns1_PrimerApellido_QNAME, reader, context);
                if (member instanceof SOAPDeserializationState) {
                    if (builder == null) {
                        builder = new wspregrado.Estudiante_SOAPBuilder();
                    }
                    state = registerWithMemberState(instance, state, member, myPRIMERAPELLIDO_INDEX, builder);
                    isComplete = false;
                } else {
                    instance.setPrimerApellido((java.lang.String)member);
                }
                reader.nextElementContent();
                continue;
            }
            if (elementName.equals(ns1_SegundoApellido_QNAME)) {
                member = ns3_myns3_string__java_lang_String_String_Serializer.deserialize(ns1_SegundoApellido_QNAME, reader, context);
                if (member instanceof SOAPDeserializationState) {
                    if (builder == null) {
                        builder = new wspregrado.Estudiante_SOAPBuilder();
                    }
                    state = registerWithMemberState(instance, state, member, mySEGUNDOAPELLIDO_INDEX, builder);
                    isComplete = false;
                } else {
                    instance.setSegundoApellido((java.lang.String)member);
                }
                reader.nextElementContent();
                continue;
            }
            if (elementName.equals(ns1_CI_QNAME)) {
                member = ns3_myns3_string__java_lang_String_String_Serializer.deserialize(ns1_CI_QNAME, reader, context);
                if (member instanceof SOAPDeserializationState) {
                    if (builder == null) {
                        builder = new wspregrado.Estudiante_SOAPBuilder();
                    }
                    state = registerWithMemberState(instance, state, member, myCI_INDEX, builder);
                    isComplete = false;
                } else {
                    instance.setCI((java.lang.String)member);
                }
                reader.nextElementContent();
                continue;
            }
            if (elementName.equals(ns1_Estado_QNAME)) {
                member = ns2_myEstado_SOAPSerializer.deserialize(ns1_Estado_QNAME, reader, context);
                if (member instanceof SOAPDeserializationState) {
                    if (builder == null) {
                        builder = new wspregrado.Estudiante_SOAPBuilder();
                    }
                    state = registerWithMemberState(instance, state, member, myESTADO_INDEX, builder);
                    isComplete = false;
                } else {
                    instance.setEstado((clases.entidades.Estado)member);
                }
                reader.nextElementContent();
                continue;
            }
            if (elementName.equals(ns1_Genero_QNAME)) {
                member = ns3_myns3_string__java_lang_String_String_Serializer.deserialize(ns1_Genero_QNAME, reader, context);
                if (member instanceof SOAPDeserializationState) {
                    if (builder == null) {
                        builder = new wspregrado.Estudiante_SOAPBuilder();
                    }
                    state = registerWithMemberState(instance, state, member, myGENERO_INDEX, builder);
                    isComplete = false;
                } else {
                    instance.setGenero((java.lang.String)member);
                }
                reader.nextElementContent();
                continue;
            }
            if (elementName.equals(ns1_Municipio_QNAME)) {
                member = ns2_myMunicipio_SOAPSerializer.deserialize(ns1_Municipio_QNAME, reader, context);
                if (member instanceof SOAPDeserializationState) {
                    if (builder == null) {
                        builder = new wspregrado.Estudiante_SOAPBuilder();
                    }
                    state = registerWithMemberState(instance, state, member, myMUNICIPIO_INDEX, builder);
                    isComplete = false;
                } else {
                    instance.setMunicipio((clases.entidades.Municipio)member);
                }
                reader.nextElementContent();
                continue;
            }
            if (elementName.equals(ns1_CategoriaPersona_QNAME)) {
                member = ns2_myCategoriaPersona_SOAPSerializer.deserialize(ns1_CategoriaPersona_QNAME, reader, context);
                if (member instanceof SOAPDeserializationState) {
                    if (builder == null) {
                        builder = new wspregrado.Estudiante_SOAPBuilder();
                    }
                    state = registerWithMemberState(instance, state, member, myCATEGORIAPERSONA_INDEX, builder);
                    isComplete = false;
                } else {
                    instance.setCategoriaPersona((clases.entidades.CategoriaPersona)member);
                }
                reader.nextElementContent();
                continue;
            }
            if (elementName.equals(ns1_Area_QNAME)) {
                member = ns2_myArea_SOAPSerializer.deserialize(ns1_Area_QNAME, reader, context);
                if (member instanceof SOAPDeserializationState) {
                    if (builder == null) {
                        builder = new wspregrado.Estudiante_SOAPBuilder();
                    }
                    state = registerWithMemberState(instance, state, member, myAREA_INDEX, builder);
                    isComplete = false;
                } else {
                    instance.setArea((clases.entidades.Area)member);
                }
                reader.nextElementContent();
                continue;
            }
            if (elementName.equals(ns1_Grupo_QNAME)) {
                member = ns2_myGrupo_SOAPSerializer.deserialize(ns1_Grupo_QNAME, reader, context);
                if (member instanceof SOAPDeserializationState) {
                    if (builder == null) {
                        builder = new wspregrado.Estudiante_SOAPBuilder();
                    }
                    state = registerWithMemberState(instance, state, member, myGRUPO_INDEX, builder);
                    isComplete = false;
                } else {
                    instance.setGrupo((clases.entidades.Grupo)member);
                }
                reader.nextElementContent();
                continue;
            }
            if (elementName.equals(ns1_Nivel_QNAME)) {
                member = ns2_myNivel_SOAPSerializer.deserialize(ns1_Nivel_QNAME, reader, context);
                if (member instanceof SOAPDeserializationState) {
                    if (builder == null) {
                        builder = new wspregrado.Estudiante_SOAPBuilder();
                    }
                    state = registerWithMemberState(instance, state, member, myNIVEL_INDEX, builder);
                    isComplete = false;
                } else {
                    instance.setNivel((clases.entidades.Nivel)member);
                }
                reader.nextElementContent();
                continue;
            } else {
                throw new DeserializationException("soap.unexpectedElementName", new Object[] {ns1_Nivel_QNAME, elementName});
            }
        }
        
        XMLReaderUtil.verifyReaderState(reader, XMLReader.END);
        return (isComplete ? (java.lang.Object)instance : (java.lang.Object)state);
    }
    
    public void doSerializeAttributes(java.lang.Object obj, XMLWriter writer, SOAPSerializationContext context) throws java.lang.Exception {
        clases.entidades.Estudiante instance = (clases.entidades.Estudiante)obj;
        
    }
    
    public void doSerializeInstance(java.lang.Object obj, XMLWriter writer, SOAPSerializationContext context) throws java.lang.Exception {
        clases.entidades.Estudiante instance = (clases.entidades.Estudiante)obj;
        
        ns3_myns3_string__java_lang_String_String_Serializer.serialize(instance.getIdExpediente(), ns1_IdExpediente_QNAME, null, writer, context);
        ns3_myns3_string__java_lang_String_String_Serializer.serialize(instance.getPrimerNombre(), ns1_PrimerNombre_QNAME, null, writer, context);
        ns3_myns3_string__java_lang_String_String_Serializer.serialize(instance.getSegundoNombre(), ns1_SegundoNombre_QNAME, null, writer, context);
        ns3_myns3_string__java_lang_String_String_Serializer.serialize(instance.getPrimerApellido(), ns1_PrimerApellido_QNAME, null, writer, context);
        ns3_myns3_string__java_lang_String_String_Serializer.serialize(instance.getSegundoApellido(), ns1_SegundoApellido_QNAME, null, writer, context);
        ns3_myns3_string__java_lang_String_String_Serializer.serialize(instance.getCI(), ns1_CI_QNAME, null, writer, context);
        ns2_myEstado_SOAPSerializer.serialize(instance.getEstado(), ns1_Estado_QNAME, null, writer, context);
        ns3_myns3_string__java_lang_String_String_Serializer.serialize(instance.getGenero(), ns1_Genero_QNAME, null, writer, context);
        ns2_myMunicipio_SOAPSerializer.serialize(instance.getMunicipio(), ns1_Municipio_QNAME, null, writer, context);
        ns2_myCategoriaPersona_SOAPSerializer.serialize(instance.getCategoriaPersona(), ns1_CategoriaPersona_QNAME, null, writer, context);
        ns2_myArea_SOAPSerializer.serialize(instance.getArea(), ns1_Area_QNAME, null, writer, context);
        ns2_myGrupo_SOAPSerializer.serialize(instance.getGrupo(), ns1_Grupo_QNAME, null, writer, context);
        ns2_myNivel_SOAPSerializer.serialize(instance.getNivel(), ns1_Nivel_QNAME, null, writer, context);
    }
}
