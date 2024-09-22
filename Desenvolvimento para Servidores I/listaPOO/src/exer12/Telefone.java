package exer12;

public class Telefone {
    private String ddd;
    private String numero;

    // Construtor para inicializar os atributos ddd e número
    public Telefone(String ddd, String numero) {
        this.ddd = ddd;
        this.numero = numero;
    }

    // Método para obter o número do telefone
    public String obterNumero() {
        return numero;
    }

    // Método para obter o DDD do telefone
    public String obterDDD() {
        return ddd;
    }
    
    // Método para retornar o telefone completo no formato "(DDD) número"
    public String obterTelefoneCompleto() {
        return "(" + ddd + ") " + numero;
    }
}
