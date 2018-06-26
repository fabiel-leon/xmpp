/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package wspregrado;

import com.sun.xml.rpc.encoding.ObjectArraySerializer;
import com.sun.xml.rpc.encoding.SOAPDeserializationContext;
import com.sun.xml.rpc.soap.SOAPVersion;
import com.sun.xml.rpc.streaming.XMLReader;
import javax.xml.namespace.QName;

/**
 *
 * @author fleon
 */
public class ObjectArraySerializer2 extends ObjectArraySerializer {

    public ObjectArraySerializer2(QName type, boolean encodeType, boolean isNullable, String encodingStyle, QName elemName, QName elemType, Class elemClass, int rank, int[] dims) {
        super(type, encodeType, isNullable, encodingStyle, elemName, elemType, elemClass, rank, dims);
    }

    public ObjectArraySerializer2(QName type, boolean encodeType, boolean isNullable, String encodingStyle, QName elemName, QName elemType, Class elemClass, int rank, int[] dims, SOAPVersion version) {
        super(type, encodeType, isNullable, encodingStyle, elemName, elemType, elemClass, rank, dims, version);
    }

    @Override
    public Object deserialize(QName name, XMLReader reader, SOAPDeserializationContext context) {
        return super.deserialize(name, reader, context); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void verifyArrayElementType(String arrayType, XMLReader reader) throws Exception {
//        QName actualElemType = getArrayElementType(arrayType, reader);
//        if ((!actualElemType.equals(this.elemType)) && (!actualElemType.equals(SchemaConstants.QNAME_TYPE_URTYPE))) {
//            throw new DeserializationException("soap.unexpectedArrayElementType", new Object[]{this.elemType.toString(), actualElemType.toString()});
//        }
    }
}
