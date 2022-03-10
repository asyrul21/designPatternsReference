package ProxyPattern.Example1.Machine1;

import ProxyPattern.Example1.Machine2.GumballMachineRemote;

import java.rmi.*;

public class GumballMonitor {
    GumballMachineRemote machine;

    public GumballMonitor(GumballMachineRemote m){
        this.machine = m;
    }

    public void report(){
        try{
            System.out.println("Gumball Machine: " + this.machine.getLocation());
            System.out.println("Current Inventory: " + this.machine.getCount());
            System.out.println("Current State: " + this.machine.getState());
        }catch(RemoteException e){
            e.printStackTrace();
        }
    }

}
