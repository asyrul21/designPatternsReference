package StrategyPattern.Example1;

public class Quack implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("Quackk!!");
    }
}
