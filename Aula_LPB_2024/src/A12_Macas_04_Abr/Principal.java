package A12_Macas_04_Abr;

import javax.swing.JOptionPane;

/**
 * @author Gordoni
 */
public class Principal {
    public static void main(String[] args) {
        Frutas frutas = new Frutas();
        
        JOptionPane.showMessageDialog(null, "A custo é de: R$" + frutas.custoMacas(
            Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de maçãs: "))
        )); 
    }
}
