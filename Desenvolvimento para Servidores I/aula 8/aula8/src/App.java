import com.fernandapcaetano.geometria.Quadrado;
import com.fernandapcaetano.geometria.Retangulo;

// import com.fernandapcaetano.Validador.Validador;

public class App {
    public static void main(String[] args) throws Exception {
        
        // Nome n = new Nome("Matheus");
        // Email e = new Email("matheus@fatec.br");

        // if (Validador.validar(e)) {
        //     System.out.println("Nome inválido");
        // } else {
        //     System.out.println("Nome não valido");
        // }

        Retangulo retangulo = new Retangulo(2, 3);
        System.out.println(retangulo.calcularArea()); 
        System.out.println(retangulo.calcularPerimetro()); 

        Quadrado quadrado = new Quadrado(2);
        System.out.println(quadrado.calcularArea());
        System.out.println(quadrado.calcularPerimetro());

    }
}