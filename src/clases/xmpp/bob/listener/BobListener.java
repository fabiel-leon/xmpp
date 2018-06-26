/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clases.xmpp.bob.listener;

import clases.xmpp.bob.packet.Bob;
import java.util.List;
import org.jivesoftware.smack.PacketListener;
import org.jivesoftware.smack.XMPPConnection;
import org.jivesoftware.smack.packet.Packet;

/**
 *
 * @author indira
 */
public class BobListener implements PacketListener {

    //  Map<String, String> map = new HashMap<String, String>();
    private final XMPPConnection xmppc;
    private final List<String> cache;

    /**
     *
     * @param xmppc
     */
    public BobListener(XMPPConnection xmppc, List<String> cache) {
        this.xmppc = xmppc;
        this.cache = cache;
    }

    @Override
    public void processPacket(Packet packet) {
        if (packet instanceof Bob) {
            Bob bob = (Bob) packet;
            Bob result = new Bob();
            result.setType(Bob.Type.RESULT);
            result.setPacketID(bob.getPacketID());
            result.setFrom(bob.getTo());
            result.setTo(bob.getFrom());
            result.setCid(bob.getCid());
            /**
             * arreglar esto que sea segun el tipo de imagen
             */
            result.setMimeType("image/png");
            result.setData(cache.get(new Integer(bob.getCid())-1));
            xmppc.sendPacket(result);
        }
    }
}
