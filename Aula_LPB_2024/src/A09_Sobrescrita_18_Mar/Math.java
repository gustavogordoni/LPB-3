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
 *  A sobrecrita de métodos permite que um método com o mesmo nome possa ter 
 * diferentes ações, dependendo da assonatura do método, ou seja, o que vai 
 * dentro dos parênteses.
 */
public class Math {
    double n1, n2, resultado;
    
    // Criando um método com uma primeira assinatura
    public void soma(){
        this.n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de n1: "));
        this.n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de n2: "));
   this.resultado =  this.n1 + this.n2;
        
        JOptionPane.showMessageDialog(null, "Soma: " + this.resultado);
    }
    
    // Criando outro método com o mesmo nome, mas com assinatura diferente
    public double soma(double n1, double n2){
        this.n1 = n1;
        this.n2 = n2;
       return this.n1 + this.n2;
    }
    
    /*
        Crie dois métodos com o mesmo nome, mas com assinaturas diferentes
        O primeiro método irá possuir um atributo do tipo double, apenas. Esse 
        método vai calcular a taxa de aumento de um aluguel
    
        O segundo método irá possuir dois atributos do tipo double. Esse método
        vai receber no primeito atributo o valor do aluguel, e no segundo a taxa de 
        juros de aumento
    
        Crie os métodos e em seguida, implante na classe principal

    */ 
    double taxa, aluguel,aluguelReajustado;
    
    public void aluguel(double taxa){
        this.taxa = taxa;
        this.aluguel =  Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do aluguel: "));
        this.aluguelReajustado = this.aluguel + (this.aluguel * (taxa / 100));
        JOptionPane.showMessageDialog(null, "Valor do aluguel reajustado: R$" + this.aluguelReajustado);
    }
     
    public void aluguel(double aluguel, double taxa){
        this.taxa = taxa;
        this.aluguel = aluguel;
        
        this.aluguelReajustado = this.aluguel + (this.aluguel * (taxa / 100));
        JOptionPane.showMessageDialog(null, "Valor do aluguel reajustado: R$" + this.aluguelReajustado);
    }

}
