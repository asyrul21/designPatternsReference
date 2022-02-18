package AdapterPattern.Example1;

public class DuckAdapterMain {
    public static void main(String[] args){
        System.out.println("The Turkey to Duck Adapter");
        System.out.println();

        System.out.println("Creating a Turkey");
        System.out.println();
        Turkey turk = new WildTurkey();
        turk.fly();
        turk.gobble();

        System.out.println("Creating a Duck");
        System.out.println();
        Duck mallard = new MallardDuck();
        mallard.fly();
        mallard.quack();

        System.out.println("Transforming a Turkey to a Duck!");
        System.out.println();
        Duck transformed = new TurkeyToDuckAdapter(turk);
        ducksOnlyMethod(transformed);
    }

    static void ducksOnlyMethod(Duck duck){
        System.out.println("This is the Ducks only area");
        duck.fly();
        duck.quack();
    }
}
