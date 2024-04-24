package A05_Atividades_25_Fev;

import javax.swing.JOptionPane;

public class Ex04_Laranjas {

    public static void main(String[] args) {
        int laranja = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de caixas de laranja: "));

        double total = (laranja * 61) * 0.97;
        JOptionPane.showMessageDialog(null, "O lucro de Carlos é de: " + total);
    }
}
