package ProxyPattern.Example1.Machine1;

import ProxyPattern.Example1.Machine2.GumballMachineRemote;

import java.rmi.Naming;

public class RemoteGumballMonitorClientMain {
    public static void main(String[] args){
        String[] location = {
                "rmi://localhost/gumballmachine",
        };

        GumballMonitor[] monitors = new GumballMonitor[location.length];

        for(int i=0; i< location.length; i++){
            try{
                GumballMachineRemote machine = (GumballMachineRemote)Naming.lookup(location[i]);
                monitors[i] = new GumballMonitor(machine);
                System.out.println(monitors[i]);
            }catch(Exception e){
                e.printStackTrace();
            }
        }

        // print report for all monitors
        for(int i =0; i< location.length; i++){
            monitors[i].report();
        }
    }
}
