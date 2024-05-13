<?php

abstract class Escritorio{

    protected $valorFinal;

    public function __construct($capital){
        $this->capital = $capital;
    }

    public function getcapital(){
        return $this->capital;
    }
    public function setcapital($capital){
        $this->capital = $capital;
    }

    public function getvalorFinal(){
        return $this->valorFinal;
    }
    public function setvalorFinal($valorFinal){
        $this->valorFinal = calcularJuros($juros);
    }

    abstract function calcularJuros($juros);

}