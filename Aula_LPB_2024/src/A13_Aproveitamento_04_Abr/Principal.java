package A13_Aproveitamento_04_Abr;

import javax.swing.JOptionPane;

/**
 * @author Gordoni
 */
public class Principal {
    public static void main(String[] args) {    
        Aproveitamento aproveitamento = new Aproveitamento();
        
        JOptionPane.showMessageDialog(null, "A média de aproveitamento é: " + aproveitamento.mediaAproveitamento(
            Double.parseDouble(JOptionPane.showInputDialog("Informe a nota 01: ")),
            Double.parseDouble(JOptionPane.showInputDialog("Informe a nota 02: ")),
            Double.parseDouble(JOptionPane.showInputDialog("Informe a nota 03: "))
            ,Double.parseDouble(JOptionPane.showInputDialog("Informe a média dos exercícios: "))
        ));         
        JOptionPane.showMessageDialog(null, "O conceito é: " + aproveitamento.definirConceito()); 
    }    
}
