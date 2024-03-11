<?php
include_once("Condominio.php");
include_once("Padaria.php");

$padaria = new Padaria();
$padaria->set_pedido("Pão com presunto");
$padaria->set_padeiro("Fernanda");
$padaria->set_nome("Estrela");
$padaria->set_endereco("Rua da Saudade");

echo nl2br($padaria->get_nome());
echo nl2br($padaria->get_endereco());
echo nl2br($padaria->get_pedido());
echo nl2br($padaria->get_padeiro());

$condominio = new Condominio();
$condominio->set__bloco("c");
$condominio->set__andar(3);
$condominio->set__apartamento("2b");
$condominio->set__locatario("Maria");

echo nl2br($condominio->get__bloco());
echo nl2br($condominio->get__apartamento());
echo nl2br($condominio->get__andar());
echo nl2br($condominio->get__locatario());