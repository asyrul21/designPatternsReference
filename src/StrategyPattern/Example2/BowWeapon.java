package StrategyPattern.Example2;

public class BowWeapon implements WeaponBehaviour {
    @Override
    public void useWeapon() {
        System.out.println("Attack using a Bow and Arrows!");
    }
}
