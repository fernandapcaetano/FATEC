package exer12;

public class Cliente {
    private String nome;
    private String cpf;
    private Telefone telefone; // Telefone associado ao cliente

    // Construtor para inicializar os atributos nome e cpf
    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    // Método para associar um novo telefone ao cliente
    public void adicionarTelefone(Telefone telefone) {
        this.telefone = telefone;
    }

    // Método para mostrar todos os dados do cliente, incluindo o telefone
    public void mostrarDados() {
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        if (telefone != null) {
            System.out.println("Telefone: " + telefone.obterTelefoneCompleto());
        } else {
            System.out.println("Telefone: Não cadastrado");
        }
    }
}
