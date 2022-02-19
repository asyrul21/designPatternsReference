package FacadePattern.Example1;

public class HomeTheatreFacade {
    Light lights;
    Stereo stereo;
    TV tv;

    public HomeTheatreFacade(Light l, Stereo s, TV t){
        this.lights = l;
        this.stereo = s;
        this.tv = t;
    }

    public void watchMovie(){
        this.lights.on();
        this.tv.on();
        this.tv.setChannel();
        this.stereo.on();
        this.stereo.setDVD();
        this.stereo.setVolume(11);
    }

    public void endMovie(){
        this.lights.off();
        this.tv.off();
        this.stereo.setVolume(0);
        this.stereo.off();
    }
}
