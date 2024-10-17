package exerc2;

public class Assistente extends Funcionario{

    
    public Assistente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double calcularBonus() {
       double bonus = this.getSalario() * 0.1;
        return bonus;
    }
    
    
}
