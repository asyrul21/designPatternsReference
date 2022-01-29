package StrategyPattern.Example2;

public class Queen extends Character {
    public Queen(){
        weapon = new BowWeapon();
    }

    @Override
    public void fight() {
        System.out.println("Queen fights!");
        weapon.useWeapon();
    }
}
