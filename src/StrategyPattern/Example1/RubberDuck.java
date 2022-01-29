package StrategyPattern.Example1;

public class RubberDuck extends Duck{
    public RubberDuck(){
        flyBehaviour = new FlyNoWay();
        quackBehaviour = new Squeak();
    }

    @Override
    public void display() {
        System.out.println("I am a Rubber Duck!");
    }
}
