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
public class Principal {
    
    public static void main(String[] args) {
    
        // Novo objeto FUSCA
        Automovel carro1 = new Automovel();
        
        carro1.marca = "Volkswagen";
        carro1.modelo = "Fusca";
        carro1.ano = 1990;
        carro1.estado = "desligado";
        carro1.velocidade = 0;
        
        // Tentatica de acelerar o carro
        carro1.aceleraCarro();
        System.out.println("C01 - Velocidade atual: " + carro1.velocidade);
        
        // Crie o carro 2; defina os atributos; ligue o carro; acelere 3 vezes; mostre os resultados;        
        // Novo objeto UNO
        Automovel carro2 = new Automovel();
        
        carro2.marca = "Fiat";
        carro2.modelo = "Uno";
        carro2.ano = 2001;
        carro2.estado = "desligado";
        carro2.velocidade = 0;
        
        // Tentatica de acelerar o carro
        carro2.ligaCarro();
        carro2.aceleraCarro();
        carro2.aceleraCarro();
        carro2.aceleraCarro();
        //System.out.println("Velocidade atual: " + carro2.velocidade);
        
        // Tente ultrapassar a velocidade máxima
        carro2.aceleraCarro();
        carro2.aceleraCarro();
        carro2.aceleraCarro();
        carro2.aceleraCarro();
        carro2.aceleraCarro();
        //System.out.println("C02 - Velocidade atual: " + carro2.velocidade);
        
        // Desligue o carro e mostrar a velocidade 
        carro2.desligarCarro();
        System.out.println("C02 - Velocidade atual: " + carro2.velocidade);
    }
}
