/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Home;

/**
 *
 * @author Ruan
 */
public class exerTricepis extends javax.swing.JInternalFrame {

    /**
     * Creates new form exerTricepis
     */
    public exerTricepis() {
        initComponents();
        setSize(650,400);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Desktop = new javax.swing.JDesktopPane();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        getContentPane().setLayout(null);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Background (27).png"))); // NOI18N
        Desktop.add(jLabel2);
        jLabel2.setBounds(290, 60, 280, 190);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Segure o halter, flexione o joelho e ");
        Desktop.add(jLabel3);
        jLabel3.setBounds(20, 90, 270, 16);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("se flexione em um ângulo de 45°, ");
        Desktop.add(jLabel4);
        jLabel4.setBounds(20, 120, 290, 16);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("trave o cotovelo nas suas costas , ");
        Desktop.add(jLabel5);
        jLabel5.setBounds(20, 150, 260, 16);

        jLabel6.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText(" e estique o máximo possível a carga  , e");
        Desktop.add(jLabel6);
        jLabel6.setBounds(20, 180, 310, 16);

        jLabel7.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText(" na volta não passe da linha do cotovelo.");
        Desktop.add(jLabel7);
        jLabel7.setBounds(20, 210, 280, 20);

        jLabel8.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Trícepis");
        Desktop.add(jLabel8);
        jLabel8.setBounds(50, 40, 140, 26);

        jButton1.setText("Próximo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        Desktop.add(jButton1);
        jButton1.setBounds(423, 260, 100, 23);

        jButton2.setText("Volatr");
        Desktop.add(jButton2);
        jButton2.setBounds(20, 260, 61, 23);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Background (3).png"))); // NOI18N
        Desktop.add(jLabel1);
        jLabel1.setBounds(0, 0, 559, 315);

        getContentPane().add(Desktop);
        Desktop.setBounds(0, 0, 730, 400);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    exerTricepis2 x = new exerTricepis2();
x.setVisible(true);
Desktop.add(x);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane Desktop;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    // End of variables declaration//GEN-END:variables
}