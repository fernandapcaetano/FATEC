import com.exerc2.MassaCorporal;
import com.exerc3.Quadrado;

public class App {
    public static void main(String[] args) throws Exception {
        
        // MassaCorporal joao = new MassaCorporal("Joao", 57, 167);
        // joao.mostrar();

        // MassaCorporal maria = new MassaCorporal("Maria", 47, 160);
        // maria.mostrar();
        
        // MassaCorporal michelle = new MassaCorporal("Michelle", 57 , 158);
        // michelle.mostrar();

        // MassaCorporal sergio = new MassaCorporal("Sergio", 86 , 185);
        // sergio.mostrar();

        MassaCorporal teste = new MassaCorporal("Teste", 800 , 160);
        teste.mostrar();

        Quadrado quadrado = new Quadrado(10);
        quadrado.calcArea();
        quadrado.calcPerimetro();

    }
}
