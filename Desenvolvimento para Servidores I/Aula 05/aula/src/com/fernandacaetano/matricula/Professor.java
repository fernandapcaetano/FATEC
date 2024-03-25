package com.fernandacaetano.matricula;


import java.util.ArrayList;

public class Professor {

    private ArrayList<Disciplina> disciplinas;
    private String nome;


    public Professor(String nome) {
        this.nome = nome;
        disciplinas = new ArrayList<Disciplina>();
    }

    public void atribuir(Disciplina disciplina){
        disciplinas.add(disciplina);
    }
    public void largar(Disciplina disciplina){
        if (!(disciplinas.contains(disciplina))) {
            disciplinas.remove(disciplina);
        } else{
            System.out.println("O professor " + this.nome + " não possui esssa disciplina");
        }
    }
    public void listar(){
        for (Disciplina disciplina : disciplinas) {
            disciplina.mostrar();
        }
    }
    public void listaProfissionalizante(){
        System.out.println("Nome: " + this.nome);
        for (Disciplina disciplina : disciplinas) {
            if (disciplina.isProfissionalizante()) {
                disciplina.mostrar();
            }
        }
    }


    
    public void findByName(String nome){
        for (Disciplina disciplina : disciplinas) {
            if (disciplina.getNome().equals(nome)) {
                disciplina.mostrar();
            }
        }
    }

}
