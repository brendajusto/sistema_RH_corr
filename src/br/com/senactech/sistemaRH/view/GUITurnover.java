/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.senactech.sistemaRH.view;
import br.com.senactech.sistemaRH.model.turnover;
/**
 *
 * @author Marcia
 */
public class GUITurnover extends javax.swing.JInternalFrame {

    /**
     * Creates new form GUITurnover
     */
    public GUITurnover() {
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

        jdpturnover = new javax.swing.JDesktopPane();
        jlbltituloturnover = new javax.swing.JLabel();
        jlblndemi = new javax.swing.JLabel();
        jtfndemi = new javax.swing.JTextField();
        jlblnadm = new javax.swing.JLabel();
        jtfnadm = new javax.swing.JTextField();
        jlblqlt = new javax.swing.JLabel();
        jtfqlt = new javax.swing.JTextField();
        jbcalct = new javax.swing.JButton();
        jbsairt = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 255, 102));
        setClosable(true);
        setMaximizable(true);

        jdpturnover.setBackground(new java.awt.Color(204, 255, 102));

        jlbltituloturnover.setFont(new java.awt.Font("Sylfaen", 0, 24)); // NOI18N
        jlbltituloturnover.setText("Turnover");

        jlblndemi.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        jlblndemi.setText("Número de demissões:");

        jlblnadm.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        jlblnadm.setText("Número de admissões:");

        jlblqlt.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        jlblqlt.setText("Número do QL:");

        jbcalct.setText("Calcular");
        jbcalct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbcalctActionPerformed(evt);
            }
        });

        jbsairt.setText("Sair");

        jdpturnover.setLayer(jlbltituloturnover, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdpturnover.setLayer(jlblndemi, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdpturnover.setLayer(jtfndemi, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdpturnover.setLayer(jlblnadm, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdpturnover.setLayer(jtfnadm, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdpturnover.setLayer(jlblqlt, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdpturnover.setLayer(jtfqlt, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdpturnover.setLayer(jbcalct, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdpturnover.setLayer(jbsairt, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jdpturnoverLayout = new javax.swing.GroupLayout(jdpturnover);
        jdpturnover.setLayout(jdpturnoverLayout);
        jdpturnoverLayout.setHorizontalGroup(
            jdpturnoverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jdpturnoverLayout.createSequentialGroup()
                .addGroup(jdpturnoverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jdpturnoverLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jdpturnoverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jdpturnoverLayout.createSequentialGroup()
                                .addComponent(jlblnadm)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtfnadm))
                            .addGroup(jdpturnoverLayout.createSequentialGroup()
                                .addComponent(jlblndemi)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtfndemi, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jdpturnoverLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jlblqlt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtfqlt, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jdpturnoverLayout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(jbcalct)
                        .addGap(47, 47, 47)
                        .addComponent(jbsairt))
                    .addGroup(jdpturnoverLayout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(jlbltituloturnover)))
                .addContainerGap(82, Short.MAX_VALUE))
        );
        jdpturnoverLayout.setVerticalGroup(
            jdpturnoverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jdpturnoverLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbltituloturnover)
                .addGap(18, 18, 18)
                .addGroup(jdpturnoverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblndemi)
                    .addComponent(jtfndemi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jdpturnoverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblnadm)
                    .addComponent(jtfnadm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jdpturnoverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblqlt)
                    .addComponent(jtfqlt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jdpturnoverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbcalct)
                    .addComponent(jbsairt))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdpturnover, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdpturnover, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbcalctActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbcalctActionPerformed
        int dm = Integer.parseInt(jtfndemi.getText());
        int ad = Integer.parseInt(jtfnadm.getText());
        int ql = Integer.parseInt(jtfqlt.getText());
        
        
        
        
       
    }//GEN-LAST:event_jbcalctActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbcalct;
    private javax.swing.JButton jbsairt;
    private javax.swing.JDesktopPane jdpturnover;
    private javax.swing.JLabel jlblnadm;
    private javax.swing.JLabel jlblndemi;
    private javax.swing.JLabel jlblqlt;
    private javax.swing.JLabel jlbltituloturnover;
    private javax.swing.JTextField jtfnadm;
    private javax.swing.JTextField jtfndemi;
    private javax.swing.JTextField jtfqlt;
    // End of variables declaration//GEN-END:variables
}