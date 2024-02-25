public class Counter {
    private int quantity;

    public Counter() {
       this.quantity = 0;
    }

    public void add(){
        this.quantity ++;
    }

    public void remove(){
        if (this.quantity > 0) {
            this.quantity --;
        }
    }

    public void reset(){
        this.quantity = 0;
    }

    public int getQuantity(){
        return this.quantity;
    }
}
