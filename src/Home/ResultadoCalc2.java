/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Home;
import Classes.Conexao;
import Classes.Doenca;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Ruan
 */
public class ResultadoCalc2 extends javax.swing.JInternalFrame {
 Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    /**
     * Creates new form ResultadoCalc2
     */
    public ResultadoCalc2() {
        initComponents();
     setSize(650,400);
      conexao = Conexao.conector();
      ver();
    }
    
    
private void ver(){
    Doenca doe = new Doenca();
  
    if(doe.getIddoencausu()==1){
        String sql = "Select * from alimentos where doenca_iddoenca = 1";
        try {
            pst = conexao.prepareStatement(sql);
            rs = pst.executeQuery();
            DefaultTableModel model =(DefaultTableModel) jTable1.getModel();
   model.setNumRows(0);
   while(rs.next())
   {
       model.addRow(new Object[] 
       { 
          //retorna os dados da tabela do BD, cada campo e um coluna.
          rs.getString("doenca_iddoenca"),
          rs.getString("descricao"),
       }); 
  }    
    }catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
     if(doe.getIddoencausu()==2){
        String sql = "Select * from alimentos where doenca_iddoenca = 2";
        try {
            pst = conexao.prepareStatement(sql);
            rs = pst.executeQuery();
            DefaultTableModel model =(DefaultTableModel) jTable1.getModel();
   model.setNumRows(0);
   while(rs.next())
   {
       model.addRow(new Object[] 
       { 
          //retorna os dados da tabela do BD, cada campo e um coluna.
          rs.getString("doenca_iddoenca"),
          rs.getString("descricao"),
       }); 
  }    
    }catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
     
      if(doe.getIddoencausu()==3){
        String sql = "Select * from alimentos where doenca_iddoenca = 3";
        try {
            pst = conexao.prepareStatement(sql);
            rs = pst.executeQuery();
            DefaultTableModel model =(DefaultTableModel) jTable1.getModel();
   model.setNumRows(0);
   while(rs.next())
   {
       model.addRow(new Object[] 
       { 
          //retorna os dados da tabela do BD, cada campo e um coluna.
          rs.getString("doenca_iddoenca"),
          rs.getString("descricao"),
       }); 
  }    
    }catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
      
       if(doe.getIddoencausu()==4){
        String sql = "Select * from alimentos where doenca_iddoenca = 4 ";
        try {
            pst = conexao.prepareStatement(sql);
            rs = pst.executeQuery();
            DefaultTableModel model =(DefaultTableModel) jTable1.getModel();
   model.setNumRows(0);
   while(rs.next())
   {
       model.addRow(new Object[] 
       { 
          //retorna os dados da tabela do BD, cada campo e um coluna.
          rs.getString("doenca_iddoenca"),
          rs.getString("descricao"),
       }); 
  }    
    }catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
       
        if(doe.getIddoencausu()==5){
        String sql = "Select * from alimentos where doenca_iddoenca = 5";
        try {
            pst = conexao.prepareStatement(sql);
            rs = pst.executeQuery();
            DefaultTableModel model =(DefaultTableModel) jTable1.getModel();
   model.setNumRows(0);
   while(rs.next())
   {
       model.addRow(new Object[] 
       { 
          //retorna os dados da tabela do BD, cada campo e um coluna.
          rs.getString("doenca_iddoenca"),
          rs.getString("descricao"),
       }); 
  }    
    }catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
        
         if(doe.getIddoencausu()==6){
        String sql = "Select * from alimentos where doenca_iddoenca = 6";
        try {
            pst = conexao.prepareStatement(sql);
            rs = pst.executeQuery();
            DefaultTableModel model =(DefaultTableModel) jTable1.getModel();
   model.setNumRows(0);
   while(rs.next())
   {
       model.addRow(new Object[] 
       { 
          //retorna os dados da tabela do BD, cada campo e um coluna.
          rs.getString("doenca_iddoenca"),
          rs.getString("descricao"),
       }); 
  }    
    }catch (Exception e) {
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

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();

        getContentPane().setLayout(null);

        jButton1.setText("Voltar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(20, 270, 100, 30);

        jButton2.setText("Sair");
        getContentPane().add(jButton2);
        jButton2.setBounds(440, 270, 100, 30);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "id", "alimentos", "Title 3"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        getContentPane().add(jTable1);
        jTable1.setBounds(40, 40, 480, 200);

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Background (3).png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 560, 320);
        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(60, 30, 3, 210);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
