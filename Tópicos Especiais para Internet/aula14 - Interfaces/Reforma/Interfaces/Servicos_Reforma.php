<?php

interface Servicos_Reforma{

    public function trocaPisos();
    public function fazPintura();
    public function trocaLampada();
    public function fazOrcamento($maoOBra, $material);

    const desconto = 100;

}