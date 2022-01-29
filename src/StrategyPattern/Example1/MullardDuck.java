package StrategyPattern.Example1;

public class MullardDuck extends Duck {
    public MullardDuck(){
        // programming to interfaces rather than concrete implementations
        quackBehaviour = new Quack();
        flyBehaviour = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I am a Mullard Duck!");
    }
}
