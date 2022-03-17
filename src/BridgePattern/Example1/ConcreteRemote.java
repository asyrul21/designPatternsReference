package BridgePattern.Example1;

public class ConcreteRemote extends RemoteControl {
    public ConcreteRemote(TVFactory tvFactory) {
        super(tvFactory);
    }
    public void up() {
        int channel = this.getChannel();
        this.setChannel(channel+1);
    }
    public void down() {
        int channel = this.getChannel();
        this.setChannel(channel-1);
    }
}
