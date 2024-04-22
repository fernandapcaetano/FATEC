# Herança

## Sobrecarga (Overload)
### Polimorfismo ad-hoc
Permite usarmos nome de métodos iguais desde que mudemos a lista de parâmetros.
- [x] metodo() : []
- [x] metodo(int x) : [int]
- [x] metodo(int y, string z) : [int, string]

obs.: é váliddo para construtores
#### Não influi na sobrecarga
- Modificador de acesso
- tipo de retorno
!! void metodo(){} [erro]
!! int metodo(){}  [erro]
- Clausula Throws (try/catch)
- Presença de annotations

## Records
Classes com atributos imutáveis

<<  Record    >>
| Nome | 
| ------ | 
|   String valor  | 
|   +string valor()  | 
|   +void mostrar() | 

## Sobrescrita (Override)
É o uso do mesmo nome de método (Resolução de ambiguidade) usando herança.
Devemos manter a mesma lista de parametros.