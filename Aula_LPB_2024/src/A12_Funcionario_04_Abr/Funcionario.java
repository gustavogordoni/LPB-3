package A12_Funcionario_04_Abr;

/**
 * @author Gordoni
 */
public class Funcionario {
    private double hrsTrabalhadas, valorHora, salario, excedente, extra;
    
    public double calculoSalario(double hrsTrabalhadas, double valorHora){
        this.hrsTrabalhadas = hrsTrabalhadas;
        this.valorHora = valorHora;
        
        if(hrsTrabalhadas > 160){
            this.excedente = hrsTrabalhadas - 160;
            this.extra = this.excedente * (valorHora * 1.5);
            this.salario = (160 * valorHora) + this.extra;
        }else{
             this.salario = (hrsTrabalhadas * valorHora) + this.salario;
        }      
        return this.salario;
    }
}
