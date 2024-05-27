<?php

$conn = mysqli_connect('127.0.0.1', 'root', 'root', 'humor');

//$query = "UPDATE programa SET codigo = 3 WHERE  nome = 'As Visões da Raven'";
$query2 = "UPDATE programa SET codigo = 4 WHERE  nome = 'Atlanta'";
$result = mysqli_query($conn, $query2);

if($result){
    echo 'Atualizado';
}

mysqli_close($conn);