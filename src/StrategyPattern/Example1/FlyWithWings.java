package StrategyPattern.Example1;

public class FlyWithWings implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println("Flying with a pair of wings!");
    }
}
