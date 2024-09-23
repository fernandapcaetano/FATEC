void main() {
  print("Calculadora em DART com OOP - Aula04_05");

  double v1 = 10, v2 = 5;

  // instancia objeto da classe Adicao
  Adicao adicao = Adicao();
  double soma = adicao.calcular(v1, v2);

  // utilizacao de objeto anônimo
  double subt = Subtracao().calcular(v1, v2);

  // utilizacao de objeto anônimo
  double mult = Multiplicacao().calcular(v1, v2);

  // utilizacao de objeto anônimo
  double div = Divisao().calcular(v1, v2);

  print("Soma: $soma");
  print("Subtração: $subt");
  print("Multiplicação: $mult");
  print("Divisão: $div");
}

abstract class Calculo {
  double calcular(double v1, double v2);
}

class Adicao extends Calculo {
  @override
  double calcular(double v1, double v2) => v1 + v2;
}

class Subtracao extends Calculo {
  @override
  double calcular(double v1, double v2) => v1 - v2;
}

class Multiplicacao extends Calculo {
  @override
  double calcular(double v1, double v2) => v1 * v2;
}

class Divisao extends Calculo {
  @override
  double calcular(double v1, double v2) => v1 / v2;
}
