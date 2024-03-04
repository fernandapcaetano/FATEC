<?php
    
    $funcionarios = [
        [
            'nome' => "Maria Fernanda",
            'salario' => 10000
        ],
        [
            'nome' => "Michelle Baraçal",
            'salario' => 9000
        ],
        [
            'nome' => "João Pedro",
            'salario' => 8000
        ]
    ];

    foreach ($funcionarios as $funcionario) {
        echo nl2br (
            "Funcionário: " . $funcionario['nome'] . " => Salário: " . $funcionario['salario'] . "\n"
        );
        
    }