package DecoratorPattern.Example1;

public class Milk extends CondimentDecorator {
    Beverage bev;

    public Milk(Beverage b){
        this.bev = b;
    }

    @Override
    public double cost() {
        return this.bev.cost() + 0.99;
    }

    @Override
    public String getDescription() {
        return this.bev.getDescription() + ", Milk";
    }
}
