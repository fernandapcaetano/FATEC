<?php

class ContaPoupanca extends ContaBancaria{

    public function __construct($agencia, $conta, $saldo){
        parent::__construct($agencia, $conta, $saldo);
    }

    function retirar($quantia){
        if($this->saldo >= $quantia){
            $this->saldo -= $quantia;
            return true;
        }
        return false;
    }

    public function contabilizar($saldo){
        $this->saldo += 110.43;
        print "Classe: Conta Poupança";
    }
}