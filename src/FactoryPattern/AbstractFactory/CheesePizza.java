package FactoryPattern.AbstractFactory;

public class CheesePizza extends Pizza {
    AbstractIngredientFactory ingredientFactory;

    public CheesePizza(AbstractIngredientFactory f){
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
