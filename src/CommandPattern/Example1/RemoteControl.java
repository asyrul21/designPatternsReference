package CommandPattern.Example1;

public class RemoteControl {
    Command[] onCommands;
    Command[] offCommands;
    Command lastExecutedCommand;

    public RemoteControl(){
        this.onCommands = new Command[7];
        this.offCommands = new Command[7];
        Command noCommand = new NoCommand();
        for(int i = 0; i < 7; i++){
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        lastExecutedCommand = noCommand;
    }

    public void setCommand(int slot, Command onCommand, Command offCommand){
        this.onCommands[slot] = onCommand;
        this.offCommands[slot] = offCommand;
    }


    public void onButtonOnPressed(int slot){
        this.onCommands[slot].execute();
        this.lastExecutedCommand = this.onCommands[slot];
    }

    public void onButtonOffPressed(int slot){
        this.offCommands[slot].execute();
        this.lastExecutedCommand = this.offCommands[slot];
    }

    public void onUndo(){
        this.lastExecutedCommand.undo();
    }

    public String toString() {
        StringBuffer stringBuff = new StringBuffer();
        stringBuff.append("\n------ Remote Control -------\n");
        for (int i = 0; i < onCommands.length; i++) {
            stringBuff.append("[slot " + i + "] " + onCommands[i].getClass().getName()
                    + "    " + offCommands[i].getClass().getName() + "\n");
        }
        stringBuff.append("[undo] " + this.lastExecutedCommand.getClass().getName() + "\n");
        return stringBuff.toString();
    }
}
