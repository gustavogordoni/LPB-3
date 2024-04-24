package A11_Area_28_Mar;

public class Area {
    double altura, largura, area;
    
    public double areaQuadrilatero(double largura,double altura){
        this.largura = largura;
        this.altura = altura;
        this.area = this.altura * this.largura;
        return area;
    }
    
    public double areaTriangulo(double largura,double altura){
        this.largura = largura;
        this.altura = altura;
        this.area = (this.altura * this.largura) / 2;
        return area;
    }   
}
