package StrategyPattern.Example1;

public class FlyWithRocket implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println("Flying with my new Rocket!");
    }
}
