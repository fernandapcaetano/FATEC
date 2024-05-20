<?php

include_once 'Interfaces/Servicos_Reforma.php';

class ClienteReforma implements Servicos_Reforma{

    private $maoObra;
    private $material;
    private $orcamento;
    private $abatimento = Servicos_Reforma::desconto;

    public function trocaPisos(){
        echo "<br> Troca de pisos antigos";
    }
    public function fazPintura(){
        echo "<br> Pintura de teto";
    }
    public function trocaLampada(){
        echo "<br> Retirar lampadas";
    }
    public function fazOrcamento($maoOBra, $material){
        $orcamento = $maoOBra + $material - $this->abatimento;
        return $orcamento;
    }
}