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
public class Principal {
    public static void main(String[] args) {
        // Criando uma intância ou objeto
        Calculo calculo = new Calculo();
        
        // Criando as duas variáveis que receberão os valores
        double valor1, valor2;
        
        valor1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o primeiro número: "));
        valor2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o segundo número: "));
        
        // Somar
        calculo.soma(valor1, valor2);
        // Diferença
        calculo.diferenca(valor1, valor2);
        // Multiplicar
        calculo.multiplicar(valor1, valor2);
        // Divisão
        calculo.dividir(valor1, valor2);
         
        // Pedindo para o usuário escolher a opção
        calculo.digiteOpcao();
        // Realiza o cálculo escolhido e mostra o resultado
        calculo.escolhaCalculo();
    }
}