package B01_TrabMat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.JOptionPane;

/**
 * @author Gordoni
 */
public class Calculos {
	public double media, desvioMedio, desvioPadrao, variancia, mediana;
	public List<Double> moda;
	public int quantidade;
	
	public double soma, somaDesvio, somaQuadradosDiferencas;
	public double valores[];
    
	public double media() {
		this.media = 0;
	    this.valores = new double[this.quantidade];	    
	    double valor = 0;
	    this.soma = 0;
	    
	    for (int i = 0; i < this.quantidade; i++) {
	        valor = Double.parseDouble(JOptionPane.showInputDialog("Informe o " + (i + 1) + "° valor: "));
	        this.valores[i] = valor;            
	        this.soma += valor; // Calculando a soma dos valores                        
	    }	    
	    this.media = this.soma / this.quantidade; // Média dos valores  
        return this.media;
	} 
	 
	
	public double desvioMedio() {
		this.desvioMedio = 0;
		this.somaDesvio = 0;
	    this.somaQuadradosDiferencas = 0;	          
	    
	    for (int i = 0; i < this.quantidade; i++) {          
	        this.somaDesvio += Math.abs(this.valores[i] - this.media);
	        this.somaQuadradosDiferencas += Math.pow(this.valores[i] - this.media, 2);            
	    }       

	    this.desvioMedio = somaDesvio / this.quantidade;
	    return this.desvioMedio;
	}


	public double variancia() {
		this.variancia = 0;
        this.variancia = this.somaQuadradosDiferencas / this.quantidade;
        return this.variancia;
	} 
                
	public double desvioPadrao() {
		this.desvioPadrao = 0;
        this.desvioPadrao = Math.sqrt(this.variancia);
        return this.desvioPadrao;
	} 
	
	public double mediana() {
		this.mediana = 0;
        Arrays.sort(this.valores); // Ordena os valores
        if (quantidade % 2 == 0) {
            // Se for par, médiana é a média dos dois valores do meio
            this.mediana = (this.valores[quantidade / 2 - 1] + this.valores[quantidade / 2]) / 2.0;
        } else {
            // Se for ímpar, médiana é o valor do meio
            this.mediana = this.valores[quantidade / 2];
        }
        return this.mediana;
    }
	
	public List<Double> moda() {
	    Map<Double, Integer> frequencia = new HashMap<>();
	    for (double valor : this.valores) {
	        frequencia.put(valor, frequencia.getOrDefault(valor, 0) + 1);
	    }
	    
	    int maxFrequencia = 0;
	    for (int freq : frequencia.values()) {
	        if (freq > maxFrequencia) {
	            maxFrequencia = freq;
	        }
	    }
	    
	    List<Double> modas = new ArrayList<>();
	    for (Map.Entry<Double, Integer> entry : frequencia.entrySet()) {
	        if (entry.getValue() == maxFrequencia) {
	            modas.add(entry.getKey());
	        }
	    }
	    
	    this.moda = modas;
	    return this.moda;
	}
}
