package com.fernandapcaetano;

public class Animal {
    private String nome;

    public Animal(String nome) {
        this.nome = nome;
    }

     public String getNome() {
        return nome;
    }

    public void respirar(){
        System.out.println("fsssss");
    }
    
    public void mostrar(){
        System.out.println(this.nome);
    }

    public void comer(){
        System.out.println(getNome() + " comeu");
    }

}
