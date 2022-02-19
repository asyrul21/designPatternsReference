package FacadePattern.Example1;

public class HomeTheatreMain {
    public static void main(String[] args){
        System.out.println("The Home Theatre Facade");

        Light l = new Light();
        Stereo s = new Stereo();
        TV tv = new TV();

        HomeTheatreFacade theatre = new HomeTheatreFacade(l, s, tv);

        System.out.println();
        System.out.println("Watching a movie!");
        theatre.watchMovie();

        System.out.println();
        System.out.println("End watch movie!");
        theatre.endMovie();

    }
}
