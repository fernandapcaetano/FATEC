package exec1;

public class Retangulo extends Forma{
    private double largura, altura;

    public Retangulo(String cor, double largura, double altura) {
        super(cor);
        this.largura = largura;
        this.altura = altura;
    }

    @Override
    public void calcularArea() {
        double area = this.largura * this.altura;
       this.setArea(area);
    }

    
}
