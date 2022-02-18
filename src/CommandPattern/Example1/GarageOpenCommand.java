package CommandPattern.Example1;

public class GarageOpenCommand implements Command{
    GarageDoor garageDoor;

    public GarageOpenCommand(GarageDoor gd){
        this.garageDoor = gd;
    }

    @Override
    public void execute() {
        this.garageDoor.up();
        this.garageDoor.stop();
        this.garageDoor.lightOn();
    }

    @Override
    public void undo() {
        this.garageDoor.lightOff();
        this.garageDoor.down();
        this.garageDoor.stop();
    }
}
