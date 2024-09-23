/** 
 * Ex. 2 (Aula02_05): Crie um programa em Dart no qual esteja criada uma 
 * variável chamada "temperaturaCelsius" e atribua-lhe um valor qualquer. 
 * Em seguida, converta essa temperatura para Fahrenheit usando a fórmula: 
 * Fahrenheit = (Celsius * 9/5) + 32. 
 * Por fim, apresente o resultado da conversão.
 **/

void main() {

  double temperaturaCelsius = 28;
  
  double temperaturaFahrenheit = temperaturaCelsius * 1.8 + 32;
  
  print("$temperaturaCelsiusºC correspondem a $temperaturaFahrenheitºF.");
  
}
