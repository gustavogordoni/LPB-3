package A10_Ex01_22_Mar;

import javax.swing.JOptionPane;

public class Principal {    
    public static void main(String[] args) {
        Ponto ponto = new Ponto();
               
        double x1, x2, y1, y2;
        x1 = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do x1: "));        
        y1 = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do y1: "));
        x2 = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do x2: "));
        y2 = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do y2: "));
        
        JOptionPane.showMessageDialog(null, "A distância é de: " + ponto.distanciaPontos(x1, x2, y1, y2));        
    }    
}
