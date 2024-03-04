package com.caetano.produto;

public class Produto {
    private String nome;
    private double preco;
    private Tipo tipo;

    public Produto(String nome, Double preco, Tipo tipo) {
        this.nome = nome;
        this.preco = preco;
        this.tipo = tipo;
    }

    public void mostrar(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Preço: " + this.preco);
        System.out.println("Preço com desconto: " + this.calcularDesconto());
        System.out.println("Tipo: " + this.tipo);
    }
   public double calcularDesconto(){
        switch (this.tipo) {
            case LIVRO:
                this.preco = this.preco - (this.preco * 0.15) ;
                return this.preco;
            case ESCRITORIO:
                this.preco = this.preco - (this.preco * 0.10);
                return this.preco;
            case TECNOLOGIA:
                this.preco = this.preco - (this.preco * 0.05);
                return this.preco;
            case CASA:
                this.preco = this.preco - (this.preco * 0.12);
                return this.preco;
            default:
                System.out.println("Não tem desconto");
                break;
        }
        return this.preco;
   }
}
