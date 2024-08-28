package exer3;

public class Complexo {
    private double a, b;

    
    public Complexo(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public Complexo somar(Complexo c){
        double novaParteReal = this.a + c.a;
        double novaParteImaginaria = this.b + c.b;

        return new Complexo(novaParteReal, novaParteImaginaria);
    }

    public Complexo multiplicar(Complexo c){
        double novaParteReal = (this.a * c.a) - (this.b * c.b);
        double novaParteImaginaria = (this.a * c.a) * (this.b * c.b);

        return new Complexo(novaParteReal, novaParteImaginaria);
    }

    public double modulo(){
        return Math.sqrt((this.a * this.a) + (this.b * this.b));
    }

    public double argumentoPrincipal(){
        return Math.atan2(this.b, this.a);
    }

    @Override
    public String toString() {
        if (this.b > 0) {
            return this.a + "+" + this.b + "i";
        }
        return this.a + "-" + -this.b + "i";
    }


}
