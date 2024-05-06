<?php

class ContaCorrente extends ContaBancaria{
    protected $limite;

    public function __construct($agencia, $conta, $saldo, $limite){
        parent::__construct($agencia, $conta, $saldo);
        $this->limite = $limite;
    }

    public function retirar($quantia){
        if($this->saldo + $this->limite){
            $this->saldo -= $quantia;
            return true;
        }
        return false;
    }

    public function contabilizar($saldo){
        $this->saldo += 0.85;
        print "Classe: Conta Corrente";
    }
}