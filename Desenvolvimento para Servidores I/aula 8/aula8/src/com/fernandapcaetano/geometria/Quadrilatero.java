package com.fernandapcaetano.geometria;

public class Quadrilatero {
    
    protected double lado;

    public Quadrilatero(double lado) {
        this.lado = lado;
    }

    public double calcularArea(){
        double res = this.lado * this.lado;
        return res;
    }

    public double calcularPerimetro(){
        double res = 4 * this.lado;
        return res;
    }
    
}
