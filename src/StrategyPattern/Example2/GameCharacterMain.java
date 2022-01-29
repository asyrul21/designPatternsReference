package StrategyPattern.Example2;

public class GameCharacterMain {
    public static void main(String[] args){
        System.out.println("Main Program of Game Characters!");

        Character queen = new Queen();
        queen.fight();

        Character king = new King();
        king.fight();

        Character knight = new Knight();
        knight.fight();
    }
}
