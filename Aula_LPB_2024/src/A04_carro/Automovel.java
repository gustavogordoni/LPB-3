package A04_carro;

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
public class Automovel {
    
    // Atributos
    String marca, modelo, estado;
    int ano;
    double velocidade, velocidadeMaxima = 70;
    
    // Método para ligar o carro
    public void ligaCarro(){
        estado = "ligado";
    }
    
    // Método para desligar o carro
    public void desligarCarro(){
        if(estado.equalsIgnoreCase("ligado")){
            estado = "desligado";
            velocidade = 0;
        }
    }
    
    // Método para acelerar o carro
    public void aceleraCarro(){
        // Somente se estiver ligado
        if(estado.equals("ligado") && velocidade < velocidadeMaxima){
            velocidade = velocidade + 10;
        }else{
            System.out.println("Carro desligado! \nE/OU\nVocê ultrapassou a velocidade máxima!\n");
        }    
    }    
}
