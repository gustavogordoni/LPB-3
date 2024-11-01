/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A19_br.com.UserPassword02_18_Ago;

import java.sql.*;

/**
 *
 * @author Aluno
 */
public class ConexaoBanco {

    public Connection getConnection(String user, String password) {
        String banco, usuario, senha;
        try {
            String url;
            banco = "dbLPB";
            usuario = user;
            senha = password;

            url = "jdbc:postgresql://localhost:5432/" + banco;
            return DriverManager.getConnection(url, usuario, senha);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
