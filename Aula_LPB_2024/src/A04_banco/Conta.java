package A04_banco;

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
public class Conta {    
    // Vamos criar os atributos/variáveis
    double saldo;   
    
    // Vamos criar o método para depositar
    // Trata-se de um método sem retorno e com passagem de parâmetro    
    public void depositar(double valor){
        // Vai somar valor ao saldo
        saldo = saldo + valor;
    }
    
    // Vamos criar o método para sacar
    public void sacar(double valor){
        // Vamos colocar a condição de saldo
        if(saldo >= valor){
            // Vai subtrair valor do saldo        
            saldo = saldo - valor;
        }else{
            System.out.println("Você não pode sacar.");
        }        
    }
    
}
