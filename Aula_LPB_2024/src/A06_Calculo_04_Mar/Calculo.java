package A06_Calculo_04_Mar;

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
public class Calculo {

    // Criando os métodos para operações básicas da matemática
    double valor1, valor2, resultado;
    int escolha;

    // Criando o métodopara SOMAR
    public double soma(double valor1, double valor2) {
        this.valor1 = valor1;
        this.valor2 = valor2;
        resultado = this.valor1 + this.valor2;
        return resultado;
    }

    // Método para diferença
    public double diferenca(double valor1, double valor2) {
        this.valor1 = valor1;
        this.valor2 = valor2;
        resultado = this.valor1 - this.valor2;
        return resultado;
    }

    // Método para multiplicação
    public double multiplicar(double valor1, double valor2) {
        this.valor1 = valor1;
        this.valor2 = valor2;
        resultado = this.valor1 * this.valor2;
        return resultado;
    }

    // Método para multiplicação
    public double dividir(double valor1, double valor2) {
        this.valor1 = valor1;
        this.valor2 = valor2;
        if (this.valor2 != 0) {
            resultado = this.valor1 / this.valor2;
            return resultado;
        }else{
            JOptionPane.showMessageDialog(null, "Impossível dividir por ZERO!");
            return this.resultado = 0;
                
        }
        
    }

    // Criando um método para mostrar os valores de acordo com a escolha do usuário
    public void escolhaCalculo() {
        switch (this.escolha) {
            case 1:
                JOptionPane.showMessageDialog(null, "O resultado da adição é: "
                        + soma(this.valor1, this.valor2));
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "O resultado da diferença é: "
                        + diferenca(this.valor1, this.valor2));
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "O resultado da multiplicação é: "
                        + multiplicar(this.valor1, this.valor2));
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "O resultado da divisão é: "
                        + dividir(this.valor1, this.valor2));
                break;
            default:
                JOptionPane.showMessageDialog(null, "Escolha inválida");
                break;
        }
    }

    // Criando um método para o usuário digitar o cálculo ser efetuado
    public void digiteOpcao() {
        this.escolha = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite: "
                + "\n1)Somar"
                + "\n2)Diferença"
                + "\n3)Mutiplicar"
                + "\n4)Dividir"));
    }
}
