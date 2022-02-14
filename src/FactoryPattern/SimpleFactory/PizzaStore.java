package FactoryPattern.SimpleFactory;

public class PizzaStore {
    PizzaFactory factory;

    public PizzaStore(PizzaFactory f){
        this.factory = f;
    }

    public Pizza orderPizza(String type){
        Pizza pizza = this.factory.createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
}
