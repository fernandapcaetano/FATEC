package com.exerc2;

public class MassaCorporal {
    
    private String nome;
    private int peso;
    private int altura;
    private double imc;

    public MassaCorporal(String nome, int peso, int altura) {
        this.nome = nome;
        this.peso = peso;
        this.altura = altura;
    }

    public void calc(){
        this.imc = this.peso / (this.altura * this.altura);
    }

    public String mensagem(){
        if (this.imc >= 25){
            return "Acima do peso";
        } 
        if(this.imc >= 18 && this.imc < 25){
            return "Peso ideal";
        }
        return "Abaixo do peso";    
    }

    public void mostrar(){
        System.out.println(this.nome + " está no " + mensagem());
    }
}
