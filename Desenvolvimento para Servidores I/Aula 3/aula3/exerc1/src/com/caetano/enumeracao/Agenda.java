package com.caetano.enumeracao;

public class Agenda {
    private int diaNumero;
    private DiaDaSemana dia;

    public Agenda(int diaNumero, DiaDaSemana dia) {
        this.diaNumero = diaNumero;
        this.dia = dia;
    }

    public void mostrarTarefa(){
        System.out.println("DIA: " + this.diaNumero);
        switch (this.dia) {
            case DOMINGO:
                System.out.println("Dar banho na filó");
                break;
            case SEGUNDA:
                System.out.println("PHP e Java");
                break;
            case QUARTA:
                System.out.println("Anésio");
                break;
            case SEXTA:
                System.out.println("PHP");
                break;
            case SABADO:
                System.out.println("DIA DE NÃO FAZER NADA");
                break;   
            default:
                System.out.println("CHATOOOOOOOO");
                break;
        }
    }

}
