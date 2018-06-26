/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clases.xmpp.bob.provider;

import clases.xmpp.bob.packet.Bob;
import org.jivesoftware.smack.packet.IQ;
import org.jivesoftware.smack.provider.IQProvider;
import org.xmlpull.v1.XmlPullParser;

/**
 *
 * @author indira
 */
public class BobProvider implements IQProvider {

    /**
     * The names XMPP space that the thumbnail elements belong to.
     */
    public static final String NAMESPACE = "urn:xmpp:bob";
    /**
     * The name of the "data" element.
     */
    public static final String ELEMENT_NAME = "data";
    /**
     * The name of the thumbnail attribute "cid".
     */
    public final static String CID = "cid";
    /**
     * The name of the thumbnail attribute "mime-type".
     */
    public final static String TYPE = "type";

    public BobProvider() {
    }

    @Override
    public IQ parseIQ(XmlPullParser xpp) throws Exception {
        Bob bob = new Bob();
        //    bob.
        String elementName = xpp.getName();
        String namespace = xpp.getNamespace();
        if (elementName.equals(ELEMENT_NAME)
                && namespace.equals(NAMESPACE)) {
            bob.setCid(xpp.getAttributeValue("", CID));
            bob.setMimeType(xpp.getAttributeValue("", TYPE));
        }
        int eventType = xpp.next();
        if (eventType == XmlPullParser.TEXT) {
          //  bob.setData(Base64.decode(xpp.getText()));
            bob.setData(xpp.getText());
        }
        return bob;
    }
}
