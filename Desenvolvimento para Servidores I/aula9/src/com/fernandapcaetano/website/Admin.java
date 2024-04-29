package com.fernandapcaetano.website;

public class Admin implements Sitio{

    @Override
    public void principal() {
        System.out.println("Vai para o painél");
    }

    @Override
    public void painelADM() {
       System.out.println("Controle total");
    }

    @Override
    public void dashboard() {
        System.out.println("Proibido");
    }

}
