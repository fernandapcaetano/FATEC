<?php

class Condominio{

    private $bloco;
    private $apartamento;
    private $andar;
    private $locatario;
   
    public function get__bloco(){
        return $this->bloco;
    }
    public function set__bloco($bloco){
        $this->bloco = $bloco;
    }

    public function get__apartamento(){
        return $this->apartamento;
    }
    public function set__apartamento($apartamento){
        $this->apartamento = $apartamento;
    }

    public function get__andar(){
        return $this->andar;
    }
    public function set__andar($andar){
        $this->andar = $andar;
    }

    public function get__locatario(){
        return $this->locatario;
    }
    public function set__locatario($locatario){
        $this->locatario = $locatario;
    }
}