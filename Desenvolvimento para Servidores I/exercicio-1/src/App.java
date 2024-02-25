public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("___CONTADOR DE PESSOAS __");

        Counter person = new Counter();
        person.add();
        person.add();
        person.add();
        person.remove();
        System.out.print("Quantidade ANTES de zerar:");
        System.out.println(person.getQuantity());

        System.out.print("Quantidade APÓS de zerar:");
        person.reset();
        System.out.print(person.getQuantity());

    }

    
}
