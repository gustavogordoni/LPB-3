/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A18_conexaoDB02_15_Ago;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class TestaConexao {

    public static void main(String[] args) {
        ConexaoBanco objConexaoBanco = new ConexaoBanco();

        try {
            objConexaoBanco.getConnection();
            JOptionPane.showMessageDialog(null, "Conexão estabelecida com sucesso!\n Banco de Dados: dbLPB");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Conexão com banco de dados falhou!\n" + e.getMessage());
        }

    }
}
