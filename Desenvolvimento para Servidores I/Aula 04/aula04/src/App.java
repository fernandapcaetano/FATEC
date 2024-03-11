import com.caetano.Exerc1.Circulo;
import com.caetano.exemplo1.Aluno;
import com.caetano.exemplo1.Curso;
import com.caetano.exemplo2.Sapo;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("______ALUNO_____");
        Aluno aluno = new Aluno("Maria Fernanda", "123456", Curso.SI);

        System.out.println("Nome: " + aluno.getNome());
        System.out.println("RA: " + aluno.getRa());
        System.out.println("Curso: " + aluno.getCurso());

        System.out.println("______SAPO_____");
        Sapo sapo = new Sapo();
        sapo.pular();
        sapo.pular();
        System.out.println(sapo.getQtSapo());
        System.out.println(sapo.getQtPulo());

        System.out.println("______CIRCULO_____");
        Circulo circulo = new Circulo(12);
        System.out.println(circulo.calcArea());
        System.out.println(circulo.calcPerimetro());
    }
}
