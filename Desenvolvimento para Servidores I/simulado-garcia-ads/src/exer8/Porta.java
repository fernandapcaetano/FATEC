package exer8;

public class Porta {
    private boolean isOpen;
    private static int numAberturas;

    public Porta() {
        this.isOpen = false;
    }

    public void abrir(){
        if (this.isOpen == false) {
            this.isOpen = true;
            numAberturas ++;
        }
    }

    public void fechar(){
        if (this.isOpen == true) {
            this.isOpen = false;
        }
    }

    public boolean isOpen() {
        return isOpen;
    }

    public static int getNumAberturas() {
        return numAberturas;
    }

    public void setOpen(boolean isOpen) {
        this.isOpen = isOpen;
    }

    

    
}
