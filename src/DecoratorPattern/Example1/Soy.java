package DecoratorPattern.Example1;

public class Soy extends CondimentDecorator {
    Beverage bev;

    public Soy(Beverage b){
        this.bev = b;
    }

    @Override
    public String getDescription() {
        return this.bev.getDescription() + ", Soy";
    }

    @Override
    public double cost() {
        return this.bev.cost() + 0.25;
    }
}
