package StrategyPattern.Example1;

public class RocketDuck extends Duck {
    public RocketDuck(){
        flyBehaviour = new FlyWithRocket();
        quackBehaviour = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I am a Rocket Duck!");
    }
}
