package com.exerc3;

public class Quadrado {
    private int area;
    private int perimetro;
    private int lado;

    public Quadrado(int lado) {
        this.lado = lado;
    }

    public void calcArea(){
        if(this.lado > 0){
            this.area = (this.lado * this.lado);
        }
        System.out.println(this.area);
    }

    public void calcPerimetro(){
        if(this.lado > 0){
            this.perimetro = this.lado * 4;
        }
        System.out.println(this.perimetro);
    }
}
