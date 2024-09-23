void main() {
   Carro carro1 = Carro("HB20");
   print("Modelo do carro: $carro1.");
   carro1.acelerar(100);
   carro1.abastecer(40, "gasolina");
}

abstract class Veiculo {
    void acelerar(int velocidade);
}

mixin Combustivel {
    abastecer(int qtde, String tipo) {
        print("Abastecendo $qtde litros de $tipo.");
  }
}

class Carro extends Veiculo with Combustivel {
    String modelo;
    Carro(this.modelo);
  
    @override
    void acelerar(int velocidade) {
        print("Acelerando a $velocidade km/h.");
    }

    @override  
    String toString() => modelo;
}
