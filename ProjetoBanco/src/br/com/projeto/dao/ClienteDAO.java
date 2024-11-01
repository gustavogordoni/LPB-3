/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.projeto.dao;

import br.com.projeto.jdbc.ConnectionFactory;
import br.com.projeto.model.ClienteModel;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


/**
 *
 * @author live
 */
public class ClienteDAO {
    private Connection con;
    
    public ClienteDAO(){
        this.con = new ConnectionFactory().getConnection("", "", "");
    }
    
    public boolean cadastrarCliente(ClienteModel objCliente){
        try {
            String sql = "INSERT INTO cliente(cod, nome, cpf, rua, numero, bairro, estado, telefone, genero) VALUES (default, ?, ?, ?, ?, ?, ?, ?, ?);";
            
            PreparedStatement pmst = con.prepareStatement(sql);
            pmst.setString(1,objCliente.getNome());
            pmst.setString(2,objCliente.getCpf());
            pmst.setString(3,objCliente.getRua());
            pmst.setInt(4,objCliente.getNumero());
            pmst.setString(5,objCliente.getBairro());
            pmst.setString(6,objCliente.getEstado());
            pmst.setString(7,objCliente.getTelefone());
            pmst.setString(8,objCliente.getGenero());
                        
            pmst.execute();            
            pmst.close();
            
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro SQL: " + e.getMessage());
            return false;
        }
    }
    
    public List<ClienteModel> listaClientes(){
        try {
            List<ClienteModel> lista  = new ArrayList<>();
            String sql = "SELECT * FROM cliente;";
              PreparedStatement pmst = con.prepareStatement(sql);
              ResultSet rs = pmst.executeQuery();
             
              while (rs.next()) {                
                ClienteModel clienteModel = new ClienteModel();
                clienteModel.setCodcli(rs.getInt("cod"));
                clienteModel.setNome(rs.getString("nome"));
                clienteModel.setCpf(rs.getString("cpf"));
                clienteModel.setRua(rs.getString("rua"));
                clienteModel.setNumero(rs.getInt("numero"));
                clienteModel.setBairro(rs.getString("bairro"));
                clienteModel.setEstado(rs.getString("estado"));
                clienteModel.setTelefone(rs.getString("telefone"));
                clienteModel.setGenero(rs.getString("genero"));
                lista.add(clienteModel);
            }
              return lista;
                      
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro SQL: " + e.getMessage());
            return null;
        }
    }
    
    public void atualizar(ClienteModel clienteModel){
        try{            
            String sql = "UPDATE cliente SET nome = ?, cpf = ?, rua = ?, numero = ?, bairro = ?, estado = ?, telefone = ?, genero = ? WHERE cod = ?";
            
            PreparedStatement pst=con.prepareStatement(sql);
            pst.setString(1,clienteModel.getNome());
            pst.setString(2,clienteModel.getCpf());
            pst.setString(3,clienteModel.getRua());
            pst.setInt(4,clienteModel.getNumero());
            pst.setString(5,clienteModel.getBairro());
            pst.setString(6,clienteModel.getEstado());
            pst.setString(7,clienteModel.getTelefone());
            pst.setString(8,clienteModel.getGenero());
            pst.setInt(9,clienteModel.getCodcli());
                        
            pst.executeUpdate();
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null,
              "Erro de atualização: "+e.getMessage());
        }
    }
    
    public List<ClienteModel> buscarNome(String nome) {
        try {
            List<ClienteModel> lista = new ArrayList<>(); 
            
            String sql = "SELECT * FROM cliente WHERE nome LIKE ?;";            
            PreparedStatement pmst = con.prepareStatement(sql);
             pmst.setString(1, "%" + nome + "%");
            ResultSet rs = pmst.executeQuery();
            
            while (rs.next()) {                
                ClienteModel clienteModel = new ClienteModel();
                clienteModel.setCodcli(rs.getInt("cod"));
                clienteModel.setNome(rs.getString("nome"));
                clienteModel.setCpf(rs.getString("cpf"));
                clienteModel.setRua(rs.getString("rua"));
                clienteModel.setNumero(rs.getInt("numero"));
                clienteModel.setBairro(rs.getString("bairro"));
                clienteModel.setEstado(rs.getString("estado"));
                clienteModel.setTelefone(rs.getString("telefone"));
                clienteModel.setGenero(rs.getString("genero"));
                lista.add(clienteModel);
            }
              return lista;
            
        } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro SQL: " + e.getMessage());
                return null;
         }
    }
    
}
