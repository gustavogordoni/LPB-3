package A02_08_Fev;

import javax.swing.JOptionPane;

//  *  //:) :/ :D XD ;) '-' >-< >_< >o< V.V
//  `-´ ´-` `.´

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
 * Faça um programa que receba a opção que o usuário precisa escolher, masculino ou feminino
 */

public class TesteEntrada {
    
    public static void main(String[] args) {
        String opcao; // usuário escolherá entre as opções
        opcao = JOptionPane.showInputDialog("Digite masculino ou feminino: ");
        
        if(opcao.equals("Feminino")){
            JOptionPane.showMessageDialog(null, 
                "Você escolheu " + opcao);
        }else if(opcao.equals("Masculino")){
            JOptionPane.showMessageDialog(null, 
                "Você escolheu " + opcao);
        }else{
            JOptionPane.showMessageDialog(null, "Você digitou uma opção inválida");
        }        
    }    
}
