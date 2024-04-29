package com.fernandapcaetano.website;

public class Convidado implements Sitio{

    @Override
    public void principal() {
        System.out.println("Página principal");
    }

    @Override
    public void painelADM() {
        System.out.println("Painel administrativo Proibido");
    }

    @Override
    public void dashboard() {
        System.out.println("Dashboard Proibido");
    }
    
}
