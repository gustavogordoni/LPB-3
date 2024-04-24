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
public class Principal {
    
    public static void main(String[] args) {
        // Vamos criar um objeto/instância        
        Conta conta1 = new Conta();
        
        // Vamos dar um valor para o saldo inicial
        conta1.saldo = 1000;
        
        // Agora desejo um depósito de R$500
        conta1.depositar(500);
        
        // Vamos mostrar
        System.out.println("Saldo atualizado: R$" + conta1.saldo);
        
        // Vamos criar uma nova instância
        Conta conta2 = new Conta();
        
        // Vamos atribuir um saldo novo inicial
        conta2.saldo = 750;
        
        // Vamos depositar R$350
        conta2.depositar(350);
        
        // Vamos mostrar
        System.out.println("Saldo atualizado da conta 2: R$" + conta2.saldo);
        
        // Vamos sacar R$450 da conta 1        
        conta1.sacar(2000);
        
        // Vamos mostrar
        System.out.println("Valor da conta 1 após o saque: R$" + conta1.saldo);
        
        
    }
}
