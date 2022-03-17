package BridgePattern.Example1;

public abstract class RemoteControl {
    TV tv;
    TVFactory tvFactory;

    public RemoteControl(TVFactory factory){
        this.tvFactory = factory;
    }

    // delegate
    public void on() {
        this.tv.on();
    }

    public void off() {
        this.tv.off();
    }

    public void setChannel(int channel) {
        tv.tuneChannel(channel);
    }

    public int getChannel() {
        return tv.getChannel();
    }

    public void setTV(String type) {
        try {
            tv = tvFactory.getTV(type);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
