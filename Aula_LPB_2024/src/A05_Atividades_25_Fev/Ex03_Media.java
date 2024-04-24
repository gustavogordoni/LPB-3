package A05_Atividades_25_Fev;

import javax.swing.JOptionPane;

public class Ex03_Media {

    public static void main(String[] args) {
        double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da primeira nota: "));
        double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da segunda nota: "));
        double nota3 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da terceira nota: "));
        if (nota1 >= 0 && nota2 >= 0 && nota3 >= 0) {
            double media = (nota1 + nota2 + nota3) / 3;
            JOptionPane.showMessageDialog(null, "A média aritmétrica é de: " + media);
        } else {
            
        }

    }
}
