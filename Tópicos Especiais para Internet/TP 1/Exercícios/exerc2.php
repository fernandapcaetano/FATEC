<?php

$funcionarios = [   'Sarah' => 900.00,
                    'Maria' => 2300.00,
                    'Carla' => 3000.00];
foreach ($funcionarios as $nome => $salario) {
    print nl2br("Nome: " . $nome . " Salário: " . $salario  . "\n");
}