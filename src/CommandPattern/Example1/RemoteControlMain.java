package CommandPattern.Example1;

public class RemoteControlMain {
    public static void main(String[] args){
        System.out.println("Welcome to the Remote Control app!");

        // get vendor classes // Receivers
        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("Kitchen");
        Stereo homeStereo = new Stereo("Living Room");
        TV homeTV = new TV("Living Room TV");
        GarageDoor garageDoor = new GarageDoor("Porch");

        // Commands
        Command livingRoomLightOn = new LightOnCommand(livingRoomLight);
        Command livingRoomLightOff = new LightOffCommand(livingRoomLight);

        Command kitchenLightOn = new LightOnCommand(kitchenLight);
        Command kitchenLightOff = new LightOffCommand(kitchenLight);

        Command StereoOn = new StereoOnCommand(homeStereo);
        Command StereoOff = new StereoOffCommand(homeStereo);

        Command TVOn = new TVOnCommand(homeTV);
        Command TVOff = new TVOffCommand(homeTV);

        Command garageOpen = new GarageOpenCommand(garageDoor);
        Command garageClose = new GarageCloseCommand(garageDoor);

        // Invoker
        RemoteControl remote = new RemoteControl();

        remote.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        remote.setCommand(1, kitchenLightOn, kitchenLightOff);
        remote.setCommand(2, StereoOn, StereoOff);
        remote.setCommand(3, TVOn, TVOff);
        remote.setCommand(4, garageOpen, garageClose);

        System.out.println(remote);
        System.out.println();
        System.out.println("Turning Living Room light and TV on!");

        remote.onButtonOnPressed(0);
        remote.onButtonOnPressed(3);

        System.out.println();
        System.out.println("Undo last command!");

        remote.onUndo();

        System.out.println(remote);

        System.out.println();
        System.out.println("Turning stereo on!");

        remote.onButtonOnPressed(2);

        System.out.println();
        System.out.println("Turning stereo off!");

        remote.onButtonOffPressed(2);

        System.out.println();
        System.out.println("Turning everything off!");

        remote.onButtonOffPressed(0);
        remote.onButtonOffPressed(3);
        remote.onButtonOffPressed(2);

        System.out.println();
        System.out.println("Creating a Macro Commands!");

        Command[] onCommands = { livingRoomLightOn, kitchenLightOn, TVOn, StereoOn, garageOpen};
        Command[] offCommands = { livingRoomLightOff, kitchenLightOff, TVOff, StereoOff, garageClose};

        Command onMacro = new MacroCommand(onCommands);
        Command offMacro = new MacroCommand(offCommands);

        remote.setCommand(5, onMacro, offMacro);

        System.out.println(remote);

        System.out.println();
        System.out.println("Turning everything ON!");

        remote.onButtonOnPressed(5);

        System.out.println();
        System.out.println("Turning everything OFF!");

        remote.onButtonOffPressed(5);
    }
}
