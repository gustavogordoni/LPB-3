/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A18_conexaoDB01_15_Ago;
import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class TestaConexao {
    public static void main(String[] args) {
        ConnectionFactory objConnectionFactory = new ConnectionFactory();
        
        try {
            objConnectionFactory.getConnection();
            JOptionPane.showMessageDialog(null, "Conectado!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não conectado!\n"+e.getMessage());
        }
 
    }
}
