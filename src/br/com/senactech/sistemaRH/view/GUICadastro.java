/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.senactech.sistemaRH.view;

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

        setClosable(true);
        setMaximizable(true);

        jdpCadastro.setBackground(new java.awt.Color(153, 255, 204));

        jblTitulo2.setFont(new java.awt.Font("Sylfaen", 0, 24)); // NOI18N
        jblTitulo2.setText("Cadastro Usuário");

        jlbIdPessoa.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        jlbIdPessoa.setText("Digite o ID:");

        jlblnome.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        jlblnome.setText("Nome:");

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
                        .addGap(44, 44, 44)
                        .addGroup(jdpCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jdpCadastroLayout.createSequentialGroup()
                                .addComponent(jlblnome)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jtfnome, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jdpCadastroLayout.createSequentialGroup()
                                .addComponent(jlbIdPessoa)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtfIdPessoaCad, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jdpCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jdpCadastroLayout.createSequentialGroup()
                                    .addComponent(jlblsetor)
                                    .addGap(18, 18, 18)
                                    .addComponent(jrbrh)
                                    .addGap(32, 32, 32)
                                    .addComponent(jrbnrh))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jdpCadastroLayout.createSequentialGroup()
                                    .addComponent(jlbsenhacad)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(jdpCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jdpCadastroLayout.createSequentialGroup()
                                            .addGap(0, 0, Short.MAX_VALUE)
                                            .addComponent(jbcad)
                                            .addGap(18, 18, 18)
                                            .addComponent(jbsaircad)
                                            .addGap(25, 25, 25))
                                        .addComponent(jtfsenhacad)))))))
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
                    .addComponent(jlblsetor)
                    .addComponent(jrbrh)
                    .addComponent(jrbnrh))
                .addGap(18, 18, 18)
                .addGroup(jdpCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbsenhacad)
                    .addComponent(jtfsenhacad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jdpCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbcad)
                    .addComponent(jbsaircad))
                .addContainerGap(54, Short.MAX_VALUE))
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
        // TODO add your handling code here:
    }//GEN-LAST:event_jbcadActionPerformed


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
    private javax.swing.JRadioButton jrbnrh;
    private javax.swing.JRadioButton jrbrh;
    private javax.swing.JTextField jtfIdPessoaCad;
    private javax.swing.JTextField jtfnome;
    private javax.swing.JTextField jtfsenhacad;
    // End of variables declaration//GEN-END:variables
}
