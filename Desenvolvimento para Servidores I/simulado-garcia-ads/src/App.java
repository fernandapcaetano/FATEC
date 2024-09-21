

import exer8.Porta;
import exerc10.Casa;

public class App {
    public static void main(String[] args) throws Exception {
        
        /**
         * Exercício 8
         */

         Porta porta1 = new Porta();
         porta1.abrir();
         porta1.fechar();
         porta1.abrir();
         System.out.println(Porta.getNumAberturas());
         System.out.println(porta1.isOpen());

         Porta porta2 = new Porta();
         porta2.abrir();
         System.out.println(Porta.getNumAberturas());

        /**
         * Exercício 11
         */
        Porta porta3 = new Porta();
        Porta porta4 = new Porta();
        Porta porta5 = new Porta();
        Porta porta6 = new Porta();

        Casa casa = new Casa("Branco", porta3);
        casa.addPorta(porta4);
        casa.addPorta(porta5);
        casa.addPorta(porta6);
        casa.abrir(0);
        casa.abrir(1);
        System.out.println(casa.quantidadeAbertas());


    }
}
