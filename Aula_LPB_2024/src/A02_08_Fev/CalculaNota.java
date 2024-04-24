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
 * Usando a classe JoptionPane para a entrada de dados, elabore uma classe que receba as notas de 2 provas e de um trabalho.
 * Crie o código para encontrar a média final, sendo a soma das 3 notas divididas por 3.
 * Se a média for maior ou igual a 6, então será mostrado a mensagem: "Aluno aprovado"
 */

public class CalculaNota {
    
    public static void main(String[] args) {
        double n1, n2, trab, media;
        
        n1 = Double.parseDouble(JOptionPane.showInputDialog("Informe a nota da 1° prova: "));
        n2 = Double.parseDouble(JOptionPane.showInputDialog("Informe a nota da 2° prova: "));
        trab = Double.parseDouble(JOptionPane.showInputDialog("Informe a nota do trabalho: "));
        media = (n1 + n2 + trab) / 3;
        
        if(media >= 6){
            JOptionPane.showMessageDialog(null, 
                "Aluno aprovado! \nMédia das notas: " + media);
        }else{
            JOptionPane.showMessageDialog(null, 
                "Aluno reprovado! \nMédia das notas: " + media);
        }              
    }
}
