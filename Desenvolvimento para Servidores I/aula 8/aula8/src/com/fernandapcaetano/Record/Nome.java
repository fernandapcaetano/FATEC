package com.fernandapcaetano.Record;

public record Nome (String valor){
    
    public void mostrar(){
        System.out.println(valor);
    }
}
