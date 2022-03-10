package ProxyPattern.Example1.Machine2;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class GumballMachine extends UnicastRemoteObject implements GumballMachineRemote {
    State currentState;

    State noQuarterState;
    State hasQuarterState;
    State soldState;
    State soldOutState;

    String location;

    int count = 0;

    public GumballMachine(int numberGumballs, String location) throws RemoteException {
        this.noQuarterState = new NoQuarterState(this);
        this.hasQuarterState = new HasQuarterState(this);
        this.soldState = new SoldState(this);
        this.soldOutState = new SoldOutState(this);
        this.location = location;

        this.count = numberGumballs;
        if(numberGumballs > 0){
            currentState = noQuarterState;
        }else{
            currentState = soldOutState;
        }
    }

    public int getCount() {
        return count;
    }
    public String getLocation(){return location; }

    public void setState(State s){
        this.currentState = s;
    }
    public State getState() {
        return currentState;
    }

    // state getters
    public State getNoQuarterState() {
        return noQuarterState;
    }
    public State getHasQuarterState() {
        return hasQuarterState;
    }
    public State getSoldState() {
        return soldState;
    }
    public State getSoldOutState() {
        return soldOutState;
    }

    // state transition actions
    public void insertQuarter() {
        currentState.insertQuarter();
    }

    public void ejectQuarter() {
        currentState.ejectQuarter();
    }

    public void turnCrank() {
        currentState.turnCrank();
        currentState.dispense();
    }

    void releaseBall() {
        System.out.println("A gumball comes rolling out the slot...");
        if (count > 0) {
            count = count - 1;
        }
    }

    void refill(int count) {
        this.count += count;
        System.out.println("The gumball machine was just refilled; its new count is: " + this.count);
        currentState.refill();
    }

    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append("\nMighty Gumball, Inc.");
        result.append("\nJava-enabled Standing Gumball Model #2004");
        result.append("\nLocation: " + location);
        result.append("\nInventory: " + count + " gumball");
        if (count != 1) {
            result.append("s");
        }
        result.append("\n");
        result.append("Machine is " + currentState + "\n");
        return result.toString();
    }
}
