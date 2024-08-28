package exer1;

public class Churrasco {
    private double qtCarne;

    public Churrasco(){
        this.qtCarne = 0;
    } 

    public double verificarConsumo(Pessoa pessoa){
       if(pessoa.getIdade() >= 4 && pessoa.getIdade() <= 12 && !pessoa.isVegetariana()){
            //this.qtCarne = this.qtCarne + 1
            this.qtCarne ++;
        } else if (pessoa.getIdade() > 12 && !pessoa.isVegetariana()) {
            this.qtCarne += 2;
        }
        return this.qtCarne;
    }

    //getter
    public double getQtCarne() {
        return qtCarne;
    }
}
