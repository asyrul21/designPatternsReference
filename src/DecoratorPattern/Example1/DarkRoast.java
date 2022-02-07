package DecoratorPattern.Example1;

public class DarkRoast extends Beverage {
    public DarkRoast(){
        description = "Dark Roast";
    }

    @Override
    public double cost() {
        return 3.99;
    }
}
