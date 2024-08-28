package exer6;

import java.util.Random;

public class Adivinhacao {
    private int numeroSorteado;

    

    public Adivinhacao() {
        this.sortear();
    }

    private void sortear(){
        Random random = new Random();
        this.numeroSorteado = random.nextInt(100);
    }

    public String advinhar(int tentativa) {
        if (tentativa == numeroSorteado) {
            return "Parabéns! Você acertou o número.";
        } else if (tentativa < numeroSorteado) {
            return "O número sorteado é maior.";
        } else {
            return "O número sorteado é menor.";
        }
    }

     // Getter para o número sorteado (para fins de teste ou depuração)
    public int getNumeroSorteado() {
        return numeroSorteado;
    }
}
