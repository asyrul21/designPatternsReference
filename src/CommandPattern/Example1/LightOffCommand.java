package CommandPattern.Example1;

public class LightOffCommand implements Command {
    Light light;

    public LightOffCommand(Light l){
        this.light = l;
    }

    @Override
    public void execute() {
        this.light.off();
    }

    @Override
    public void undo() {
        this.light.on();
    }
}
