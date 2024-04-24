package A08_Bhaskara_11_Mar;

import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args) {
        // Objeto bhaskara
        Bhaskara bhaskara = new Bhaskara();
        
        bhaskara.a = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite valor de A: "));
        bhaskara.b = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite valor de B: "));
        bhaskara.c = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite valor de C: "));
        
        bhaskara.determinarValores(bhaskara.a, bhaskara.b, bhaskara.c);
        JOptionPane.showMessageDialog(null, "O valor de Delta é: " + bhaskara.calcularDelta(bhaskara.a, bhaskara.b, bhaskara.c));
        JOptionPane.showMessageDialog(null, "O valor do x1 é: " + bhaskara.calcularX1(bhaskara.delta));
        JOptionPane.showMessageDialog(null, "O valor do x2 é: " + bhaskara.calcularX2(bhaskara.delta));
    }
}