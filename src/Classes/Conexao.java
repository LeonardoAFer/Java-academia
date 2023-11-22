/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author marcelo_eger
 */
public class Conexao {
    
    
    public static Connection conector(){
    
       java.sql.Connection conexao = null;
        //Carrega o driver
        String driver = "com.mysql.cj.jdbc.Driver";
        //Armazenando informações referente ao banco
        String url = "jdbc:mysql://localhost:3306/mydb";
        String user = "root";
        String password = ""; 
        
          try {
            Class.forName(driver);
            conexao =  DriverManager.getConnection(url, user, password);
            return conexao;
            
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
            return null;
        }        
    } 
       
}
