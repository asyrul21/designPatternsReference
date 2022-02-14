package FactoryPattern.AbstractFactory;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type){
        Pizza pizza = null;
        AbstractIngredientFactory ingredientFactory = new ChicagoIngredientFactory();

        if(type.equals("cheese")){
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("Chicago Cheese Pizza");
        }else if (type.equals("vege")){
            pizza = new VegePizza(ingredientFactory);
            pizza.setName("Chicago Vege Pizza");
        }else if (type.equals("pepperoni")){
            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("Chicago Pepperoni Pizza");
        }
        return pizza;
    }
}
