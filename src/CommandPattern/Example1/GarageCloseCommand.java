package CommandPattern.Example1;

public class GarageCloseCommand implements Command {
    GarageDoor garageDoor;

    public GarageCloseCommand(GarageDoor gd){
        this.garageDoor = gd;
    }

    @Override
    public void execute() {
        this.garageDoor.lightOff();
        this.garageDoor.down();
        this.garageDoor.stop();
    }

    @Override
    public void undo() {
        this.garageDoor.up();
        this.garageDoor.stop();
        this.garageDoor.lightOn();
    }
}
