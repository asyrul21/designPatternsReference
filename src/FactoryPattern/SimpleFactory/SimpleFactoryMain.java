package FactoryPattern.SimpleFactory;

public class SimpleFactoryMain {
    public static void main(String[] args){
        PizzaFactory f = new PizzaFactory();
        PizzaStore store = new PizzaStore(f);

        System.out.println("Welcome to the pizza store!");
        System.out.println();

        System.out.println("Ordering Cheese pizza...");
        Pizza cheesePizza = store.orderPizza("cheese");
        System.out.println(cheesePizza.toString());
        System.out.println();

        System.out.println("Ordering Pepperoni pizza...");
        Pizza pepPizza = store.orderPizza("pepperoni");
        System.out.println(pepPizza.toString());
        System.out.println();
    }
}
