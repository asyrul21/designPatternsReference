package FactoryPattern.AbstractFactory;

public class NYIngredientFactory implements AbstractIngredientFactory {
    @Override
    public Cheese createCheese() {
        return new MozarellaCheese();
    }

    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }
}
