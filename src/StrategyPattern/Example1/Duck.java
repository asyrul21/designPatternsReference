package StrategyPattern.Example1;

public abstract class Duck {
    FlyBehaviour flyBehaviour;
    QuackBehaviour quackBehaviour;

    public Duck(){};

    public abstract void display();

    public void performQuack(){
        // delegation
        quackBehaviour.quack();
    }

    public void performFly(){
        // delegation
        flyBehaviour.fly();
    }

    public void setFlyBehaviour(FlyBehaviour newFlyBehaviour){
        flyBehaviour = newFlyBehaviour;
    }

    public void setQuackBehaviour(QuackBehaviour newQuackBehaviour){
        quackBehaviour = newQuackBehaviour;
    }
}
