<?php
$alunos = array("Maria Fernanda", "Michelle Baraçal", "Joao Pedro");   
echo nl2br("Adoentados: \n");
echo print_r(array_slice($alunos, -2));
