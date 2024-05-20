<?php

include_once 'Classes/ClienteReforma.php';

$cr = new ClienteReforma;
echo "Serviços da reforma do banheiro";
$cr->trocaPisos();
$cr->fazPintura();
$cr->trocaLampada();