package BridgePattern.Example1;

public class ConcreteRemote2 extends RemoteControl {
    public ConcreteRemote2(TVFactory tvFactory) {
        super(tvFactory);
    }
    public void nextChannel() {
        int channel = this.getChannel();
        this.setChannel(channel+1);
    }
    public void prevChannel() {
        int channel = this.getChannel();
        this.setChannel(channel-1);
    }
}
