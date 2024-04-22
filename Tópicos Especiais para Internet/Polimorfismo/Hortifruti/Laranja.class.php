<?php

class Laranja extends Fruta{

    protected $cor;

    public function __construct($f){
        parent::__construct($f);
    }

    public function set_cor($cor){
        $this->cor = $cor;
    }
    public function get_cor(){
        return $this->cor;
    }
}