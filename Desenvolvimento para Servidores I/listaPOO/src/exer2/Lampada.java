package exer2;

public class Lampada {
    
    private Estado estado;
    private int qtAcendimentos;

    public Lampada(Estado estado) {
        this.estado = estado;
    }

    public void click(){
        if (this.estado == Estado.APAGADA) {
            this.estado = Estado.ACESA;
            this.qtAcendimentos ++;
        } else{
            this.estado = Estado.APAGADA;
        }
    }
    
    public int qtdAcendimentos(){
        return this.qtAcendimentos;
    }

    public Estado checaEstado(){
        return this.estado;
    }
}
