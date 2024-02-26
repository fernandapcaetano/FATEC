package com.exerc3;

public class QuadradoGarcia {
    double lado;

    void calcularArea(){
        if (lado > 0){
            double area = lado * lado;
            System.out.println("A área é " + area);
        }
        
    }

    void calcularPerimetro(){
        if(lado > 0){
            double perimetro = lado * 4;
            System.out.println("O perimetro é " + perimetro);
        }
    }
}
