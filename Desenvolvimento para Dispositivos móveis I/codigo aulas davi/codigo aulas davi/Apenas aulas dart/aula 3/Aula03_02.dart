void main(){
    Carro carro1 = Carro("HB20");
    Carro carro2 = Carro("Gol");
    Carro carro3 = Carro("Argo");

    final carros = [carro1, carro2, carro3];
    // carros.add(carro1); carros.add(carro2); carros.add(carro3);

    print("Exibe a lista toda de uma única vez: ");
    print("Carros disponíveis: $carros, tamanho da lista: ${carros.length}");

    // looping com For Each
    print("\nPercorre a lista usando ForEach: ");
    for (Carro carroTemp in carros){
        print("Carro disponível: ${carroTemp.modelo}");
    }

    // looping com convencional
    print("\nPercorre a lista usando 'for' iterativo convencional: ");
    for (int i = 0; i < carros.length; i++) {
        print(" Carro disponível: ${carros[i].modelo}");
    }
}

class Carro {
    String modelo; 

    Carro (this.modelo);

    String toString(){
        return modelo;
    }
}
