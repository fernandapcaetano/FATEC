package exerc2;

import java.util.ArrayList;

import exerc1.Comando;

public class Fita {

    private ArrayList<Comando> comandos;

    public Fita() {
        //Iniciando lista
        this.comandos = new ArrayList<>();
    }

    public void inserirContador(Comando comando){
        this.comandos.add(comando);
    }

    public int somaContadores(){
        int soma = 0;
        for (Comando comando : comandos) {
            //soma += comando.getValor();
            soma = soma + comando.getValor();
        }
        return soma;
    }

    public int impares(){
        int impares = 0;
        for (Comando comando : comandos) {
            if (comando.getValor() % 2 != 0) {
                impares ++;
            }
        }
        return impares;
    }

    public int zerados(){
        int zerados = 0;
        for (Comando comando : comandos) {
            if (comando.getValor() == 0) {
                zerados ++;
            }
        }
        return zerados;
    }
}
