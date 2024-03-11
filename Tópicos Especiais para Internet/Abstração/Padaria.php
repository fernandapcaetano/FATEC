<?php

class Padaria{
    private $pedido;
    private $padeiro;
    private $nome;
    private $endereco;

    public function get_pedido(){
        return $this->pedido;
    }
    public function set_pedido($pedido){
        $this->pedido = $pedido;
    }

    public function get_padeiro(){
        return $this->padeiro;
    }
    public function set_padeiro($padeiro){
        $this->padeiro = $padeiro;
    }

    public function get_nome(){
        return $this->nome;
    }
    public function set_nome($nome){
        $this->nome = $nome;
    }

    public function get_endereco(){
        return $this->endereco;
    }
    public function set_endereco($endereco){
        $this->endereco = $endereco;
    }
}