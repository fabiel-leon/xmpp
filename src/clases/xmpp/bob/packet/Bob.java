/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clases.xmpp.bob.packet;

import org.jivesoftware.smack.packet.IQ;
import static clases.xmpp.bob.provider.BobProvider.CID;
import static clases.xmpp.bob.provider.BobProvider.ELEMENT_NAME;
import static clases.xmpp.bob.provider.BobProvider.NAMESPACE;
import static clases.xmpp.bob.provider.BobProvider.TYPE;

/**
 *
 * @author indira
 */
public class Bob extends IQ {

    private String cid;
    private String mimeType;
    private String data;

    public Bob() {
    }

    public Bob(String from, String to, String cid, Type type) {
        this.cid = cid;
        this.setFrom(from);
        this.setTo(to);
        this.setType(type);
    }

    public Bob(String from, String to, String cid,
            String mimeType, String data, Type type) {
        this(from, to, cid, type);
        this.data = data;
        this.mimeType = mimeType;
    }

    public Bob(IQ iq) {
        super(iq);
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getMimeType() {
        return mimeType;
    }

    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String toXML() {
        return super.toXML(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getChildElementXML() {
        StringBuilder buf = new StringBuilder();
        buf.append("<").append(ELEMENT_NAME)
                .append(" xmlns=\"").append(NAMESPACE).append("\"")
                .append(" " + CID).append("=\"").append(cid).append("\"");
        if (mimeType != null) {
            buf.append(" " + TYPE).append("=\"").append(mimeType).append("\">");
        } else {
            buf.append(">");
        }
        if (data != null) {
            //   buf.append(Base64.encodeBytes(data));
            buf.append(data);
        }
        buf.append("</data>");
        return buf.toString();
    }
}
