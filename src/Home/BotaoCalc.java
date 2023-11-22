/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Home;

import Classes.Conexao;
import Classes.Dados;
import static Home.Usuariooo.idUser;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author marcelo_eger
 */
public class BotaoCalc extends javax.swing.JInternalFrame {

    Connection conexao = null;
    PreparedStatement pst = null;
    

    /**
     * Creates new form BotaoAlimenta
     */
    public BotaoCalc() {
        initComponents();
        setSize(650, 400);
        conexao = Conexao.conector();
    }

    private void adicionar() {
        String sql = "insert into info_usuario(idade,peso,altura,cadastro_usuario_idcadastro_usuario) values(?,?,?,?)";

        Dados user = new Dados();
        user.setAltura((int) spnAltura.getValue());
        user.setIdade((int) spnIdade.getValue());
        user.setPeso((int)spnPeso.getValue());
      

        if (user.getAltura() == 0) {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos obrigatórios");
        } else {

            try {
                pst = conexao.prepareStatement(sql);
                pst.setInt(1, user.getIdade());
                pst.setInt(2, user.getPeso());
                pst.setInt(3, user.getAltura());
                pst.setInt(4, Usuariooo.idUser);
                
                
                int adicionado = pst.executeUpdate();

                if (adicionado > 0) {
                    JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso");
                } else {
                    JOptionPane.showMessageDialog(null, "Ha um erro na inserção");
                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);

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

        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        spnIdade = new javax.swing.JSpinner();
        spnAltura = new javax.swing.JSpinner();
        spnPeso = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        desktop = new javax.swing.JDesktopPane();

        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Dados");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(40, 20, 200, 70);

        jLabel5.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Informe seu peso");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(40, 170, 170, 18);

        jLabel4.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Informe sua idade");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(300, 100, 130, 18);

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Informe sua Altura");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(40, 100, 130, 18);

        jButton1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(153, 0, 255));
        jButton1.setText("Voltar");
        getContentPane().add(jButton1);
        jButton1.setBounds(40, 250, 100, 30);

        jButton2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(153, 0, 255));
        jButton2.setText("Pág.1/2 >");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(410, 250, 100, 30);
        getContentPane().add(spnIdade);
        spnIdade.setBounds(300, 120, 70, 30);
        getContentPane().add(spnAltura);
        spnAltura.setBounds(40, 120, 70, 30);
        getContentPane().add(spnPeso);
        spnPeso.setBounds(40, 200, 70, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Background (3).png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 560, 320);
        getContentPane().add(desktop);
        desktop.setBounds(0, 0, 740, 470);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
adicionar();      
        spnAltura.setVisible(false);
        spnPeso.setVisible(false);
        spnIdade.setVisible(false);

        jButton1.setVisible(false);
        jButton2.setVisible(false);

        BotaoCalc2 sa = new BotaoCalc2();
        sa.setVisible(true);
        desktop.add(sa);          // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktop;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JSpinner spnAltura;
    private javax.swing.JSpinner spnIdade;
    private javax.swing.JSpinner spnPeso;
    // End of variables declaration//GEN-END:variables
}