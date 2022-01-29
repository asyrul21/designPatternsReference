package StrategyPattern.Example2;

public class SwordWeapon implements WeaponBehaviour {
    @Override
    public void useWeapon() {
        System.out.println("Attack with a Sword!");
    }
}
