// This class was generated by the JAXRPC SI, do not edit.
// Contents subject to change without notice.
// JAX-RPC Standard Implementation (1.1.3, compilación R1)
// Generated source version: 1.1.3

package wspregrado;

import com.sun.xml.rpc.encoding.*;
import com.sun.xml.rpc.util.exception.LocalizableExceptionAdapter;

public class CategoriaPersona_SOAPBuilder implements SOAPInstanceBuilder {
    private clases.entidades.CategoriaPersona _instance;
    private java.lang.String idCategoria;
    private java.lang.String nombreCategoria;
    private static final int myIDCATEGORIA_INDEX = 0;
    private static final int myNOMBRECATEGORIA_INDEX = 1;
    
    public CategoriaPersona_SOAPBuilder() {
    }
    
    public void setIdCategoria(java.lang.String idCategoria) {
        this.idCategoria = idCategoria;
    }
    
    public void setNombreCategoria(java.lang.String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }
    
    public int memberGateType(int memberIndex) {
        switch (memberIndex) {
            case myIDCATEGORIA_INDEX:
                return GATES_INITIALIZATION | REQUIRES_CREATION;
            case myNOMBRECATEGORIA_INDEX:
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
                case myIDCATEGORIA_INDEX:
                    _instance.setIdCategoria((java.lang.String)memberValue);
                    break;
                case myNOMBRECATEGORIA_INDEX:
                    _instance.setNombreCategoria((java.lang.String)memberValue);
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
        _instance = (clases.entidades.CategoriaPersona)instance;
    }
    
    public java.lang.Object getInstance() {
        return _instance;
    }
}
