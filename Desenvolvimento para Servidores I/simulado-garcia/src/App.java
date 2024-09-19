import exerc1.Acao;
import exerc1.Comando;
import exerc2.Fita;
import exerc3.Intervalo;

public class App {
    public static void main(String[] args) throws Exception {

        /**
         * Exercicio 1
         */
        Comando comando = new Comando();

        comando.setAcao(Acao.INCREMENTAR);
        comando.executar();//1

        comando.setAcao(Acao.DUPLOINCREMENTO);
        comando.executar();// 3

        comando.setAcao(Acao.DECREMENTAR);
        comando.executar();//2

        comando.mostrar();

        /**
         * Exercicio 2
         */
        Comando comando0 = new Comando(); //zerado
        comando0.executar();

        Comando comandoPar = new Comando();//par
        comandoPar.setAcao(Acao.DUPLOINCREMENTO);
        comandoPar.executar();

        Comando comandoImpar = new Comando();//impar
        comandoImpar.setAcao(Acao.DUPLOINCREMENTO);
        comandoImpar.executar();
        comandoImpar.setAcao(Acao.INCREMENTAR);
        comandoImpar.executar();

        Fita fita = new Fita();
        fita.inserirContador(comando0);
        fita.inserirContador(comandoPar);
        fita.inserirContador(comandoImpar);

        //soma
        System.out.println(fita.somaContadores());
        //impar
        System.out.println(fita.impares());
        //zerados
        System.out.println(fita.zerados());

        /**
         * Exercicio 3
         */

         Intervalo intervalo = new Intervalo(5, 0);
         System.out.println(intervalo.pertence(10));
         
    }
}
