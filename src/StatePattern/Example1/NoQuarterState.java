package StatePattern.Example1;

public class NoQuarterState implements State {
    GumballMachine machine;

    public NoQuarterState(GumballMachine gm){
        this.machine = gm;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You inserted a quarter");
        machine.setState(machine.getHasQuarterState());
    }

    @Override
    public void turnCrank() {
        System.out.println("You turned, but there's no quarter");
    }

    @Override
    public void dispense() {
        System.out.println("You need to pay first");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("You haven't inserted a quarter");
    }

    @Override
    public void refill() {

    }

    public String toString() {
        return "waiting for quarter";
    }
}
