package CommandPattern.Example1;

public class StereoOffCommand implements Command{
    Stereo stereo;

    public StereoOffCommand(Stereo s){
        this.stereo = s;
    }

    @Override
    public void execute() {
        stereo.setVolume(0);
        stereo.off();
    }

    @Override
    public void undo() {
        stereo.on();
        stereo.setCD();
        stereo.setVolume(11);
    }
}
