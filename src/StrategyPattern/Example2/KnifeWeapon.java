package StrategyPattern.Example2;

public class KnifeWeapon implements WeaponBehaviour{
    @Override
    public void useWeapon() {
        System.out.println("Attack with a Knife!");
    }
}
