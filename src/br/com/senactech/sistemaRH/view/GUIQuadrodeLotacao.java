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
public class GUIQuadrodeLotacao extends javax.swing.JInternalFrame {

    static Object jdpPrincipal;

    /**
     * Creates new form GUIQuadrodeLotacao
     */
    public GUIQuadrodeLotacao() {
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

        jdpql = new javax.swing.JDesktopPane();
        jlblcolabativos = new javax.swing.JLabel();
        jlbltituloql = new javax.swing.JLabel();
        jtfcolabativos = new javax.swing.JTextField();
        jlblcolabja = new javax.swing.JLabel();
        jtfcolabja = new javax.swing.JTextField();
        jbcalcql = new javax.swing.JButton();
        jbqlsair = new javax.swing.JButton();

        setClosable(true);
        setMaximizable(true);

        jdpql.setBackground(new java.awt.Color(204, 255, 204));

        jlblcolabativos.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        jlblcolabativos.setText("Digite a quantidade de colaboradores ativos:");

        jlbltituloql.setFont(new java.awt.Font("Sylfaen", 0, 24)); // NOI18N
        jlbltituloql.setText("Quadro de Lotação");

        jlblcolabja.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        jlblcolabja.setText("Digite a quantidade de joven aprendiz:");

        jbcalcql.setText("Calcular");

        jbqlsair.setText("Sair");

        jdpql.setLayer(jlblcolabativos, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdpql.setLayer(jlbltituloql, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdpql.setLayer(jtfcolabativos, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdpql.setLayer(jlblcolabja, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdpql.setLayer(jtfcolabja, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdpql.setLayer(jbcalcql, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdpql.setLayer(jbqlsair, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jdpqlLayout = new javax.swing.GroupLayout(jdpql);
        jdpql.setLayout(jdpqlLayout);
        jdpqlLayout.setHorizontalGroup(
            jdpqlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jdpqlLayout.createSequentialGroup()
                .addGroup(jdpqlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jdpqlLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jlblcolabativos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfcolabativos, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jdpqlLayout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(jlbltituloql))
                    .addGroup(jdpqlLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jlblcolabja)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfcolabja, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jdpqlLayout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(jbcalcql)
                        .addGap(54, 54, 54)
                        .addComponent(jbqlsair)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jdpqlLayout.setVerticalGroup(
            jdpqlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jdpqlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbltituloql)
                .addGap(41, 41, 41)
                .addGroup(jdpqlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblcolabativos)
                    .addComponent(jtfcolabativos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jdpqlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblcolabja)
                    .addComponent(jtfcolabja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addGroup(jdpqlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbcalcql)
                    .addComponent(jbqlsair))
                .addGap(52, 52, 52))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdpql, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdpql, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbcalcql;
    private javax.swing.JButton jbqlsair;
    public static javax.swing.JDesktopPane jdpql;
    private javax.swing.JLabel jlblcolabativos;
    private javax.swing.JLabel jlblcolabja;
    private javax.swing.JLabel jlbltituloql;
    private javax.swing.JTextField jtfcolabativos;
    private javax.swing.JTextField jtfcolabja;
    // End of variables declaration//GEN-END:variables
}
