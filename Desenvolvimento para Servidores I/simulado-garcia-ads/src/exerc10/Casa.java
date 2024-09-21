package exerc10;

import java.util.ArrayList;

import exer8.Porta;

public class Casa {
    private String cor;
    private Porta entrada;
    private ArrayList<Porta> portas;

    public Casa(String cor, Porta entrada) {
        this.cor = cor;
        this.entrada = entrada;
        this.portas = new ArrayList<>(3);
    }

    public void addPorta(Porta porta){
        portas.add(porta);
    }

    public void abrir(int index){
        Porta porta = portas.get(index);
        if (porta.isOpen() == false) {
            porta.setOpen(true);
        }
    }

    public void fechar(int index){
        Porta porta = portas.get(index);
        if (porta.isOpen() == true) {
            porta.setOpen(false);
        }
    }

    public int quantidadeAbertas(){
        int contador = 0;
        for (Porta porta : portas) {
            if (porta.isOpen()) {
                contador ++;
            }
        }
        return contador;
    }

    public String getCor() {
        return cor;
    }

    public Porta getEntrada() {
        return entrada;
    }

    

}
