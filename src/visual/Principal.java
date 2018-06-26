/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package visual;

import clases.entidades.Estudiante;
import clases.entidades.Mensaje;
import clases.xmpp.bob.provider.BobProvider;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jivesoftware.smack.ConnectionConfiguration;
import org.jivesoftware.smack.XMPPConnection;
import org.jivesoftware.smack.XMPPException;
import org.jivesoftware.smack.filter.PacketTypeFilter;
import org.jivesoftware.smack.packet.Presence;
import org.jivesoftware.smack.provider.ProviderManager;
import clases.xmpp.bob.listener.BobListener;
import clases.xmpp.bob.packet.Bob;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author fabiel
 */
public class Principal extends javax.swing.JFrame {

    private final ConnConfVisual ccv;
    private XMPPConnection xmppc;
    private final List<String> cache;
    private ImageMesageSender ims;
    private Mensajes m;
    private final Collection<Mensaje> mensajes = Collections.synchronizedList(new ArrayList<Mensaje>());

    /**
     * Creates new form Principal
     */
    public Principal() throws XMPPException, IOException, ClassNotFoundException {

        //  this.cache = new ArrayList<String>();
        this.cache = Collections.synchronizedList(new ArrayList<String>());
        initComponents();
        setLocationRelativeTo(null);
        ccv = new ConnConfVisual(this, true);
        prueba:
        {
            List<Estudiante> synchronizedList = Collections.synchronizedList(new ArrayList<Estudiante>());
            synchronizedList.add(new Estudiante("fleon", "90121105622"));
            //  synchronizedList.add(new Estudiante("fléon", "90121105623"));
            //  synchronizedList.add(new Estudiante("fléón", "90121105624"));
            Mensaje mensaje0 = new Mensaje("el mundo", "joder  ", synchronizedList, 5000L);
            mensaje0.setSendsPerTime(3);
            mensajes.add(mensaje0);
            //  mensajes.add(new Mensaje("el mundo2", "el mundo esta del carajo \n SnapTime 1min \n", synchronizedList, 60000L));
            //  mensajes.add(new Mensaje("el mundo3", "el mundo esta del carajo  \n SnapTime 1min y medio \n", synchronizedList, 90000L));
        }
        editarCuenta();
        if (ccv.getConf().isMensaje()) {
        }

    }

    private void editarCuenta() throws IOException {
        ccv.setVisible(true);
        if (ccv.getReturnStatus() == ConnConfVisual.RET_OK) {
            ConnectionConfiguration cc = ccv.getConnectionConfiguration();
            xmppc = new XMPPConnection(cc);
            try {
                xmppc.connect();
                xmppc.login(ccv.getUsuario(), ccv.getPassword(), "JXMPP");
            } catch (XMPPException ex) {
                System.out.println("cathc ex ");
                System.out.println("ex LocalizedMessage= " + ex.getLocalizedMessage());
                System.out.println("ex Message= " + ex.getMessage());
                System.out.println("ex String= " + ex.toString());
                System.out.println("ex Class= " + ex.getClass());
                if ("SASL authentication PLAIN failed: not-authorized".equals(ex.getMessage())) {
                    editarCuenta();
                    return;
                }
            }

            BobListener packetListenerImpl = new BobListener(xmppc, cache);
            xmppc.addPacketListener(packetListenerImpl, new PacketTypeFilter(Bob.class));

            if (xmppc.isAuthenticated()) {
                ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("conf"));
                oos.writeObject(ccv.getConf());
                oos.flush();
                oos.close();
            }
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jBEnviar = new javax.swing.JButton();
        jBConMess = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        JMIExit = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMIDelUnusedUsers = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Modo Auto Mensaje"));

        jBEnviar.setText("Enviar Mensajes");
        jBEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEnviarActionPerformed(evt);
            }
        });

        jBConMess.setText("Configurar Mensajes");
        jBConMess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBConMessActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jBConMess)
            .addComponent(jBEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jBConMess)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBEnviar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMenu1.setText("File");

        jMenuItem1.setText("jMenuItem1");
        jMenu1.add(jMenuItem1);

        JMIExit.setText("Exit");
        JMIExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMIExitActionPerformed(evt);
            }
        });
        jMenu1.add(JMIExit);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");

        jMenuItem4.setText("Agregar Grupo");
        jMenu2.add(jMenuItem4);

        jMenuItem3.setText("Agregar Usuario");
        jMenu2.add(jMenuItem3);

        jMenuItem5.setText("Eliminar Usuario");
        jMenu2.add(jMenuItem5);

        jMIDelUnusedUsers.setText("Eliminar Usuarios Inexistentes");
        jMenu2.add(jMIDelUnusedUsers);

        jMenuItem2.setText("Editar Cuenta");
        jMenu2.add(jMenuItem2);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 196, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JMIExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMIExitActionPerformed
        xmppc.disconnect(new Presence(Presence.Type.available, "No Estoy", 5, Presence.Mode.available));
        dispose();
    }//GEN-LAST:event_JMIExitActionPerformed

    private void jBEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEnviarActionPerformed
        if ("Enviar Mensajes".equals(evt.getActionCommand())) {
            //            try {
            boolean authenticated = xmppc.isAuthenticated();
            if (authenticated) {
                ims = new ImageMesageSender(xmppc, mensajes, cache);
            } else {
                try {
                    editarCuenta();
                    return;
                } catch (IOException ex) {
                    Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            jBEnviar.setText("Cancelar");
            jBEnviar.setActionCommand("Cancelar");
            // setTextFieldText(buttonTextAction + "...");
            ims.execute();
        } else if ("Cancelar".equals(evt.getActionCommand())) {
            jBEnviar.setText("Enviar Mensajes");
            jBEnviar.setActionCommand("Enviar Mensajes");
            ims.cancel(true);

        }
    }//GEN-LAST:event_jBEnviarActionPerformed

    private void jBConMessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBConMessActionPerformed
        if (m == null) {
            m = new Mensajes(this, true, mensajes);
        }
        m.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jBConMessActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        ProviderManager instance = ProviderManager.getInstance();
        instance.addIQProvider("data", "urn:xmpp:bob", new BobProvider());
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    new Principal().setVisible(true);
                } catch (XMPPException ex) {
                    Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem JMIExit;
    private javax.swing.JButton jBConMess;
    private javax.swing.JButton jBEnviar;
    private javax.swing.JMenuItem jMIDelUnusedUsers;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}