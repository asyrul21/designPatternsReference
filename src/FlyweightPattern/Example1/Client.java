package FlyweightPattern.Example1;

public class Client {
    public static void main(String[] args) {
        int[][] deciduousLocations = {{1, 1}, {33, 50}, {100, 90}};
        int[][] coniferLocations = {{10, 87}, {24, 76}, {2, 64}};

        Tree d, c;
        try {
            // creates the two flyweights
            // only one instance of each
            d = new DeciduousTree();
            c = new ConiferTree();

            // loop at client
            for (int[] location : deciduousLocations) {
                d.display(location[0],  location[1]);
            }
            for (int[] location : coniferLocations) {
                c.display(location[0],  location[1]);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
