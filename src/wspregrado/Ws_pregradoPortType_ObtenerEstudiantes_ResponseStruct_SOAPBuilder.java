// This class was generated by the JAXRPC SI, do not edit.
// Contents subject to change without notice.
// JAX-RPC Standard Implementation (1.1.3, compilación R1)
// Generated source version: 1.1.3

package wspregrado;

import com.sun.xml.rpc.encoding.*;
import com.sun.xml.rpc.util.exception.LocalizableExceptionAdapter;

public class Ws_pregradoPortType_ObtenerEstudiantes_ResponseStruct_SOAPBuilder implements SOAPInstanceBuilder {
    private wspregrado.Ws_pregradoPortType_ObtenerEstudiantes_ResponseStruct _instance;
    private clases.entidades.Estudiante[] obtenerEstudiantesReturn;
    private static final int myOBTENERESTUDIANTESRETURN_INDEX = 0;
    
    public Ws_pregradoPortType_ObtenerEstudiantes_ResponseStruct_SOAPBuilder() {
    }
    
    public void setObtenerEstudiantesReturn(clases.entidades.Estudiante[] obtenerEstudiantesReturn) {
        this.obtenerEstudiantesReturn = obtenerEstudiantesReturn;
    }
    
    public int memberGateType(int memberIndex) {
        switch (memberIndex) {
            case myOBTENERESTUDIANTESRETURN_INDEX:
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
                case myOBTENERESTUDIANTESRETURN_INDEX:
                    _instance.setObtenerEstudiantesReturn((clases.entidades.Estudiante[])memberValue);
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
        _instance = (wspregrado.Ws_pregradoPortType_ObtenerEstudiantes_ResponseStruct)instance;
    }
    
    public java.lang.Object getInstance() {
        return _instance;
    }
}