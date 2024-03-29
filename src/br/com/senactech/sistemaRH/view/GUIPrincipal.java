
 
package br.com.senactech.sistemaRH.view;

import javax.swing.event.InternalFrameEvent;
import javax.swing.event.InternalFrameListener;
import br.com.senactech.sistemaRH.model.turnover;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import br.com.senactech.sistemaRH.services.usuarioServices;
import br.com.senactech.sistemaRH.services.servicesFactory;
import br.com.senactech.sistemaRH.model.usuario;

/**
 *
 * @author Marcia
 */
public class GUIPrincipal extends javax.swing.JFrame implements InternalFrameListener{
    private boolean flagMenu = false;
    private boolean flagCadastro = false;
    private boolean flagQuadroLotacao;
    private Object jdpmenu;
    private Object jdpql;

    /**
     * Creates new form GUIMenu
     */
    public GUIPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jdpPrincipal = new javax.swing.JDesktopPane();
        jlblidPessoa = new javax.swing.JLabel();
        jtfidPessoa = new javax.swing.JTextField();
        jlblsenha = new javax.swing.JLabel();
        jpfsenha = new javax.swing.JPasswordField();
        jbentrar = new javax.swing.JButton();
        jlblTitulo = new javax.swing.JLabel();
        jbCadastro = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jdpPrincipal.setBackground(new java.awt.Color(204, 255, 204));

        jlblidPessoa.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        jlblidPessoa.setText("Usuário:");

        jlblsenha.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        jlblsenha.setText("Senha:");

        jbentrar.setText("Entrar");
        jbentrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbentrarActionPerformed(evt);
            }
        });

        jlblTitulo.setFont(new java.awt.Font("Sylfaen", 0, 24)); // NOI18N
        jlblTitulo.setText("SYSTEM HUMANS");

        jbCadastro.setText("Sem cadastro");
        jbCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCadastroActionPerformed(evt);
            }
        });

        jdpPrincipal.setLayer(jlblidPessoa, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdpPrincipal.setLayer(jtfidPessoa, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdpPrincipal.setLayer(jlblsenha, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdpPrincipal.setLayer(jpfsenha, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdpPrincipal.setLayer(jbentrar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdpPrincipal.setLayer(jlblTitulo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdpPrincipal.setLayer(jbCadastro, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jdpPrincipalLayout = new javax.swing.GroupLayout(jdpPrincipal);
        jdpPrincipal.setLayout(jdpPrincipalLayout);
        jdpPrincipalLayout.setHorizontalGroup(
            jdpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jdpPrincipalLayout.createSequentialGroup()
                .addGroup(jdpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jdpPrincipalLayout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addGroup(jdpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jbentrar)
                            .addGroup(jdpPrincipalLayout.createSequentialGroup()
                                .addComponent(jlblsenha)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jpfsenha, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jdpPrincipalLayout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jlblidPessoa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jdpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlblTitulo)
                            .addComponent(jtfidPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jdpPrincipalLayout.createSequentialGroup()
                        .addGap(172, 172, 172)
                        .addComponent(jbCadastro)))
                .addContainerGap(127, Short.MAX_VALUE))
        );
        jdpPrincipalLayout.setVerticalGroup(
            jdpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jdpPrincipalLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jlblTitulo)
                .addGap(49, 49, 49)
                .addGroup(jdpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblidPessoa)
                    .addComponent(jtfidPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jdpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblsenha)
                    .addComponent(jpfsenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addComponent(jbentrar)
                .addGap(18, 18, 18)
                .addComponent(jbCadastro)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdpPrincipal, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdpPrincipal)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbentrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbentrarActionPerformed
        if (!flagMenu){
            GUIMenu menu = new GUIMenu();
            jdpPrincipal.add(menu);
            menu.setVisible(true);
        }
        
       
    }//GEN-LAST:event_jbentrarActionPerformed

    private void jbCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCadastroActionPerformed
        if (!flagCadastro){
           GUICadastro cad = new GUICadastro();
           jdpPrincipal.add(cad);
           cad.setVisible(true);
        }
           
    }//GEN-LAST:event_jbCadastroActionPerformed

    
            
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
            java.util.logging.Logger.getLogger(GUIPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JButton jbCadastro;
    private javax.swing.JButton jbentrar;
    public static javax.swing.JDesktopPane jdpPrincipal;
    private javax.swing.JLabel jlblTitulo;
    private javax.swing.JLabel jlblidPessoa;
    private javax.swing.JLabel jlblsenha;
    private javax.swing.JPasswordField jpfsenha;
    private javax.swing.JTextField jtfidPessoa;
    // End of variables declaration//GEN-END:variables

    @Override
    public void internalFrameOpened(InternalFrameEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void internalFrameClosing(InternalFrameEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void internalFrameClosed(InternalFrameEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void internalFrameIconified(InternalFrameEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void internalFrameDeiconified(InternalFrameEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void internalFrameActivated(InternalFrameEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void internalFrameDeactivated(InternalFrameEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
