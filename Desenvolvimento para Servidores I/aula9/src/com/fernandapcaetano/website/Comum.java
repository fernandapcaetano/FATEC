package com.fernandapcaetano.website;

public class Comum implements Sitio{

    @Override
    public void principal() {
        System.out.println("Vá para o dashboard");
    }

    @Override
    public void painelADM() {
        System.out.println("Painel adm Proibido");
    }

    @Override
    public void dashboard() {
        System.out.println("Dashboard");
    }

}
