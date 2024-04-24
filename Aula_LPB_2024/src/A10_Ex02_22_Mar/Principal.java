package A10_Ex02_22_Mar;
import javax.swing.JOptionPane;
public class Principal {
    public static void main(String[] args) {
        Disciplina disciplina = new Disciplina();        
        
        double n1, n2, n3, p1, p2, p3;
        n1 = Double.parseDouble(JOptionPane.showInputDialog("Informe a nota 01: ")); 
        p1 = Double.parseDouble(JOptionPane.showInputDialog("Informe o peso da nota 01: "));
        n2 = Double.parseDouble(JOptionPane.showInputDialog("Informe a nota 02: ")); 
        p2 = Double.parseDouble(JOptionPane.showInputDialog("Informe o peso da nota 02: "));
        n3 = Double.parseDouble(JOptionPane.showInputDialog("Informe a nota 03: ")); 
        p3 = Double.parseDouble(JOptionPane.showInputDialog("Informe o peso da nota 03: "));               
        
        JOptionPane.showMessageDialog(null, "A média aritmética das notas é: " + disciplina.media(n1, n2, n3));   
        JOptionPane.showMessageDialog(null, "A média ponderada das notas é: " + disciplina.media(n1, n2, n3, p1, p2, p3));   
    }
}
