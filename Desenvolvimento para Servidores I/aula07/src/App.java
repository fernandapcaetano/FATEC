import com.fernandapcaetano.Animal;
import com.fernandapcaetano.Cachorro;
import com.fernandapcaetano.Gato;

public class App {
    public static void main(String[] args) throws Exception {

        Cachorro filo = new Cachorro("Filó");
        filo.latir();
        filo.respirar();

        Gato alfredo = new Gato("Alfredo");
        alfredo.miar();
        alfredo.respirar();
                
        Animal generico = new Animal("Generico");
        generico.mostrar();
        generico.respirar();
        
    }
}