package A05_Atividades_25_Fev;

import javax.swing.JOptionPane;

public class Ex02_Imposto {

    public static void main(String[] args) {

        double s1, s2, s3, s4, total;

        s1 = Double.parseDouble(JOptionPane.showInputDialog("informe a primeiro salário: "));
        s2 = Double.parseDouble(JOptionPane.showInputDialog("informe o segundo salário: "));
        s3 = Double.parseDouble(JOptionPane.showInputDialog("informe o terceiro salário: "));
        s4 = Double.parseDouble(JOptionPane.showInputDialog("informe o quarto salário: "));

        JOptionPane.showMessageDialog(null, "imposto 1:" + s1 * 0.05);
        JOptionPane.showMessageDialog(null, "imposto 2:" + s2 * 0.05);
        JOptionPane.showMessageDialog(null, "imposto 3:" + s3 * 0.05);
        JOptionPane.showMessageDialog(null, "imposto 4:" + s4 * 0.05);

        total = (s1 * 0.05) + (s2 * 0.05) + (s3 * 0.05) + (s4 * 0.05);

        JOptionPane.showMessageDialog(null, "o total de imposto foi de:  " + total);

    }

}
