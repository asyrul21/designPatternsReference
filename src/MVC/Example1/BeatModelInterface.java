package MVC.Example1;

public interface BeatModelInterface {
    void initialize();
    void on();
    void off();

    void setBPM(int bpm);
    int getBPM();

    // for controller to become observers
    // observers to be notified on every beat
    void registerObserver(BeatObserver o);
    void removeObserver(BeatObserver o);

    // observers to be notified as the BPM is updated
    void registerObserver(BPMObserver o);
    void removeObserver(BPMObserver o);
}
