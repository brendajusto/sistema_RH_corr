/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.senactech.sistemaRH.view;

import br.com.senactech.sistemaRH.model.usuario;
import br.com.senactech.sistemaRH.services.servicesFactory;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import br.com.senactech.sistemaRH.sistemaRHDAO.usuarioDAO;
import br.com.senactech.sistemaRH.sistemaRHDAO.DaoFactory;
import br.com.senactech.sistemaRH.services.usuarioServices;
/**
 *
 * @author Marcia
 */
public class GUICadastro extends javax.swing.JInternalFrame {

    /**
     * Creates new form GUICadastro
     */
    public GUICadastro() {
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

        jbgsetor = new javax.swing.ButtonGroup();
        jdpCadastro = new javax.swing.JDesktopPane();
        jblTitulo2 = new javax.swing.JLabel();
        jlbIdPessoa = new javax.swing.JLabel();
        jtfIdPessoaCad = new javax.swing.JTextField();
        jlblnome = new javax.swing.JLabel();
        jtfnome = new javax.swing.JTextField();
        jlblsetor = new javax.swing.JLabel();
        jrbrh = new javax.swing.JRadioButton();
        jrbnrh = new javax.swing.JRadioButton();
        jlbsenhacad = new javax.swing.JLabel();
        jtfsenhacad = new javax.swing.JTextField();
        jbcad = new javax.swing.JButton();
        jbsaircad = new javax.swing.JButton();
        jlcpf = new javax.swing.JLabel();
        jtfCPF = new javax.swing.JTextField();

        setClosable(true);
        setMaximizable(true);

        jdpCadastro.setBackground(new java.awt.Color(153, 255, 204));

        jblTitulo2.setFont(new java.awt.Font("Sylfaen", 0, 24)); // NOI18N
        jblTitulo2.setText("Cadastro Usuário");

        jlbIdPessoa.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        jlbIdPessoa.setText("Digite o ID:");

        jlblnome.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        jlblnome.setText("Nome:");

        jtfnome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfnomeActionPerformed(evt);
            }
        });

        jlblsetor.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        jlblsetor.setText("Setor:");

        jbgsetor.add(jrbrh);
        jrbrh.setText("Sou do RH");
        jrbrh.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jbgsetor.add(jrbnrh);
        jrbnrh.setText("Outro Setor");

        jlbsenhacad.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        jlbsenhacad.setText("Senha:");

        jbcad.setText("Cadastrar");
        jbcad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbcadActionPerformed(evt);
            }
        });

        jbsaircad.setText("Sair");

        jlcpf.setText("CPF:");

        jdpCadastro.setLayer(jblTitulo2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdpCadastro.setLayer(jlbIdPessoa, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdpCadastro.setLayer(jtfIdPessoaCad, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdpCadastro.setLayer(jlblnome, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdpCadastro.setLayer(jtfnome, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdpCadastro.setLayer(jlblsetor, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdpCadastro.setLayer(jrbrh, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdpCadastro.setLayer(jrbnrh, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdpCadastro.setLayer(jlbsenhacad, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdpCadastro.setLayer(jtfsenhacad, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdpCadastro.setLayer(jbcad, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdpCadastro.setLayer(jbsaircad, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdpCadastro.setLayer(jlcpf, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdpCadastro.setLayer(jtfCPF, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jdpCadastroLayout = new javax.swing.GroupLayout(jdpCadastro);
        jdpCadastro.setLayout(jdpCadastroLayout);
        jdpCadastroLayout.setHorizontalGroup(
            jdpCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jdpCadastroLayout.createSequentialGroup()
                .addGroup(jdpCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jdpCadastroLayout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(jblTitulo2))
                    .addGroup(jdpCadastroLayout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(jbcad)
                        .addGap(27, 27, 27)
                        .addComponent(jbsaircad))
                    .addGroup(jdpCadastroLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(jdpCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jdpCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jdpCadastroLayout.createSequentialGroup()
                                    .addComponent(jlbIdPessoa)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jtfIdPessoaCad, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jdpCadastroLayout.createSequentialGroup()
                                    .addComponent(jlblnome)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jtfnome, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jdpCadastroLayout.createSequentialGroup()
                                    .addComponent(jlcpf)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jtfCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jdpCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jdpCadastroLayout.createSequentialGroup()
                                    .addComponent(jlblsetor)
                                    .addGap(18, 18, 18)
                                    .addComponent(jrbrh)
                                    .addGap(18, 18, 18)
                                    .addComponent(jrbnrh))
                                .addGroup(jdpCadastroLayout.createSequentialGroup()
                                    .addComponent(jlbsenhacad)
                                    .addGap(18, 18, 18)
                                    .addComponent(jtfsenhacad, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(99, Short.MAX_VALUE))
        );
        jdpCadastroLayout.setVerticalGroup(
            jdpCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jdpCadastroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jblTitulo2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jdpCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbIdPessoa)
                    .addComponent(jtfIdPessoaCad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jdpCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblnome)
                    .addComponent(jtfnome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jdpCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlcpf)
                    .addComponent(jtfCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jdpCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblsetor)
                    .addComponent(jrbrh)
                    .addComponent(jrbnrh))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(jdpCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfsenhacad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbsenhacad))
                .addGap(27, 27, 27)
                .addGroup(jdpCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbcad)
                    .addComponent(jbsaircad))
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdpCadastro)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdpCadastro, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbcadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbcadActionPerformed
      cadUsuario();  

    
    }//GEN-LAST:event_jbcadActionPerformed

    public void cadUsuario() {
       usuario us = new usuario();
       us.setNome(jtfnome.getText());
       us.setCpf(jtfCPF.getText());
       us.setIdUsuario(Integer.parseInt(jtfIdPessoaCad.getText()));
       us.setSenha(jtfsenhacad.getText());
      
        try {
         usuarioServices uss = servicesFactory.getusuarioServices();
       uss.cadUsuarioBD(us);   
        } catch (SQLException e) {
          JOptionPane.showMessageDialog(null, "Erro ao cadastrar" + e.getMessage());  
          
        } finally{
            
            JOptionPane.showMessageDialog(null, "Usuario cadastrado com sucesso!" + us.getNome());
        }
    }
    
    private void jtfnomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfnomeActionPerformed
       
    }//GEN-LAST:event_jtfnomeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbcad;
    private javax.swing.ButtonGroup jbgsetor;
    private javax.swing.JLabel jblTitulo2;
    private javax.swing.JButton jbsaircad;
    private javax.swing.JDesktopPane jdpCadastro;
    private javax.swing.JLabel jlbIdPessoa;
    private javax.swing.JLabel jlblnome;
    private javax.swing.JLabel jlblsetor;
    private javax.swing.JLabel jlbsenhacad;
    private javax.swing.JLabel jlcpf;
    private javax.swing.JRadioButton jrbnrh;
    private javax.swing.JRadioButton jrbrh;
    private javax.swing.JTextField jtfCPF;
    private javax.swing.JTextField jtfIdPessoaCad;
    private javax.swing.JTextField jtfnome;
    private javax.swing.JTextField jtfsenhacad;
    // End of variables declaration//GEN-END:variables

}



