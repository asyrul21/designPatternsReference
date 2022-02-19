package FacadePattern.Example1;

public class TV {
    int channel;

    public TV() { }

    public void on() {
        System.out.println("TV is on");
    }

    public void off() {
        System.out.println("TV is off");
    }

    public void setChannel() {
        this.channel = 3;
        System.out.println("Channel is set for Movie");
    }
}
