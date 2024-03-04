package com.caetano.cachorro;

public class Cachorro {

    private  String nome;
    private String raca;

    public Cachorro(String nome, String raca){
        this.nome = nome;
        this.raca = raca;
    }

    public void latir(){
        System.out.println("Nome: " + this.nome);
    }
    public void mostrarRaca(){
        System.out.println("Raça: " + this.raca);
    }
}
