package A05_Atividades_25_Fev;

import javax.swing.JOptionPane;

public class Ex01_Troco {

    public static void main(String[] args) {
        String produtonome = JOptionPane.showInputDialog("Digite o produto a ser comprado:");
        double produto = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do produto a ser comprado:"));
        double pagamento = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de pagamento:"));

        double troco;
        if (pagamento >= produto) {
            troco = pagamento - produto;
            if (troco >= 1) {
                JOptionPane.showMessageDialog(null, "O troco do pagamento do produto " + produtonome + " foi de " + troco + " reais");
            } else {
                JOptionPane.showMessageDialog(null, "O troco do pagamento do produto " + produtonome + " foi de " + troco + " centavos");
            }

        } else {
            JOptionPane.showMessageDialog(null, "Pagamento insuficiente");

        }

    }
}
