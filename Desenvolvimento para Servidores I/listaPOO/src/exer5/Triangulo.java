package exer5;

public class Triangulo {
    private double lado;
    private double perimetro;
    private double area;

    public Triangulo(double lado) {
        this.lado = lado;
    }

    private double calcArea(){
        this.area = (this.lado * Math.sqrt(3)) / 2;
        return this.area;
    }

    private double calcPerimetro(){
        this.perimetro = 3 * this.lado;
        return this.perimetro;
    }

    public double getPerimetro() {
        return this.calcPerimetro();
    }

    public double getArea() {
        return this.calcArea();
    }

    
}
