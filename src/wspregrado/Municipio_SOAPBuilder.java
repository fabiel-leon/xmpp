// This class was generated by the JAXRPC SI, do not edit.
// Contents subject to change without notice.
// JAX-RPC Standard Implementation (1.1.3, compilación R1)
// Generated source version: 1.1.3

package wspregrado;

import com.sun.xml.rpc.encoding.*;
import com.sun.xml.rpc.util.exception.LocalizableExceptionAdapter;

public class Municipio_SOAPBuilder implements SOAPInstanceBuilder {
    private clases.entidades.Municipio _instance;
    private java.lang.String idMunicipio;
    private java.lang.String idProvincia;
    private java.lang.String nombreMunicipio;
    private static final int myIDMUNICIPIO_INDEX = 0;
    private static final int myIDPROVINCIA_INDEX = 1;
    private static final int myNOMBREMUNICIPIO_INDEX = 2;
    
    public Municipio_SOAPBuilder() {
    }
    
    public void setIdMunicipio(java.lang.String idMunicipio) {
        this.idMunicipio = idMunicipio;
    }
    
    public void setIdProvincia(java.lang.String idProvincia) {
        this.idProvincia = idProvincia;
    }
    
    public void setNombreMunicipio(java.lang.String nombreMunicipio) {
        this.nombreMunicipio = nombreMunicipio;
    }
    
    public int memberGateType(int memberIndex) {
        switch (memberIndex) {
            case myIDMUNICIPIO_INDEX:
                return GATES_INITIALIZATION | REQUIRES_CREATION;
            case myIDPROVINCIA_INDEX:
                return GATES_INITIALIZATION | REQUIRES_CREATION;
            case myNOMBREMUNICIPIO_INDEX:
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
                case myIDMUNICIPIO_INDEX:
                    _instance.setIdMunicipio((java.lang.String)memberValue);
                    break;
                case myIDPROVINCIA_INDEX:
                    _instance.setIdProvincia((java.lang.String)memberValue);
                    break;
                case myNOMBREMUNICIPIO_INDEX:
                    _instance.setNombreMunicipio((java.lang.String)memberValue);
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
        _instance = (clases.entidades.Municipio)instance;
    }
    
    public java.lang.Object getInstance() {
        return _instance;
    }
}