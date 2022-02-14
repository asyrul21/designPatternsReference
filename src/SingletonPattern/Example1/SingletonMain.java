package SingletonPattern.Example1;

public class SingletonMain {
    public static void main(String[] args){
        System.out.println("Welcome to the Chocolate Boiler!");
        System.out.println();

        System.out.println("Creating instance!");
        ChocolateBoiler CB = ChocolateBoiler.getInstance();
        System.out.println("Filling...");
        CB.fill();
        System.out.println();

        System.out.println("Retrieving instance!");
        ChocolateBoiler cb2 = ChocolateBoiler.getInstance();
        System.out.println("Filled (should be false): ");
        System.out.println(cb2.isEmpty());
        System.out.println("Boiling...");
        cb2.boil();
        System.out.println();

        System.out.println("Retrieving another instance!");
        ChocolateBoiler cb3 = ChocolateBoiler.getInstance();
        System.out.println("Boiled (should be true): ");
        System.out.println(cb3.isBoiled());
        System.out.println();
    }
}
