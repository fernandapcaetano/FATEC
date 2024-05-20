<?php
include_once 'Classes/ClienteEmpresa.php';

//dados
$funcionarios = [ 'maria' => 100,
                  'maria' => 200,
                  'maria' => 300];

//Cliente
$Lenovo = new ClienteEmpresa($funcionarios, 100, 100, 100);
echo "Total de salário dos funcionários: ";
print($Lenovo->totalSalarioFuncionarios());
echo "<br>";
echo "Total devido: ";
print($Lenovo->totalDevido());
