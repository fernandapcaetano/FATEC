package exerc1;

public class Comando {
    private int valor;
    private Acao acao;

    public Comando() {
        this.valor = 0;
        this.acao = Acao.ZERAR;
    }

    public void executar(){
        switch (acao) {
            case INCREMENTAR:
                //this.valor++
                this.valor = this.valor + 1;
                break;
            case DECREMENTAR:
                if (this.valor>0) {
                    //this.valor--
                    this.valor = this.valor -1;
                }
                break;
            case DUPLOINCREMENTO:
                //this.valor += 2
                this.valor = this.valor + 2;
                break;
            case ZERAR:
                this.valor = 0;
                break;
            default:
                break;
        }
    }

    public void mostrar(){
        System.out.println("Valor: " + getValor());
        System.out.println("Estado: " + getAcao());
    }

    public void setAcao(Acao acao) {
        this.acao = acao;
    }

    public int getValor() {
        return valor;
    }

    public Acao getAcao() {
        return acao;
    }

}
