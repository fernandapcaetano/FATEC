package br.fernandapcaetano.receitas.model;

import java.util.List;

public class Receita {
    private Long id;
    private String nome;
    private List<String> ingredientes;
    private String instrucoes;

    public Receita() {
    }
    
    public Receita(Long id, String nome, List<String> ingredientes, String instrucoes) {
        this.id = id;
        this.nome = nome;
        this.ingredientes = ingredientes;
        this.instrucoes = instrucoes;
    }


    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public List<String> getIngredientes() {
        return ingredientes;
    }
    public void setIngredientes(List<String> ingredientes) {
        this.ingredientes = ingredientes;
    }
    public String getInstrucoes() {
        return instrucoes;
    }
    public void setInstrucoes(String instrucoes) {
        this.instrucoes = instrucoes;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Receita other = (Receita) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }

}
