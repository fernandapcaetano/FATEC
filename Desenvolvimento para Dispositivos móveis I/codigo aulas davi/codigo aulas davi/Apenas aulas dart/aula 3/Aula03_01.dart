void main() {
  Pessoa p = Pessoa("Rubens Lara");

  int c = Calculadora.somar(7, 8);

  print("Soma: $c");
  print("Nome: ${p.nome}");
}

class Pessoa {
  String nome;

  Pessoa(this.nome);
}

class Calculadora {
  static somar(a, b) {
    return a + b;
  }
}
