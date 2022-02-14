package FactoryPattern.FactoryMethod;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type){
        if(type.equals("cheese")){
            return new ChicCheesePizza();
        }else if (type.equals("vege")){
            return new ChicVegePizza();
        }else if (type.equals("pepperoni")){
            return new ChicPepperoniPizza();
        }
        return null;
    }
}
