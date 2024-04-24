package A08_Bhaskara_11_Mar;

public class Bhaskara {
    double a, b , c, delta, x1, x2;
    
    public void determinarValores(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    } 
    
    public double calcularDelta(double a, double b, double c){        
        this.delta = ((b * b) - (4 * a * c));
        return this.delta;
    }  
    
    public double calcularX1(double delta){
        this.delta = delta;
        
        this.x1 = (((-1) * b) + Math.sqrt(delta)) / (2 * a);
        return this.x1;
    } 
    
    public double calcularX2 (double delta){
        this.delta = delta;
        
        this.x2 = (((-1) * b) - Math.sqrt(delta)) / (2 * a);
        return this.x2;
    } 
}
