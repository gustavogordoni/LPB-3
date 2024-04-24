package A07_Empregado_07_Mar;

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
public class Empregado {
    String nome, sobrenome, telefone;
    double salario, taxa, aumento;
    
    // Método para processar o aumento:
    public double calcularAumento(double salario, double taxa){
        this.salario = salario;
        this.taxa = taxa;
        aumento = salario * (taxa / 100);
        return this.aumento;
    }  
}
