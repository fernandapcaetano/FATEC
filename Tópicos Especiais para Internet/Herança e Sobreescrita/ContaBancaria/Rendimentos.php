<?php

class Rendimentos extends ContaPoupanca{

    protected $juros;
    
    public function __construct($juros){
        parent::__construct($saldo);
        $this->juros = $juros;
    }

    public function contabilizar($juros){
        $this->saldo += $this->juros;
    }
}