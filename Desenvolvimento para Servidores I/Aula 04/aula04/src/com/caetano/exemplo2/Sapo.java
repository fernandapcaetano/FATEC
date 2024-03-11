package com.caetano.exemplo2;

public class Sapo {
    private int qtPulo; //para cada sapo
    private static int qtSapo; //para todos os sapos

    public Sapo() {
        qtSapo ++;
    }

    public int getQtPulo() {
        return qtPulo;
    }

    public int getQtSapo() {
        return qtSapo;
    }

    public void pular(){
        qtPulo++;
    }
    
}
