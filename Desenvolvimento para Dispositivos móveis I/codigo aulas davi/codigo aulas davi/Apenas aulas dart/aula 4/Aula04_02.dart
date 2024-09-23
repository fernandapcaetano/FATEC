void main() {
  Carro carro1 = Carro("HB20");
  print("Modelo do carro: $carro1.");
  carro1.acelerar(100);
  carro1.abastecer(40, "gasolina");
  carro1.definirPotencia(200);
}

abstract class Veiculo {
  void acelerar(int velocidade);
}

mixin Combustivel {
  abastecer(int qtde, String tipo) {
    print("Abastecendo $qtde litros de $tipo.");
  }
}

mixin Motorizacao {
  definirPotencia(int qtdeCavalos) {
    print("Potencia: $qtdeCavalos cavalos.");
  }
}

class Carro extends Veiculo with Combustivel, Motorizacao {
  String modelo;
  Carro(this.modelo);

  @override
  void acelerar(int velocidade) {
    print("Acelerando a $velocidade km/h.");
  }

  @override
  String toString() {
    return modelo;
  }
}
