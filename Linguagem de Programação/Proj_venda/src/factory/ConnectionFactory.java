/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factory;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author guara
 */
public class ConnectionFactory {
        public Connection getConnection(){
            try{
                    return DriverManager.getConnection("jdbc:mysql://localhost/vendas","root", "inserir a senha do banco de dados");
            }
            catch(SQLException excecao){
                throw new RuntimeException(excecao);
            }
        }
}
