package CombinedPatterns.Example1;

public class DuckSimulatorMain {
    public static void main(String[] args){
        DuckSimulatorMain sim = new DuckSimulatorMain();

        System.out.println("Duck Simulator Main");
        System.out.println();

        AbstractDuckFactory countedQuackFactory = new CountedQuackDuckFactory();
        sim.simulate(countedQuackFactory);
    }

    void simulate(AbstractDuckFactory factory){
        Quackable mallard = factory.createMallardDuck();
        Quackable redh = factory.createRedheadDuck();
        Quackable call = factory.createDuckCall();
        Quackable rubber = factory.createRubberDuck();

        // adapted
        Quackable gooseDuck = new GooseToDuckAdapter(new Goose());

        // 4 quacks
        simulate(mallard);
        simulate(redh);
        simulate(call);
        simulate(rubber);
        simulate(gooseDuck);

        System.out.println("\nWith Flock Composites!");

        FlockQuackableComposite ducks = new FlockQuackableComposite();

        // 4 + 4 = 8 quacks
        ducks.add(mallard);
        ducks.add(redh);
        ducks.add((rubber));
        ducks.add(gooseDuck);
        ducks.add(call);

        // creating a flock of Mallards
        Quackable mallardOne = factory.createMallardDuck();
        Quackable mallardTwo = factory.createMallardDuck();
        Quackable mallardThree = factory.createMallardDuck();
        Quackable mallardFour = factory.createMallardDuck();

        FlockQuackableComposite flockOfMallards = new FlockQuackableComposite();

        // 4 quacks
        flockOfMallards.add(mallardOne);
        flockOfMallards.add(mallardTwo);
        flockOfMallards.add(mallardThree);
        flockOfMallards.add(mallardFour);

        // combine flocks into a composite
        ducks.add(flockOfMallards);

        // adding observer to the whole flock
        System.out.println("\nObserver Implementation!");

        Quackologist quacko = new Quackologist();
        ducks.registerObserver(quacko);

        System.out.println("\nWhole Flock of Ducks Simulation!");
        System.out.println();
        simulate(ducks);

        System.out.println("\nMallard Flock Simulation!");
        System.out.println();
        simulate(flockOfMallards);

        System.out.println("\nThe ducks quacked " + QuackCounterDecorator.getQuackCounts() + " times.");
        // geese quacks do not count
    }

    void simulate(Quackable q){
        q.quack();
    }
}
