package A05_Atividades_25_Fev;

import javax.swing.JOptionPane;

public class Ex05_SucessorAntecessor {

    public static void main(String[] args) {
        double digitado = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor"));
        double antecessor = digitado - 1;
        double sucessor = digitado + 1;
        JOptionPane.showMessageDialog(null, "O valor antecessor é: " + antecessor);
        JOptionPane.showMessageDialog(null, "O valor sucessor é: " + sucessor);
    }
}
