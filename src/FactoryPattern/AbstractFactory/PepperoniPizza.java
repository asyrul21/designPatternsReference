package FactoryPattern.AbstractFactory;

public class PepperoniPizza extends Pizza {
    AbstractIngredientFactory ingredientFactory;

    public PepperoniPizza(AbstractIngredientFactory f){
        this.ingredientFactory = f;
    }

    @Override
    void prepare() {
        System.out.println("Preparing " + name + "...");
        dough = ingredientFactory.createDough();
        cheese = ingredientFactory.createCheese();
        sauce = ingredientFactory.createSauce();
    }
}
