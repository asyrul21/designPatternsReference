package MVC.Example1;

public class BeatDJMain {
    public static void main(String[] args){
        BeatModelInterface model = new BeatModel();
        ControllerInterface controller = new BeatController(model);
    }
}
