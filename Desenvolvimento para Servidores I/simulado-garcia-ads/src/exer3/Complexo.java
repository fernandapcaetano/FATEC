package exer3;

public class Complexo {
    private double a, b;

    public Complexo(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public Complexo soma(Complexo outro){
        double parteReal = this.a + outro.a;
        double parteImaginaria = this.b + outro.b;

        return new Complexo(parteReal, parteImaginaria);
    }

    public Complexo multplicar(Complexo outro){
        //(ac − bd) + (ad + bc)i
        double a = this.a;
        double b = this.b;
        double c = outro.a;
        double d = outro.b;
        
        double parteReal = (a * c) - (b * d);
        double parteImaginaria = (a * d) + (b * c);

        return new Complexo(parteReal, parteImaginaria);
    }

    @Override
    public String toString() {
        // Complexa a + bi;
        if (this.b > 0) {
            return this.a + " + " + this.b + "i";
        }
        return this.a + " + " + -this.b + "i";
    }


}
