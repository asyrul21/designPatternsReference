package BridgePattern.Example1;

public abstract class RemoteControl {
    TV tv;
    TVFactory tvFactory;

    public RemoteControl(TVFactory factory){
        this.tvFactory = factory;
    }

    // delegate in terms of Implementation hierarchy
    public void on() {
        this.tv.on();
    }

    // delegate in terms of Implementation hierarchy
    public void off() {
        this.tv.off();
    }

    // delegate in terms of Implementation hierarchy
    public void setChannel(int channel) {
        tv.tuneChannel(channel);
    }

    // delegate in terms of Implementation hierarchy
    public int getChannel() {
        return tv.getChannel();
    }

    // delegate in terms of Implementation hierarchy
    public void setTV(String type) {
        try {
            tv = tvFactory.getTV(type);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
