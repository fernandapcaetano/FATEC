package exec1;

public class Circulo extends Forma{ 
    
    private double raio;

    public Circulo(String cor, double raio) {
        super(cor);
        this.raio = raio;
    }

    @Override
    public void calcularArea() {
        double area = Math.PI * Math.pow(this.raio, 2);
       this.setArea(area);
    }
    
}
