package exer7;

public class Eq2Grau {
    private double a, b,c;

    public Eq2Grau(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    private double delta(){
        return (b * b) - (4 * a * c);
    }

    public double raiz1(){
        double delta = this.delta();
        if (delta >= 0) {
            return (-b + Math.sqrt(delta)) / (2 * a);
        }
        return Double.NaN;
    }

    public double raiz2(){
        double delta = this.delta();
        if (delta >= 0) {
            return (-b - Math.sqrt(delta)) / (2 * a);
        }
        return Double.NaN;
    }
    
    public double getDelta(){
        return this.delta();
    }
}
