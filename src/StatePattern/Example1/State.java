package StatePattern.Example1;

public interface State {
    // store all transition actions here
    public void insertQuarter();
    public void ejectQuarter();
    public void turnCrank();
    public void dispense();
    public void refill();
}
