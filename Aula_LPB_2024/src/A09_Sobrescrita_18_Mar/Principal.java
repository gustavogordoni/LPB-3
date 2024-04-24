package A09_Sobrescrita_18_Mar;

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
        Math math = new Math();
        /*
        math.soma();
        JOptionPane.showMessageDialog(null, "Soma: " + math.soma(10,20));
                
        math.aluguel(10);
        */
        
        double aluguel, taxa;
        aluguel = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do aluguel: "));
        taxa = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da taxa: "));
        math.aluguel(aluguel, taxa);
    }
     
}
