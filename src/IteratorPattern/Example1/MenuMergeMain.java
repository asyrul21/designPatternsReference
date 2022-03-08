package IteratorPattern.Example1;

public class MenuMergeMain {
    public static void main(String[] args){
        System.out.println("Merged Menu!");
        System.out.println();

        Menu pm = new PancakeHouseMenu();
        Menu dm = new DinerMenu();
        Menu cm = new CafeMenu();

        Waitress waitress = new Waitress(pm, dm, cm);

        waitress.printAllMenus();
        System.out.print("\n");
        waitress.printVegetarianMenus();
    }
}
