package StrategyPattern.Example1;

public class SimuDuckMain {
    public static void main(String[] args){
        System.out.println("The Main Program of SimuDuck!");

        Duck Mullard = new MullardDuck();
        Mullard.display();
        Mullard.performFly();
        Mullard.performQuack();

        System.out.println();

        Duck Rubber = new RubberDuck();
        Rubber.display();
        Rubber.performFly();
        Rubber.performQuack();

        System.out.println();
        Duck Rocket = new RocketDuck();
        Rocket.display();
        Rocket.performFly();
        Rocket.performQuack();

        System.out.println();
        System.out.println("Changing Rocket's Fly Behaviour at Runtime!");
        Rocket.setFlyBehaviour(new FlyWithWings());
        Rocket.performFly();
    }
}
