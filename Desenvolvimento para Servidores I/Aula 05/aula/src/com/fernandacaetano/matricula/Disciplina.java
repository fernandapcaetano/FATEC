package com.fernandacaetano.matricula;

public class Disciplina {

    private String nome, codigo;
    private Tipo tipo;

    public Disciplina(String nome, String codigo, Tipo tipo) {
        this.nome = nome;
        this.codigo = codigo;
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void mostrar(){
        System.out.println( "Nome: "        + this.nome +
                            "\nCodigo: "    + this.codigo +
                            "\nTipo: "      + this.tipo);
    }

    public boolean isProfissionalizante(){
        if (this.tipo == Tipo.PROFISSIONALIZANTE){
            return true;
        }
        return false;
    }

    public boolean isBasica(){
        if (this.tipo == Tipo.BASICA){
            return true;
        }
        return false;
    }
}
