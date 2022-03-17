package BridgePattern.Example1;

public class ConcreteRemote extends RemoteControl {
    public ConcreteRemote(TVFactory tvFactory) {
        super(tvFactory);
    }

    // new methods of concrete abstraction subclass
    // are implemented in terms of abstraction superclass
    public void up() {
        int channel = this.getChannel();
        this.setChannel(channel+1);
    }
    public void down() {
        int channel = this.getChannel();
        this.setChannel(channel-1);
    }
}
