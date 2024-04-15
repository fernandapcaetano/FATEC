package com.fernandapcaetano;

public class Gato extends Animal{
    
    //O super chama o construtor da superclasse
    //O construtor da subclasse é obrigatório se existir construtor na superclasse
    public Gato(String nome){
        super(nome);
    }

    public void miar(){
        System.out.println(getNome() + " MIAU");
    }
}
