package com.caetano.exemplo1;

public class Aluno {

    private String nome;
    private String ra;
    private Curso curso;

    public Aluno(String nome, String ra, Curso curso) {
        this.nome = nome;
        this.ra = ra;
        this.curso = curso;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

}
