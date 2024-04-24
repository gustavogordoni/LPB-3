package B01_TrabMat;
import javax.swing.JOptionPane;
/**
 * @author Gordoni
 */
public class Principal {
	public static void main(String[] args) {
		Calculos calculos = new Calculos();
		
		 do {
            int opcao = Integer.parseInt(JOptionPane.showInputDialog("Informe o que deseja calcular: "
                    + "\n1 - Média, Moda e Mediana"
                    + "\n2 - Média, Desvio Médio, Variância e Desvio Padrão"
                    + "\n0 - Sair"));

            calculos.quantidade = 0;
            if(opcao == 1) {
                calculos.quantidade = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de elementos: "));
                JOptionPane.showMessageDialog(null, "A Média é: " + calculos.media());
                JOptionPane.showMessageDialog(null, "A Mediana é: " + calculos.mediana());
                JOptionPane.showMessageDialog(null, "A Moda é: " + calculos.moda());
            } else if(opcao == 2) {
                calculos.quantidade = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de elementos: "));
                JOptionPane.showMessageDialog(null, "A Média é: " + calculos.media());
                JOptionPane.showMessageDialog(null, "O Desvio Médio é: " + calculos.desvioMedio());
                JOptionPane.showMessageDialog(null, "A Variância é: " + calculos.variancia());
                JOptionPane.showMessageDialog(null, "O Desvio Padrão é: " + calculos.desvioPadrao());
            } else if(opcao == 0) {
                break; // Sai do loop se a opção for 0 (sair)
            } else {
                JOptionPane.showMessageDialog(null, "Opção não válida");
            }
        } while (true); // Loop infinito até que o usuário escolha sair (opção 0)
		
		/* TODOS
		calculos.quantidade = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de elementos: "));
		JOptionPane.showMessageDialog(null, "A Média é: " + calculos.media());
		JOptionPane.showMessageDialog(null, "O Desvio Médio é: " + calculos.desvioMedio());
		JOptionPane.showMessageDialog(null, "A Variância é: " + calculos.variancia());
		JOptionPane.showMessageDialog(null, "O Desvio Padrão é: " + calculos.desvioPadrao());
		JOptionPane.showMessageDialog(null, "A Mediana é: " + calculos.mediana());
		JOptionPane.showMessageDialog(null, "A Moda é: " + calculos.moda());
		*/
	}
}