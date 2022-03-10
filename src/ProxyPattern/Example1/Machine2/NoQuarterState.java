package ProxyPattern.Example1.Machine2;

public class NoQuarterState implements State {
    // to enable remote communication we add serialVersionUID
    // and add 'transient' keyword to Gumball Machine so that
    // it will not be serialized
    private static final long serialVersionUID = 2L;
    transient GumballMachine machine;

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
