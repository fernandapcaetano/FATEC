package com.fernandapcaetano;

public class Cachorro extends Animal{
    
    //O super chama o construtor da superclasse
    //O construtor da subclasse é obrigatório se existir construtor na superclasse
    public Cachorro(String nome){
        super(nome);
    }

    public void latir(){
        System.out.println(getNome() + " AU AU");
    }
}
