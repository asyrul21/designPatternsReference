package MVC.Example2;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.Line;
import java.io.File;

public class HeartToBeatModelAdapter implements BeatModelInterface {
    HeartModelInterface heart;

    public HeartToBeatModelAdapter(HeartModelInterface hmi){
        this.heart = hmi;
    }

    public void initialize() { }

    public void on() { }

    public void off() { }

    public void run() { }

    public void setBPM(int bpm) { }

    public int getBPM() {
        return this.heart.getHeartRate();
    }

    public void registerObserver(BeatObserver o) {
        this.heart.registerObserver(o);
    }

    public void registerObserver(BPMObserver o) {
        this.heart.registerObserver(o);
    }

    public void removeObserver(BeatObserver o) {
       this.heart.removeObserver(o);
    }

    public void removeObserver(BPMObserver o) {
        this.heart.removeObserver(o);
    }
}
