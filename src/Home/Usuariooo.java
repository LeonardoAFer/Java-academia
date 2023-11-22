/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Home;

import Classes.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Acer
 */
public class Usuariooo extends javax.swing.JInternalFrame {

    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    public static int idUser = 0;

    /**
     * Creates new form CadUsuario
     */
    public Usuariooo() {
        initComponents();
        setSize(800, 500);
        conexao = Conexao.conector();

    }

    public void logar() {
        String sql = "select * from cadastro_usuario where nome=? and senha=?";

        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, txtLogin.getText());
            pst.setString(2, txtSenha.getText());

            //A linha abaixo executa a query
            rs = pst.executeQuery();
            if (rs.next()) {
                idUser = rs.getInt(1);
                OpUsu ad = new OpUsu();
                ad.setVisible(true);
                Desktop.add(ad);
jButton1.setVisible(false);
        txtLogin.setVisible(false);
        txtSenha.setVisible(false);
            } else {

                JOptionPane.showMessageDialog(null, "Usuario ou senha incorreto");
            }
            //Fecha a conexão.
            conexao.close();

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e);

        }

    }

    //Método adicionar
    //Fim do método adicionar
    //Método consultar
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtLogin = new javax.swing.JTextField();
        txtSenha = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Desktop = new javax.swing.JDesktopPane();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        getContentPane().setLayout(null);

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Informe seu nome");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(110, 130, 170, 18);

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Informe seu senha");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(110, 200, 140, 18);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Background (5).png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(170, 50, 614, 77);
        getContentPane().add(txtLogin);
        txtLogin.setBounds(110, 150, 330, 30);

        txtSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSenhaActionPerformed(evt);
            }
        });
        getContentPane().add(txtSenha);
        txtSenha.setBounds(110, 220, 330, 30);

        jButton1.setBackground(new java.awt.Color(102, 0, 153));
        jButton1.setText("Entrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(220, 270, 110, 23);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Background (3).png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 560, 320);

        Desktop.setLayout(new java.awt.BorderLayout());
        getContentPane().add(Desktop);
        Desktop.setBounds(0, 0, 1000, 1000);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        logar();

        


    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSenhaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane Desktop;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txtLogin;
    private javax.swing.JTextField txtSenha;
    // End of variables declaration//GEN-END:variables

}
