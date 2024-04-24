package A12_Funcionario_04_Abr;

import javax.swing.JOptionPane;

/**
 * @author Gordoni
 */
public class Principal {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        
        JOptionPane.showMessageDialog(null, "O valor do salário é: R$" + funcionario.calculoSalario(
            Double.parseDouble(JOptionPane.showInputDialog("Informe a quantidade de horas trabalhadas: ")),
            Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da hora trabalhada: "))
        )); 
    }
}
