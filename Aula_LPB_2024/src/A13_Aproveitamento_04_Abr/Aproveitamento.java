package A13_Aproveitamento_04_Abr;

/**
 * @author Gordoni
 */
public class Aproveitamento {
    private double n1, n2, n3, mediaExercicios, mediaAproveitamento;
    
    public double mediaAproveitamento(double n1,double n2,double n3){
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
        this.mediaExercicios = (n1 + n2 + n3) / 3;
        this.mediaAproveitamento = (n1 + (n2 * 2) + (n3 * 3) + this.mediaExercicios) / 7;
        
        return this.mediaAproveitamento;
    }
    
    public double mediaAproveitamento(double n1,double n2,double n3,double mediaExercicios){
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
        this.mediaExercicios = mediaExercicios;
        this.mediaAproveitamento = (n1 + (n2 * 2) + (n3 * 3) + this.mediaExercicios) / 7;
        
        return this.mediaAproveitamento;
    }
    
    public String definirConceito(){        
        if(this.mediaAproveitamento < 6){
            return "Conceito D";
        }else if(this.mediaAproveitamento >= 6 && this.mediaAproveitamento < 7.5){
            return "Conceito C";
        }else if(this.mediaAproveitamento >= 7.5 && this.mediaAproveitamento < 9){
            return "Conceito B";
        }else{
            return "Conceito A";
        }
    }
}
