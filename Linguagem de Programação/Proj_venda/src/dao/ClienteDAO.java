/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import factory.ConnectionFactory;
import modelo.*;
import java.sql.*;
import java.sql.PreparedStatement;
/**
 *
 * @author guara
 */
public class ClienteDAO {
    private Connection connection;
    
    public ClienteDAO(){
        this.connection= new ConnectionFactory().getConnection();
    }
    
    public void adiciona(Cliente cliente){
        String sql = "INSERT INTO clientes(cli_nome) VALUES(?)";
        try{
            PreparedStatement stmt= connection.prepareStatement(sql);
            // String id_aux=Integer.toString(cliente.getId());
            stmt.setString(1, cliente.getNome());
            stmt.execute();
            stmt.close();
        }
        catch (SQLException u){
            throw new RuntimeException(u);
        }
        
    }
}
