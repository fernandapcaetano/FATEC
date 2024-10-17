package exerc2;

public class Gerente extends Funcionario{
    
    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double calcularBonus() {
        double bonus = this.getSalario() * 0.2;
        return bonus;
    }
    
}
