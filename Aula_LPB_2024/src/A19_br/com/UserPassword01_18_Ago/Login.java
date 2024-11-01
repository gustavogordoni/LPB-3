/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A19_br.com.UserPassword01_18_Ago;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class Login {

    public static void main(String[] args) {
        ConexaoBanco objConexaoBanco = new ConexaoBanco();

        String password, user;

        user = JOptionPane.showInputDialog(null, "Informe o nome do usuário");
        password = JOptionPane.showInputDialog(null, "Informe a senha do usuário");

        try {
            objConexaoBanco.getConnection(user, password);
            JOptionPane.showMessageDialog(null, "Você tem autorização!\n");            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Você digitou login/senha errado");
        }
    }
}
