// This class was generated by the JAXRPC SI, do not edit.
// Contents subject to change without notice.
// JAX-RPC Standard Implementation (1.1.3, compilación R1)
// Generated source version: 1.1.3

package wspregrado;

import com.sun.xml.rpc.encoding.*;
import com.sun.xml.rpc.util.exception.LocalizableExceptionAdapter;

public class Ws_pregradoPortType_ObtenerEstudianteDadoCI_ResponseStruct_SOAPBuilder implements SOAPInstanceBuilder {
    private wspregrado.Ws_pregradoPortType_ObtenerEstudianteDadoCI_ResponseStruct _instance;
    private clases.entidades.Estudiante obtenerEstudianteDadoCIReturn;
    private static final int myOBTENERESTUDIANTEDADOCIRETURN_INDEX = 0;
    
    public Ws_pregradoPortType_ObtenerEstudianteDadoCI_ResponseStruct_SOAPBuilder() {
    }
    
    public void setObtenerEstudianteDadoCIReturn(clases.entidades.Estudiante obtenerEstudianteDadoCIReturn) {
        this.obtenerEstudianteDadoCIReturn = obtenerEstudianteDadoCIReturn;
    }
    
    public int memberGateType(int memberIndex) {
        switch (memberIndex) {
            case myOBTENERESTUDIANTEDADOCIRETURN_INDEX:
                return GATES_INITIALIZATION | REQUIRES_CREATION;
            default:
                throw new IllegalArgumentException();
        }
    }
    
    public void construct() {
    }
    
    public void setMember(int index, java.lang.Object memberValue) {
        try {
            switch(index) {
                case myOBTENERESTUDIANTEDADOCIRETURN_INDEX:
                    _instance.setObtenerEstudianteDadoCIReturn((clases.entidades.Estudiante)memberValue);
                    break;
                default:
                    throw new java.lang.IllegalArgumentException();
            }
        }
        catch (java.lang.RuntimeException e) {
            throw e;
        }
        catch (java.lang.Exception e) {
            throw new DeserializationException(new LocalizableExceptionAdapter(e));
        }
    }
    
    public void initialize() {
    }
    
    public void setInstance(java.lang.Object instance) {
        _instance = (wspregrado.Ws_pregradoPortType_ObtenerEstudianteDadoCI_ResponseStruct)instance;
    }
    
    public java.lang.Object getInstance() {
        return _instance;
    }
}