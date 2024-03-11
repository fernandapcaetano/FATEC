import com.caetano.cachorro.Cachorro;
import com.caetano.calculadora.Calculadora;
import com.caetano.enumeracao.Agenda;
import com.caetano.enumeracao.DiaDaSemana;
import com.caetano.produto.Produto;
import com.caetano.produto.Tipo;

public class App {
    public static void main(String[] args) throws Exception {
        
        //Cachorro
        System.out.println("____CACHORRO____");
        Cachorro filo = new Cachorro("Filó", "Vira-lata");
        filo.latir();
        filo.mostrarRaca();
        Cachorro gael = new Cachorro("Gael Baraçal Russo", "Shitzu");
        gael.latir();
        gael.mostrarRaca();
        Cachorro tuty = new Cachorro("Tuti", "Vira-lata");
        tuty.latir();
        tuty.mostrarRaca();

        //Calculadora
        System.out.println("____CALCULADORA____");
        Calculadora calculadora = new Calculadora(2, 2);
        System.out.println(calculadora.soma());
        System.out.println(calculadora.subtracao());
        System.out.println(calculadora.multiplicacao());
        System.out.println(calculadora.divisao());

        //Agenda
        System.out.println("____AGENDA____");
        Agenda agenda = new Agenda(2, DiaDaSemana.SEGUNDA);
        agenda.mostrarTarefa();

        //Produto
        System.out.println("____PRODUTO____");
        Produto livro = new Produto("Livro", 10.0, Tipo.LIVRO);
        livro.mostrar();
        Produto grampeador  = new Produto("Grampeador", 8.50, Tipo.ESCRITORIO);
        grampeador.mostrar();

    }
}
