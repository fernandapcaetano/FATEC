<?php

function funcionarios (string $nome, float $salario){
    print nl2br("Nome: " . $nome . " Salário: " . $salario . "\n");
}

funcionarios("Sarah", 900.00);
funcionarios("Maria", 2300.00);
funcionarios("Carla", 3000.00);