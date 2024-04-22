<?php

class Fruta{
    protected $arvore;
    protected $nome_fruta;
    protected $preco;

    public function __construct($detalhe){
        print "Detalhe da fruta: <br> {$detalhe} <br>\n";
    }

    public function set_arvore($arvore){
        $this->arvore = $arvore;
    }
    public function get_arvore(){
        return $this->arvore;
    }

    public function set_nome_fruta($nome_fruta){
        $this->nome_fruta = $nome_fruta;
    }
    public function get_nome_fruta(){
        return $this->nome_fruta;
    }

    public function set_preco($preco){
        $this->preco = $preco;
    }
    public function get_preco(){
        return $this->preco;
    }
}