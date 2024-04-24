package A11_Empresa_28_Mar;

import javax.swing.JOptionPane;

/**
 * @author Gordoni
 */
public class Principal {

    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        double salarioFinal, valorHora;
        int horasTrabalhadas;
        String nome, celular;
        
        nome = JOptionPane.showInputDialog("Informe o nome do funcionário: ");
        celular = JOptionPane.showInputDialog("Informe o celular do funcionário: ");
        horasTrabalhadas = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de horas trabalhadas: "));
        valorHora = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor da hora trabalhada: "));
        
        JOptionPane.showMessageDialog(null, "Salário final: R$" + funcionario.salarioFinal(horasTrabalhadas, valorHora));
        funcionario.infoFuncionario(nome, celular);
        JOptionPane.showMessageDialog(null, "O valor da hora após o reajuste é: \nR$" + funcionario.reajuste());
    }
}
