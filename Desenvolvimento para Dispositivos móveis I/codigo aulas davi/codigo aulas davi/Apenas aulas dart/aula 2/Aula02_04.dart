/*
 * Ex. 1 (Aula02_04): Escreva um programa em Dart no qual esteja definido 
 * um número qualquer (tipo de dado "int"). Em seguida, crie uma função que
 * informe se o número é par ou ímpar, exibindo essa informação na tela.
 * */

void main() {

  int nroQualquer = 11;
  
  String resultadoParOuImpar = verificarParImpar(nroQualquer);
  
  print("O número verificado é $resultadoParOuImpar");
  
}

String verificarParImpar(nro){
  if (nro % 2 == 0){
    return "par";
  }
  else{
    return "ímpar";
  }
}