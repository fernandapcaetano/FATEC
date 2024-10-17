package exec1;

public abstract class Forma {
    private String cor;
    private double area; 

    public Forma(String cor) {
        this.cor = cor;
    }

    public abstract void calcularArea();

    public String getCor() {
        return cor;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    
    
}
