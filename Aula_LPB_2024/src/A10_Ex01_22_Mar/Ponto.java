package A10_Ex01_22_Mar;

public class Ponto {
    double x1, x2, y1, y2, distancia;
    
    public double distanciaPontos(double x1,double x2,double y1,double y2){
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;

        this.distancia = Math.sqrt(Math.pow(this.x2 - this.x1,2) + Math.pow(this.y2 - this.y1,2));
        return this.distancia;
    }
}
