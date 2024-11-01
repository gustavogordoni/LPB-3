/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.projeto.jdbc;
import java.sql.*;

/**
 *
 * @author live
 */
public class ConnectionFactory {    

    public Connection getConnection(String database, String user, String password) {
        String banco, usuario, senha;
        try {
            String url;
            banco = (database.isEmpty() ? "projetoBD2024" : database);
            usuario = (user.isEmpty() ? "postgres" : user);
            senha = (password.isEmpty() ? "postdba" : password);

            url = "jdbc:postgresql://localhost:5432/" + banco;
            return DriverManager.getConnection(url, usuario, senha);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
