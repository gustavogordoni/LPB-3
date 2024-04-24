package A11_Empresa_28_Mar;

import javax.swing.JOptionPane;

/**
 * @author Gordoni
 * -------------------------------------------------------------------------------------------------------
 * Enunciado: A classe funcionário possui os atributos: nome, celular,
 * horasTrabalhadas, valorHora e salarioFinal
 *
 * Crie um método para calcular o salarioFinal passando como parâmetros
 * horasTrabalhadas e valorHora; 
 * Crie um método que mostre o nome e o celular do
 * funcionário; 
 * Crie um método que mostre o novo valor da hora se houvesse um
 * reajuste de 10%;
 */
public class Funcionario {

    double salarioFinal, valorHora, reajuste;
    int horasTrabalhadas;
    String nome, celular;

    public double salarioFinal(int horasTrabalhadas, double valorHora) {
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorHora = valorHora;

        this.salarioFinal = this.horasTrabalhadas * this.valorHora;
        return salarioFinal;
    }

    public void infoFuncionario(String nome, String celular) {
        JOptionPane.showMessageDialog(null, "Nome do funcionário: " + nome + 
        "\nCelular: " + celular);
    }
    
    public double reajuste() {
        this.reajuste = this.valorHora * 1.1;
        return this.reajuste;
    }
}
