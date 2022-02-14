package FactoryPattern.AbstractFactory;

public class NYPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type){
        Pizza pizza = null;
        AbstractIngredientFactory ingredientFactory = new NYIngredientFactory();

        if(type.equals("cheese")){
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("NY Cheese Pizza");
        }else if (type.equals("vege")){
            pizza = new VegePizza(ingredientFactory);
            pizza.setName("NY Vege Pizza");
        }else if (type.equals("pepperoni")){
            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("NY Pepperoni Pizza");
        }
        return pizza;
    }
}
