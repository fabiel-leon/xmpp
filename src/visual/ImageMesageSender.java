/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package visual;

import clases.entidades.Mensaje;
import clases.entidades.interfaces.Receiver;
import clases.xmpp.utils.XHTMLTexto;
import helpClases.utils.GraphicWork;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.font.FontRenderContext;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.SwingWorker;
import org.jivesoftware.smack.Chat;
import org.jivesoftware.smack.ChatManager;
import org.jivesoftware.smack.XMPPConnection;
import org.jivesoftware.smack.XMPPException;
import org.jivesoftware.smack.packet.Message;
import org.jivesoftware.smack.util.Base64;
import org.jivesoftware.smackx.XHTMLManager;
import sun.font.FontDesignMetrics;

/**
 *
 * @author indira
 */
public class ImageMesageSender extends SwingWorker<String, String> {

    private final XMPPConnection xmppc;
    Map<Mensaje, Long> lastTimeExec = new HashMap<Mensaje, Long>();
    Map<Mensaje, Iterator<Entry<Receiver, Integer>>> recIt = new HashMap<Mensaje, Iterator<Entry<Receiver, Integer>>>();
    Map<Mensaje, Message> messageCache = new HashMap<Mensaje, Message>();
    List<String> imagenCache;
    Entry<Mensaje, Long> current;

    /**
     *
     * @param xmppc
     * @param mensajes
     * @param imagenCache
     */
    public ImageMesageSender(XMPPConnection xmppc, Collection<Mensaje> mensajes, List<String> imagenCache) {
        this.xmppc = xmppc;
        this.imagenCache = imagenCache;
        Date date = new Date();
        for (Mensaje mensaje : mensajes) {
            lastTimeExec.put(mensaje, date.getTime());
            recIt.put(mensaje, mensaje.getReceptores().entrySet().iterator());
            messageCache.put(mensaje, cacheUp(mensaje.getMensaje()));
        }

    }

    @Override
    protected String doInBackground() {
        while (!isCancelled()) {
            determineCurrent();
            sendMensaje();
        }
        return null;
    }

    private Message cacheUp(String mensaje) {
        Message msg = new Message();
        StringTokenizer st = new StringTokenizer(mensaje);
        XHTMLTexto text = new XHTMLTexto(null, null);
        while (st.hasMoreTokens()) {
            dibujarTexto(st.nextToken());
            int size = imagenCache.size();
            text.appendImageTag(null, size + "", null, "cid:" + size, null);
        }
        XHTMLManager.addBody(msg, text.toString());
        return msg;
    }

    private void dibujarTexto(String texto) {
        int margen = 1;
        Font deriveFont = new Font("Serif", Font.BOLD, 15).deriveFont(15f);
        FontMetrics fm = FontDesignMetrics.getMetrics(deriveFont, new FontRenderContext(null, true, true));
        int stringWidth = fm.stringWidth(texto);
        int height = fm.getHeight();

        BufferedImage bi = new BufferedImage(stringWidth + 5, height + margen, 2);
        Graphics2D cg = bi.createGraphics();
        GraphicWork.inicializarGraphic(cg);
        cg.setFont(deriveFont);
        cg.setColor(Color.BLACK);
        cg.drawString(texto, 0, height - fm.getMaxDescent() - margen);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        try {
            ImageIO.write(bi, "png", out);
        } catch (IOException ex) {
            Logger.getLogger(ImageMesageSender.class.getName()).log(Level.SEVERE, null, ex);
        }
        imagenCache.add(Base64.encodeBytes(out.toByteArray()));
    }

    private void determineCurrent() {
        if (lastTimeExec.size() >= 2) {
            // System.out.println("lastTimeExec.values(). = " + lastTimeExec.entrySet());
            current = (Entry) lastTimeExec.entrySet().toArray()[0];
            for (Entry<Mensaje, Long> entry : lastTimeExec.entrySet()) {
                if (entry.getValue() + entry.getKey().getSnapTime() <= current.getValue() + current.getKey().getSnapTime()) {
                    current = entry;
                }
            }
        } else {
            current = (Entry) lastTimeExec.entrySet().toArray()[0];
        }
        try {
            System.out.println("durmiendo la siesta " + (current.getValue() + current.getKey().getSnapTime() - System.currentTimeMillis()));
            Thread.sleep(current.getValue() + current.getKey().getSnapTime() - System.currentTimeMillis());
        } catch (InterruptedException ex) {
            Logger.getLogger(ImageMesageSender.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void sendMensaje() {
        int enviados = 0;
        Iterator<Entry<Receiver, Integer>> get = recIt.get(current.getKey());
        while ((get.hasNext() && enviados < current.getKey().getSendsPerTime())) {
            Entry<Receiver, Integer> entry = get.next();
            if (entry.getValue() == current.getKey().getEnviado()) {
                ChatManager chatManager = xmppc.getChatManager();
                Chat chat = chatManager.createChat(entry.getKey().getUid() + "@" + xmppc.getHost(), null);
                try {
                    chat.sendMessage(messageCache.get(current.getKey()));
                } catch (XMPPException ex) {
                    Logger.getLogger(ImageMesageSender.class.getName()).log(Level.SEVERE, null, ex);
                }
//                System.out.println("mensaje enviado = " + messageCache.get(current.getKey()).toXML());
//                System.out.println(" a = " + entry.getKey().getUid() + xmppc.getHost());
                enviados++;
                entry.setValue(new Integer(entry.getValue().intValue() + 1));
            }
        }
        lastTimeExec.put(current.getKey(), new Date().getTime());
        if (!get.hasNext()) {
//            System.out.println("get no tiene siguiente ");
//            System.out.println("reiniciando get");
            current.getKey().setEnviado(current.getKey().getEnviado() + 1);
            recIt.put(current.getKey(), current.getKey().getReceptores().entrySet().iterator());
        }
    }
}
