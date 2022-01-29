package StrategyPattern.Example2;

public class King extends Character {
    public King(){
        weapon = new KnifeWeapon();
    }

    @Override
    public void fight() {
        System.out.println("King fights!");
        weapon.useWeapon();
    }
}
