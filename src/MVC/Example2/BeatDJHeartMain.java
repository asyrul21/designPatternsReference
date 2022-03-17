package MVC.Example2;

public class BeatDJHeartMain {
    public static void main(String[] args){
        HeartModelInterface model = new HeartModel();
        ControllerInterface controller = new HeartController(model);
    }
}
