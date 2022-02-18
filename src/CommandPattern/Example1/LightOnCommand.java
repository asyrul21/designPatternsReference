package CommandPattern.Example1;

public class LightOnCommand implements Command {
    Light light;

    public LightOnCommand(Light l){
        this.light = l;
    }

    @Override
    public void execute() {
        this.light.on();
    }

    @Override
    public void undo() {
        this.light.off();
    }
}
