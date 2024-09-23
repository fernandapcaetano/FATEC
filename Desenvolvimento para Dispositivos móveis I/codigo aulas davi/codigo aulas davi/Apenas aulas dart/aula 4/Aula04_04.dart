void main() {
  print("Calculadora em DART com OOP - Aula04_04");

  double v1 = 10, v2 = 5;

  // instanciação da classe Adicao
  Adicao adicao = Adicao(v1, v2);
  double soma = adicao.calcular();
  
  // utilizacao de objeto anônimo
  double subt = Subtracao(v1, v2).calcular();
  double mult = Multiplicacao(v1, v2).calcular();
  double div = Divisao(v1, v2).calcular();

  print("Soma: $soma");
  print("Subtração: $subt");
  print("Multiplicação: $mult");
  print("Divisão: $div");
}

abstract class Calculo {
  double valor1 = 0, valor2 = 0;

  Calculo(this.valor1, this.valor2);

  double calcular();
}

class Adicao extends Calculo {
  Adicao(super.valor1, super.valor2);

  @override
  double calcular() {
    return super.valor1 + super.valor2;
  }
}

class Subtracao extends Calculo {
  Subtracao(super.valor1, super.valor2);

  @override
  double calcular() {
    return super.valor1 - super.valor2;
  }
}

class Multiplicacao extends Calculo {
  Multiplicacao(super.valor1, super.valor2);

  @override
  double calcular() {
    return super.valor1 * super.valor2;
  }
}

class Divisao extends Calculo {
  Divisao(super.valor1, super.valor2);

  @override
  double calcular() {
    return super.valor1 / super.valor2;
  }
}
