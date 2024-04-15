<?php
require_once 'Fruta.class.php';
require_once 'Laranja.class.php';
require_once 'Laranja_Bahia.class.php';

$f = new Laranja_Bahia('Laranja Bahia está bem doce');
$f->set_arvore('Laranjeira');
$f->set_nome_fruta('Laranja Bahia');
$f->set_preco(8.22);
$f->set_cor('amarelo');

