package exer10;

import java.util.ArrayList;

public class Casa {
    private String cor; // Cor da casa
    private ArrayList<Porta> portas; // Lista de portas

    // Construtor que inicializa a casa com uma cor e até três portas
    public Casa(String cor) {
        this.cor = cor;
        this.portas = new ArrayList<>();
    }

    // Método para adicionar uma porta à casa (até 3 portas)
    public void adicionarPorta(Porta porta) {
        if (portas.size() < 3) {
            portas.add(porta);
        } else {
            System.out.println("A casa já possui 3 portas.");
        }
    }

    // Método para abrir uma porta específica
    public void abrirPorta(int index) {
        if (index >= 0 && index < portas.size()) {
            portas.get(index).abir();
        } else {
            System.out.println("Índice de porta inválido.");
        }
    }

    // Método para fechar uma porta específica
    public void fecharPorta(int index) {
        if (index >= 0 && index < portas.size()) {
            portas.get(index).fechar();
        } else {
            System.out.println("Índice de porta inválido.");
        }
    }

    // Método para contar quantas portas estão abertas
    public int contarPortasAbertas() {
        int count = 0;
        for (Porta porta : portas) {
            if (porta.isAberta()) {
                count++;
            }
        }
        return count;
    }

    // Método para obter a cor da casa
    public String getCor() {
        return cor;
    }

    // Método para definir a cor da casa
    public void setCor(String cor) {
        this.cor = cor;
    }
}
