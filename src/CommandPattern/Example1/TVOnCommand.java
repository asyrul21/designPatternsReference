package CommandPattern.Example1;

public class TVOnCommand implements Command{
    TV tv;

    public TVOnCommand(TV t){
        this.tv = t;
    }

    @Override
    public void execute() {
        this.tv.on();
        this.tv.setChannel();
    }

    @Override
    public void undo() {
        this.tv.off();
    }
}
