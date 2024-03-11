package com.caetano.Exerc1;

public class Circulo {
    
    private double area;
    private double perimetro;
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double calcArea(){
        this.area = 2 * Math.PI * this.raio;
        return this.area;
    }

    public double calcPerimetro(){
        this.perimetro = Math.PI * (this.raio * this.raio);
        return this.perimetro;
    }

}
