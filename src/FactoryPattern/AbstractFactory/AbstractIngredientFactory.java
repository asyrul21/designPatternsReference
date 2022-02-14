package FactoryPattern.AbstractFactory;

public interface AbstractIngredientFactory {
    public Dough createDough();
    public Cheese createCheese();
    public Sauce createSauce();
}
