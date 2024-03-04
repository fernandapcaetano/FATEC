<?php

$alunos = array("Maria Fernanda", "Michelle Baraçal", "Joao Pedro");
sort($alunos);
foreach ($alunos as $aluno => $value) {
    echo nl2br ("Nome: " . $value. "\n");
}