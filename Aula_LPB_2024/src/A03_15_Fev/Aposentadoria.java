package A03_15_Fev;

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
 * Para se aposentar por idade, as mulheres precisam ter atingido 60 anos e os homens 65.
 * Já na aposentadoria por tempo de contribuição, o tempo mínimo exigido é de 30 anos para mulheres e 35 para homens.
 * Com base nessas informações, elabore uma classe que receba a idade de uma pessoa, o sexo e a quantidade de anos de contribuição.
 * A partit das informações, calcule a quantidade de anos que falta de contribuição para se aposentar ou então emita uma mensagem:
 * "Você já tem o direito a aposentadoria."
 */
public class Aposentadoria {
    
    public static void main(String[] args) {
        int idade, contribuicao, restam;
        String sexo;
        
        sexo = JOptionPane.showInputDialog("Informe o sexo: ");
        idade = Integer.parseInt(JOptionPane.showInputDialog("Informe a idade: "));
        contribuicao = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de anos de contribuição: "));       
        
        if(sexo.equals("Masculino")){
            if(idade >= 65 || contribuicao >= 35){
                JOptionPane.showMessageDialog(null, 
                    "Você já tem o direito da aposentadoria!");
            }else{
                restam = 35 - contribuicao;
                JOptionPane.showMessageDialog(null, 
                    "Restam " + restam + "anos para se aponsentar");          
            }
        }else{
            if(sexo.equals("Feminino")){
                if(idade >= 60 || contribuicao >= 30){
                    JOptionPane.showMessageDialog(null, 
                        "Você já tem o direito da aposentadoria!");
                }else{
                    restam = 30 - contribuicao;
                    JOptionPane.showMessageDialog(null, 
                        "Restam " + restam + " anos para se aponsentar");
                }
            }else{
                JOptionPane.showMessageDialog(null, 
                        "Informe novamente os dados!");
            }        
        }        
    }
}
