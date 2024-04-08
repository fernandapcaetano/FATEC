<?php

class Condominio{

    private $bloco;
    private $predio;
    private $apartamento;

    public function get_bloco(){
        return $this->bloco;
    }
    public function set_bloco($bloco){
        $this->bloco = $bloco;
    }
    
    public function get_predio(){
        return $this->predio;
    }
    public function set_predio($predio){
        $this->predio = $predio;
    }

    public function get_apartamento(){
        return $this->apartamento;
    }
    public function set_apartamento($apartamento){
        $this->apartamento = $apartamento;
    }
}