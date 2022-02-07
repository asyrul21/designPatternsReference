package DecoratorPattern.Example1;

public class HouseBlend extends Beverage{
    public HouseBlend(){
        description = "House Blend";
    }

    @Override
    public double cost() {
        return 2.99;
    }
}
