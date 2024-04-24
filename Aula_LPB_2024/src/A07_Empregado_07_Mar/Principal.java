package A07_Empregado_07_Mar;

import javax.swing.JOptionPane;

/**
 * @author Gordoni
 *  
 *        O  /    \  O
 *       /|\/      \/|\
 *       / \        / \
 * 
 *                       -------------------
 *        O              |       O         |
 *       /|\             |      /|\        |
 *       / \O            |      / \        |
 * 
 *        O                 o              O
 *       /|\p         ----!-----         q/|\
 *       / \          |        |          / \
 * 
 *  ------------------------------------------------------------------------------------------------------- 
 * Enunciado:
 * 
 */
public class Principal {
    public static void main(String[] args) {
        // Objeto
        Empregado empregado = new Empregado();
        
        empregado.nome = JOptionPane.showInputDialog(null, "Digite o nome do empregado");
        empregado.sobrenome = JOptionPane.showInputDialog(null, "Digite o sobrenome do empregado");
        empregado.salario = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o salário do empregado"));
        empregado.taxa = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a taxa do empregado"));
        
        empregado.calcularAumento(empregado.salario, empregado.taxa);
        JOptionPane.showMessageDialog(null, "A taxa do empregado é: " + empregado.calcularAumento(empregado.salario, empregado.taxa));
    }
}
