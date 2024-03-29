/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.senactech.sistemaRH.view;
import br.com.senactech.sistemaRH.model.horaExtra;
import javax.swing.JOptionPane;
/**
 *
 * @author Marcia
 */
public class GUIHe extends javax.swing.JInternalFrame {

    /**
     * Creates new form GUIHe
     */
    public GUIHe() {
        initComponents();
    }
    
    public void calcularhe(){
        horaExtra he = new horaExtra();
        
        he.setValorHoraExtra(Integer.parseInt(jtfquanthe.getText()));
        he.setValorQuadroLotacao(Integer.parseInt(jtfqlhe.getText()));
       
        
        JOptionPane.showMessageDialog(null, "O valor total é: " + he.calcularHoraExtra());
        
        limpar();
    }
    
    public void limpar(){
        jtfqlhe.setText(null);
        jtfquanthe.setText(null);
         
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jdphe = new javax.swing.JDesktopPane();
        jlbltitulohe = new javax.swing.JLabel();
        jlblquanthe = new javax.swing.JLabel();
        jtfquanthe = new javax.swing.JTextField();
        jlblqlhe = new javax.swing.JLabel();
        jtfqlhe = new javax.swing.JTextField();
        jbhe = new javax.swing.JButton();
        jbsairhe = new javax.swing.JButton();

        setClosable(true);
        setMaximizable(true);

        jdphe.setBackground(new java.awt.Color(153, 255, 204));

        jlbltitulohe.setFont(new java.awt.Font("Sylfaen", 0, 24)); // NOI18N
        jlbltitulohe.setText("Hora Extra");

        jlblquanthe.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        jlblquanthe.setText("Quantidade de HE em R$:");

        jlblqlhe.setText("Quadro de Lotação:");

        jbhe.setText("Calcular");
        jbhe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbheActionPerformed(evt);
            }
        });

        jbsairhe.setText("Sair");

        jdphe.setLayer(jlbltitulohe, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdphe.setLayer(jlblquanthe, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdphe.setLayer(jtfquanthe, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdphe.setLayer(jlblqlhe, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdphe.setLayer(jtfqlhe, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdphe.setLayer(jbhe, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdphe.setLayer(jbsairhe, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jdpheLayout = new javax.swing.GroupLayout(jdphe);
        jdphe.setLayout(jdpheLayout);
        jdpheLayout.setHorizontalGroup(
            jdpheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jdpheLayout.createSequentialGroup()
                .addGroup(jdpheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jdpheLayout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(jlbltitulohe))
                    .addGroup(jdpheLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jdpheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jdpheLayout.createSequentialGroup()
                                .addComponent(jlblqlhe)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtfqlhe, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jdpheLayout.createSequentialGroup()
                                .addComponent(jlblquanthe)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtfquanthe, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jdpheLayout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(jbhe)
                        .addGap(51, 51, 51)
                        .addComponent(jbsairhe)))
                .addContainerGap(67, Short.MAX_VALUE))
        );
        jdpheLayout.setVerticalGroup(
            jdpheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jdpheLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbltitulohe)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jdpheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblquanthe)
                    .addComponent(jtfquanthe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jdpheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblqlhe)
                    .addComponent(jtfqlhe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addGroup(jdpheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbhe)
                    .addComponent(jbsairhe))
                .addGap(71, 71, 71))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdphe, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdphe, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbheActionPerformed
        calcularhe();
    }//GEN-LAST:event_jbheActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbhe;
    private javax.swing.JButton jbsairhe;
    private javax.swing.JDesktopPane jdphe;
    private javax.swing.JLabel jlblqlhe;
    private javax.swing.JLabel jlblquanthe;
    private javax.swing.JLabel jlbltitulohe;
    private javax.swing.JTextField jtfqlhe;
    private javax.swing.JTextField jtfquanthe;
    // End of variables declaration//GEN-END:variables
}
