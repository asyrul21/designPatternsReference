package CommandPattern.Example1;

public class StereoOnCommand implements Command{
    Stereo stereo;

    public StereoOnCommand(Stereo s){
        this.stereo = s;
    }

    @Override
    public void execute() {
        stereo.on();
        stereo.setCD();
        stereo.setVolume(11);
    }

    @Override
    public void undo() {
        stereo.setVolume(0);
        stereo.off();
    }
}
