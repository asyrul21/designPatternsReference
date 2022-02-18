package CommandPattern.Example1;

public class TVOffCommand implements Command {
    TV tv;

    public TVOffCommand(TV t){
        this.tv = t;
    }

    @Override
    public void execute() {
        this.tv.off();
    }

    @Override
    public void undo() {
        this.tv.on();
        this.tv.setChannel();
    }
}
