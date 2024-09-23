void main() {
  
    // declara constante com o nome da faculdade
    final String nome = "Rubens Lara";
  
    // declara variaveis (tipada e não-tipada)
    int a = 1;
    a = 3;
  
    var b = 2;
    int c = soma(a, b);
  
    // Comentário em linha    
  
    /*
    Comentário em bloco
    */

    if (c > 0){
        print("A soma foi positiva");
    }
    else {
        print("A soma foi negativa");
    }
  
    print("Soma: R\$ $c");
    print("Nome: $nome");

}
 
soma(a, b) { 
    return a + b;
}
