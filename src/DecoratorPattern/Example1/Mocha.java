package DecoratorPattern.Example1;

public class Mocha extends CondimentDecorator {
    Beverage bev;

    public Mocha(Beverage b){
        this.bev = b;
    }

    @Override
    public String getDescription() {
        return this.bev.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        return this.bev.cost() + 0.75;
    }
}
