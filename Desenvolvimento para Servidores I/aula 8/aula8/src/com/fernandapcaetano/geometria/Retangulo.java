package com.fernandapcaetano.geometria;

public class Retangulo extends Quadrilatero{

    private double lado2;

    public Retangulo(double lado, double lado2) {
        super(lado);
        this.lado2 = lado2;
    }
       
    public double calcularArea(){
        double res = this.lado * this.lado2;
        return res;
    }

    public double calcularPerimetro(){
        double res = 2 * (this.lado + this.lado2) ;
        return res;
    }
    
}
