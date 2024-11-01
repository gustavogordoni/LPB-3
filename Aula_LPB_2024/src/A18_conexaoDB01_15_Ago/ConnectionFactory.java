/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A18_conexaoDB01_15_Ago;

import java.sql.*;
/**
 *
 * @author Aluno
 */
public class ConnectionFactory {

    public Connection getConnection() {
        String banco, usuario, senha;
        try {
            String url;
            banco = "dbLPB";
            usuario = "postgres";
            senha = "postdba";
            
            url = "jdbc:postgresql://localhost:5432/" + banco;
            return DriverManager.getConnection(url, usuario, senha);            
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
