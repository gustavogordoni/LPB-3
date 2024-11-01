/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.projeto.jdbc;

import java.sql.Connection;
import javax.swing.JOptionPane;

/**
 *
 * @author live
 */
public class TestConnection {
     
    public static void main(String[] args) {
        ConnectionFactory objConnectionFactory = new ConnectionFactory();
        
        try {
            objConnectionFactory.getConnection("","", "");
            JOptionPane.showMessageDialog(null, "Conectado!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não conectado!\n"+e.getMessage());
        }
 
    }
}
