<?php
     $nomes = ["Ana", "Bruno", "Carlos", "Diana", "Eduardo"];

     $salarios = [2500.00, 3200.00, 4000.00, 2900.00, 3500.00];
     
     function mostraFuncionariosAltosSalarios($nomes, $salarios) {
         for ($i = 0; $i < count($nomes); $i++) {
             if ($salarios[$i] > 3000.00) {
                 echo $nomes[$i] . "<br>";
             }
         }
     }

     mostraFuncionariosAltosSalarios($nomes, $salarios);