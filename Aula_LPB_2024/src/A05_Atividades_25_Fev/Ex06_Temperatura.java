package A05_Atividades_25_Fev;

import javax.swing.JOptionPane;

public class Ex06_Temperatura {

    public static void main(String[] args) {
        double Fahrenheit = Double.parseDouble(JOptionPane.showInputDialog("Escreva a temperatura em Fahrenheit"));
        double Celsius = (Fahrenheit - 32) / 1.8;

        JOptionPane.showMessageDialog(null, "A temperatura em graus Celsius é de: " + Celsius);
    }
}
