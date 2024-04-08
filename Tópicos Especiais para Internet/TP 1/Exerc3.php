<?php

class Condominio {
    public $nome;
    public $endereco;
    public $quantidadeDeApartamentos;

    public function __construct($nome, $endereco, $quantidadeDeApartamentos) {
        $this->nome = $nome;
        $this->endereco = $endereco;
        $this->quantidadeDeApartamentos = $quantidadeDeApartamentos;
    }

    public function exibirInformacoes() {
        echo "Condomínio: $this->nome<br>Endereço: $this->endereco<br>Quantidade de Apartamentos: $this->quantidadeDeApartamentos<br><br>";
    }
}

class Padaria {
    public $nome;
    public $endereco;
    public $especialidade;

    public function __construct($nome, $endereco, $especialidade) {
        $this->nome = $nome;
        $this->endereco = $endereco;
        $this->especialidade = $especialidade;
    }

    public function exibirInformacoes() {
        echo "Padaria: $this->nome<br>Endereço: $this->endereco<br>Especialidade: $this->especialidade<br><br>";
    }
}

$meuCondominio = new Condominio("Vivendas do Parque", "Rua das Flores, 123", 200);
$minhaPadaria = new Padaria("Pão e Arte", "Avenida do Sabor, 456", "Pães artesanais");

$meuCondominio->exibirInformacoes();
$minhaPadaria->exibirInformacoes();