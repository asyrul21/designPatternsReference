package StrategyPattern.Example1;

public class Squeak implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("Squeakk!");
    }
}
