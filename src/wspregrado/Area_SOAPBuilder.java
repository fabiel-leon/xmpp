// This class was generated by the JAXRPC SI, do not edit.
// Contents subject to change without notice.
// JAX-RPC Standard Implementation (1.1.3, compilación R1)
// Generated source version: 1.1.3

package wspregrado;

import com.sun.xml.rpc.encoding.*;
import com.sun.xml.rpc.util.exception.LocalizableExceptionAdapter;

public class Area_SOAPBuilder implements SOAPInstanceBuilder {
    private clases.entidades.Area _instance;
    private java.lang.String idArea;
    private java.lang.String nombreArea;
    private static final int myIDAREA_INDEX = 0;
    private static final int myNOMBREAREA_INDEX = 1;
    
    public Area_SOAPBuilder() {
    }
    
    public void setIdArea(java.lang.String idArea) {
        this.idArea = idArea;
    }
    
    public void setNombreArea(java.lang.String nombreArea) {
        this.nombreArea = nombreArea;
    }
    
    public int memberGateType(int memberIndex) {
        switch (memberIndex) {
            case myIDAREA_INDEX:
                return GATES_INITIALIZATION | REQUIRES_CREATION;
            case myNOMBREAREA_INDEX:
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
                case myIDAREA_INDEX:
                    _instance.setIdArea((java.lang.String)memberValue);
                    break;
                case myNOMBREAREA_INDEX:
                    _instance.setNombreArea((java.lang.String)memberValue);
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
        _instance = (clases.entidades.Area)instance;
    }
    
    public java.lang.Object getInstance() {
        return _instance;
    }
}
