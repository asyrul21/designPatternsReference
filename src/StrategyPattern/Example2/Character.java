package StrategyPattern.Example2;

public abstract class Character {
    WeaponBehaviour weapon;

    public Character(){}

    public abstract void fight();
}
