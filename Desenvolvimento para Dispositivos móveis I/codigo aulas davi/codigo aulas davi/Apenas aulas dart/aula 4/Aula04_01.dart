void main() {
  Carro carro1 = Carro("HB20");
  Carro carro2 = Carro("Gol");
  Carro carro3 = Carro("Argo");

  // map é um par de chave e valor, igual o json
  final carrosMap = {"1": carro1, "2": carro2};
  carrosMap["3"] = carro3;

  print("Imprimindo a lista toda de uma vez...");
  print("Lista: $carrosMap, length: ${carrosMap.length}");

  // looping pela "key" do map
  print("\nImprimindo a lista com foreach a partir da 'key'");
  for (String id in carrosMap.keys) {
    final carroTemp = carrosMap[id];
    print(" >> ${carroTemp?.modelo}"); // o "?" acima serve porque "modelo" pode ser nulo
  }


  // looping pelo "values" do map
  print("\nImprimindo a lista com foreach a partir do 'value'");
  for (Carro carroTemp in carrosMap.values) {
    print(" >> ${carroTemp.modelo}");
  }
}

class Carro {
  String modelo;

  Carro(this.modelo);

  @override
  String toString() {
    return modelo;
  }
}
