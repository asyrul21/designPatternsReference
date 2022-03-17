package BridgePattern.Example1;

public class BridgeMain {
    public static void main(String[] args) {
        TVFactory tvFactory = new TVFactory();
        ConcreteRemote remoteSony = new ConcreteRemote(tvFactory);
        System.out.println("Connect your remote to the TV");
        remoteSony.setTV("Sony");
        remoteSony.on();
        remoteSony.up();
        remoteSony.down();
        remoteSony.off();

        ConcreteRemote2 remoteLG = new ConcreteRemote2(tvFactory);
        System.out.println("\nConnect your remote to the TV");
        remoteLG.setTV("LG");
        remoteLG.on();
        remoteLG.nextChannel();
        remoteLG.prevChannel();
        remoteLG.off();
    }
}
