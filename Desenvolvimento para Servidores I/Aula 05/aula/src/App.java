import com.fernandacaetano.matricula.Disciplina;
import com.fernandacaetano.matricula.Professor;
import com.fernandacaetano.matricula.Tipo;

public class App {
    public static void main(String[] args) throws Exception {
        
        Disciplina matematica = new Disciplina("Matematica", "123", Tipo.PROFISSIONALIZANTE);
        Disciplina portugues = new Disciplina("Portugues", "124", Tipo.BASICA);
        Disciplina frances = new Disciplina("Frances", "125", Tipo.LINGUAS);
        
        Professor professor = new Professor("Claudio");
        professor.atribuir(frances);
        professor.atribuir(matematica);
        professor.atribuir(portugues);
        professor.listar();
        professor.findByName("Frances");
        
   }
}