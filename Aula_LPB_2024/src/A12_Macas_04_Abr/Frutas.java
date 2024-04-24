package A12_Macas_04_Abr;
/**
 * @author Gordoni
 */
public class Frutas {
    private int quant;
    private double custo;
    
    public double custoMacas(int quant){
        this.quant = quant;
        if(quant < 12){
            this.custo = quant * 1.30;
        }else{
            this.custo = quant * 1;
        }        
        return this.custo;
    }
}
