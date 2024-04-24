package A11_Area_28_Mar;

import javax.swing.JOptionPane;

/**
 * @author Gordoni
 *
 * O / \ O
 *       /|\/ \/|\ / \ / \
 *
 * ------------------- O | O | /|\ | /|\ | / \O | / \ |
 *
 * O o O
 *       /|\p ----!----- q/|\ / \ | | / \
 *
 * -------------------------------------------------------------------------------------------------------
 * Enunciado: Implemente uma classe que calcule a área de um quadrilátero.
 * Calcule também a área de um triângulo. O usuário deverá ter a opção de
 * escolher qual das duas áreas ele irá escolher Crie dois métodos, um para cada
 * cálculo. Depois de criar o objeto e executar o código.
 */
public class Principal {

    public static void main(String[] args) {
        Area area = new Area();

        double altura, largura;
        int opcao;
        opcao = Integer.parseInt(JOptionPane.showInputDialog(
            "Selecione a forma geométrica para calcular a área: "
            + "\n 1 - Quadrilátero"
            + "\n 2 - Triângulo"));
        largura = Double.parseDouble(JOptionPane.showInputDialog("Informe a largura: "));
        altura = Double.parseDouble(JOptionPane.showInputDialog("Informe a altura: "));

        if (opcao == 1) {
            JOptionPane.showMessageDialog(null, "A área do quadrilátero é: " + area.areaQuadrilatero(largura, altura));
        } else if (opcao == 2) {
            JOptionPane.showMessageDialog(null, "A área do triângulo é: " + area.areaTriangulo(largura, altura));
        } else {
            JOptionPane.showMessageDialog(null, "Valor não válido!"
                    + "\n Selecione novamente a forma geométrica para ser calculado a área!");
        }
    }
}
