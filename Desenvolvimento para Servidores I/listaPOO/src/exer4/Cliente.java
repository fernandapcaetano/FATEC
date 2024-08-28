package exer4;

public class Cliente {
    private String nome;
    private double saldo;
    private double limite;

    public Cliente(String nome, double saldo, double limite) {
        this.nome = nome;
        this.saldo = saldo;
        this.limite = limite;
    }

    public void sacar(double valor){
        double saldoTotal = this.saldo + this.limite;
        if (valor > saldoTotal) {
            System.out.println("Valor insuficiente");
        } else {
            System.out.println("Saque feito com sucesso!");
            this.saldo = this.saldo - valor;
        }
    }

    public void depositar(double valor){
        if (valor > 0) {
            this.saldo = this.saldo + valor;
            System.out.println("Depósito feito com sucesso!");
        } else{
            System.out.println("Deposite um valor válido");
        }
    }

    public void checarSaldo(){
        System.out.println("Saldo de: R$" + this.saldo);
    }

    public void obterNome(){
        System.out.println("Nome: " + this.nome);
    }

}
