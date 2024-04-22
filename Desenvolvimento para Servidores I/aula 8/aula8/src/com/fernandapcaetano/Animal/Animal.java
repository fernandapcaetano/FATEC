package com.fernandapcaetano.Animal;

public class Animal {
    
    private String nome;

    public Animal(String nome) {
        this.nome = nome;
    }

    public void emitirSom(){
        System.out.println("GENERICO");
    }

    public void mostrar(){
        System.out.println(this.nome);
    }
}
