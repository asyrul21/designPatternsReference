package FactoryPattern.FactoryMethod;

public class NYPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type){
        if(type.equals("cheese")){
            return new NYCheesePizza();
        }else if (type.equals("vege")){
            return new NYVegePizza();
        }else if (type.equals("pepperoni")){
            return new NYPepperoniPizza();
        }
        return null;
    }
}
