package FactoryPattern.SimpleFactory;

public class PizzaFactory {
    Pizza pizza;

    public Pizza createPizza(String type){
        if(type.equals("cheese")){
            pizza = new CheesePizza();
        }else if(type.equals("vege")){
            pizza = new VegePizza();
        }else if(type.equals("pepperoni")){
            pizza =  new PepperoniPizza();
        }
        return pizza;
    }
}
