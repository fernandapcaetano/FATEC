package exer8;

public class Porta {
    private boolean isOpen;
    private static int numAberturas;

    public Porta(){
        this.isOpen = false;
    }

    public void abir(){
        if (this.isOpen == false) {
            this.isOpen = true;
            numAberturas ++;
        }
    }

    public void fechar() {
        if (this.isOpen == true) {
            isOpen = false;
        }
    }

    public boolean isAberta() {
        return this.isOpen;
    }

    public static int getNumAberturas() {
        return numAberturas;
    }
}
