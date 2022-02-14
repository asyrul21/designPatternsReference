package FactoryPattern.AbstractFactory;

public class VegePizza extends Pizza {
    AbstractIngredientFactory ingredientFactory;

    public VegePizza(AbstractIngredientFactory f){
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
