import exec1.Circulo;
import exec1.Retangulo;
import exerc2.Assistente;
import exerc2.Gerente;
import exerc3.CalculadoraAvancada;

public class App {
    public static void main(String[] args) throws Exception {

        /**
         * Exercício 1
         */
        Circulo circulo = new Circulo("Vermelho", 2);
        circulo.calcularArea();
        System.out.println(circulo.getArea());
        System.out.println("Cor: " + circulo.getCor());

        Retangulo retangulo = new Retangulo("Rosa", 2, 2);
        retangulo.calcularArea();
        System.out.println(retangulo.getArea());

        
        /**
         * Exercício 2
        */
         Gerente gerente = new Gerente("José", 100);
         System.out.println(gerente.calcularBonus());

         Assistente assistente = new Assistente("José", 100);
         System.out.println(assistente.calcularBonus());

         
        /**
        * Exercício 3
        */
        CalculadoraAvancada avancada = new CalculadoraAvancada();
        System.out.println(avancada.somar(1, 1));
        System.out.println(avancada.somar(0.5, 0.5));
        System.out.println(avancada.somar(1, 2, 3));

        

    }
}
