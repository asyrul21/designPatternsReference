package FactoryPattern.AbstractFactory;

public class FactoryMethodMain {
    public static void main(String[] args){
        PizzaStore nystore = new NYPizzaStore();
        PizzaStore chicstore = new ChicagoPizzaStore();

        System.out.println("Welcome to the Region-based pizza store with region-specific ingredients!");
        System.out.println();

        System.out.println("Ordering NY Cheese pizza...");
        Pizza nyCheese = nystore.orderPizza("cheese");
        System.out.println(nyCheese.toString());
        System.out.println();

        System.out.println("Ordering Chicago Pepperoni pizza...");
        Pizza chicPep = chicstore.orderPizza("pepperoni");
        System.out.println(chicPep.toString());
        System.out.println();
    }
}
