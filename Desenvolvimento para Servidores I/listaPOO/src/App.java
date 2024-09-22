import exer1.Churrasco;
import exer1.Pessoa;
import exer2.Estado;
import exer2.Lampada;
import exer4.Cliente;
import exer5.Triangulo;
import exer6.Adivinhacao;
import exer7.Eq2Grau;
import exer8.Porta;

public class App {
    public static void main(String[] args) throws Exception {
        /**
         * Exercicio 1
        */
        Pessoa Maria = new Pessoa("Maria Fernanda", "Feminino", 23, false);
        Pessoa Sarah = new Pessoa("Sarah", "Feminino", 21, true);
        Pessoa Carla = new Pessoa("Carla", "Feminino", 47, false);

        Churrasco churrasco = new Churrasco();
        churrasco.verificarConsumo(Carla);
        churrasco.verificarConsumo(Sarah);
        churrasco.verificarConsumo(Maria);

        System.out.println("Quantidade de carne: " + churrasco.getQtCarne() + " Kilos.");

        /**
         * Exercicio 2
        */
        Lampada lampada = new Lampada(Estado.APAGADA);
        lampada.click(); // Acende a lâmpada
        System.out.println("Estado: " + lampada.checaEstado()); // Deve mostrar "ACESA"
        System.out.println("Acendimentos: " + lampada.qtdAcendimentos()); // Deve mostrar 1

        lampada.click(); // Apaga a lâmpada
        System.out.println("Estado: " + lampada.checaEstado()); // Deve mostrar "APAGADA"
        System.out.println("Acendimentos: " + lampada.qtdAcendimentos()); // Deve mostrar 1 (não aumenta)

        lampada.click(); // Acende a lâmpada novamente
        System.out.println("Estado: " + lampada.checaEstado()); // Deve mostrar "ACESA"
        System.out.println("Acendimentos: " + lampada.qtdAcendimentos()); // Deve mostrar 2

        /**
         * Exercicio 3
        */

        /**
         * Exercicio 4
        */
        Cliente jose = new Cliente("José Cardoso", 300, 50);
        jose.obterNome();
        jose.depositar(100);
        jose.depositar(0);
        jose.sacar(60);
        jose.checarSaldo();

        /**
         * Exercicio 5
        */
        Triangulo triangulo = new Triangulo(2);
        System.out.println("Area: " + triangulo.getArea());
        System.out.println("Perimetro: " + triangulo.getPerimetro());
        
        /**
         * Exercicio 6
        */
        Adivinhacao adivinhacao = new Adivinhacao();
        System.out.println(adivinhacao.getNumeroSorteado());
        System.out.println(adivinhacao.advinhar(20));

        /**
         * Exercicio 7
        */
        Eq2Grau eq2Grau = new Eq2Grau(1, -3, 2);
        System.out.println(eq2Grau.getDelta());
        System.out.println(eq2Grau.raiz1());
        System.out.println(eq2Grau.raiz1());

        /**
         * Exercicio 8
        */
        Porta porta1 = new Porta();
        Porta porta2 = new Porta();

        porta1.abir();
        porta1.fechar();
        porta2.abir();

        System.out.println("Porta 1 está aberta? " + porta1.isAberta());
        System.out.println("Porta 2 está aberta? " + porta2.isAberta());
        System.out.println("Número total de aberturas: " + Porta.getNumAberturas());
    }
}
