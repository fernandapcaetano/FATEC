package com.caetano.calculadora;

public class Calculadora {
    private double num1;
    private double num2;

    public Calculadora(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    public double soma(){
        double resultado = this.num1 + this.num2;
        return resultado;
    }
    public double divisao(){
        double resultado = this.num1 / this.num2;
        if(0 == num2){
            System.out.println("Erro");
            return 0;
        }
        return resultado;
    }
    public double multiplicacao(){
        double resultado = this.num1 * this.num2;
        return resultado;
    }
    public double subtracao(){
        double resultado = this.num1 - this.num2;
        return resultado;
        // ou System.out.println(n1-n2)
    }
}
