<?php

include_once 'Interfaces/BalancoPatrimonial.php';

class ClienteEmpresa implements BalancoPatrimonial{

    private $salarioFuncionarios = [];
    private $valorFornecedores;
    private $valorEmprestimos;
    private $valorImposto;
    private $totalDevido;

    public function __construct($salarioFuncionarios, $valorFornecedores, $valorEmprestimos, $valorImposto){
        $this->salarioFuncionarios = $salarioFuncionarios;
        $this->valorFornecedores = $valorFornecedores;
        $this->valorEmprestimos = $valorEmprestimos;
        $this->valorImposto = $valorImposto;
    }

    public function totalSalarioFuncionarios(){
        foreach ($this->salarioFuncionarios as $funcionario => $salario) {
            $salario += $salario;
        }
        return $salario;
    }

    public function totalDevido(){
        $this->totalDevido = $this->totalSalarioFuncionarios() + $this->valorFornecedores + $this->valorEmprestimos + $this->valorImposto;
        return $this->totalDevido;
    }
}