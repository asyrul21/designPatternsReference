package ProxyPattern.Example1.Machine2;

import java.io.Serializable;

public interface State extends Serializable {
    // to enable remote communication we extend Serializable
    // to make the State class Serializable

    public void insertQuarter();
    public void ejectQuarter();
    public void turnCrank();
    public void dispense();
    public void refill();
}
