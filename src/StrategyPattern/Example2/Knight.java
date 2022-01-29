package StrategyPattern.Example2;

public class Knight extends Character {
    public Knight(){
        weapon = new SwordWeapon();
    }

    @Override
    public void fight() {
        System.out.println("Knight fights!");
        weapon.useWeapon();
    }
}
