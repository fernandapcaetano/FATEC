package com.fernandapcaetano.Validador;

public class Validador {

    //Type-driven
    public static boolean validar(Email email){
        String valor = email.valor();
        return valor.contains('@');
    }

    public boolean validar(Nome nome){
        String valor = nome.valor();
        return !nome.valor().equals("");
    }
}
