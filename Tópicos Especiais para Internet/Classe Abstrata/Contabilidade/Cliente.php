<?php

class Cliente extends Escritorio{

    private $nome;
    private $juros;
    private $valorFinal;

    public function __constructor($nome, $juros, $capital){
        $this->nome = $nome;
        $this->juros = $juros;
        parent::__construct($capital)
    }


    public function getvalorFinal(){
        return $this->valorFinal;
    }
    public function setvalorFinal($valorFinal){
        $this->valorFinal = calcularJuros($juros);
    }

    abstract function calcularJuros($juros){
        $juros = $this->juros;
        $calculo = $this->capital * $juros
    }
}