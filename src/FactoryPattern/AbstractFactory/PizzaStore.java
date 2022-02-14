package FactoryPattern.AbstractFactory;

public abstract class PizzaStore {
    // we use this factory method in subclass to assign
    // the pizza variable to a more specific instance of Pizza Store
    public abstract Pizza createPizza(String type);

    public Pizza orderPizza(String type){
        Pizza pizza;

        // subclass will determine this instance
        pizza = this.createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
}
