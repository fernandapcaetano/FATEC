void main() {
  Carro carro1 = Carro("HB20", 2019);
  Carro carro2 = Carro("Gol", 2008);
  Carro carro3 = Carro("Argo", 2021);

  final carros = [carro1, carro2, carro3];
  // carros.add(carro1);
  // carros.add(carro2);
  // carros.add(carro3);

  print("Exibe a lista toda de uma única vez: ");
  print("Lista: $carros, quantidade de carros: ${carros.length}");

  print("\nPercorre a lista usando ForEach: ");
  for (Carro carroTemp in carros) {
    //print(" Carro: ${carroTemp.modelo} - Ano: ${carroTemp.ano}");
    print(carroTemp.dadosVeiculo());
  }
  
  print("\nPercorre a lista usando 'for' iterativo convencional: ");
  // looping com convencional
  for (int i = 0; i < carros.length; i++) {
    print("Carro: ${carros[i].modelo}");
  }
  
}

class Veiculo {
  String modelo;
  Veiculo(this.modelo);


  String dadosVeiculo() {
    return modelo;
  }
}

 class Carro extends Veiculo {
  int ano;
  Carro(nomeModelo, this.ano) : super(nomeModelo);

  // usado para imprimir todos os objetos da lista
  @override
  String toString() {
    return "$modelo: $ano";
  }

  @override
  String dadosVeiculo() {
    // return "Modelo: ${super.dadosVeiculo()}; ano fabricação: $ano";
    return "Carro: $modelo e Ano: $ano";
  }
}
