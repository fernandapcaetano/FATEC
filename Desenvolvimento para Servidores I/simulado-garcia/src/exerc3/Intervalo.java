package exerc3;

public class Intervalo {
    private double superior, inferior;

    public Intervalo(double superior, double inferior) {
        this.superior = superior;
        this.inferior = inferior;
    }

    public boolean pertence(double valor){
        if (valor >= getInferior() && valor <= getSuperior()) {
            return true;
        }
        return false;
    }

    public double getSuperior() {
        return this.superior;
    }

    public double getInferior() {
        return this.inferior;
    }
    
    
}
