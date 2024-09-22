package exer9;

public class Transferencia {

    // Método para transferir uma quantia de c2 para c1
    public void transferir(Cliente c1, Cliente c2, double quantia) {
        // Verifica se o c2 tem saldo suficiente (saldo + limite)
        if (c2.checarSaldo() >= quantia) {
            // Realiza o saque do c2 (retira o valor de c2)
            c2.sacar(quantia);
            // Deposita o valor em c1 (coloca o valor em c1)
            c1.depositar(quantia);
            
            // Exibe mensagem de conclusão da transferência
            System.out.println("Transferência de " + quantia + " realizada com sucesso!");
            System.out.println("De: " + c2.obterNome() + " para: " + c1.obterNome());
        } else {
            // Mensagem de erro caso o saldo de c2 seja insuficiente
            System.out.println("Transferência não realizada. Saldo insuficiente em " + c2.obterNome());
        }
    }
}
