package IteratorPattern.Example1;

public class Waitress {
    Menu pancakeMenu;
    Menu dinerMenu;
    Menu cafeMenu;

    public Waitress(Menu pm, Menu dm, Menu cafe){
        this.pancakeMenu = pm;
        this.dinerMenu = dm;
        this.cafeMenu = cafe;
    }

    public void printAllMenus(){
        Iterator pancakeMenuIterator = this.pancakeMenu.createIterator();
        Iterator dinerMenuIterator = this.dinerMenu.createIterator();
        Iterator cafeMenuIterator = this.cafeMenu.createIterator();

        System.out.println("MENU\n----\nBREAKFAST");
        this.printMenu(pancakeMenuIterator);
        System.out.println("\nLUNCH");
        this.printMenu(dinerMenuIterator);
        System.out.println("\nCAFE");
        this.printMenu(cafeMenuIterator);
    }

    public void printMenu(Iterator iterator){
        while(iterator.hasNext()){
            MenuItem item = (MenuItem) iterator.next();
            System.out.print(item.getName() + ", ");
            System.out.print(item.getPrice() + " -- ");
            System.out.println(item.getDescription());
        }
    }

    // print vegetarian
    public void printVegetarianMenus(){
        System.out.println("\nVEGETARIAN MENU\n---------------");
        printVegetarianMenu(pancakeMenu.createIterator());
        printVegetarianMenu(dinerMenu.createIterator());
        printVegetarianMenu(cafeMenu.createIterator());
    }

    public void printVegetarianMenu(Iterator iterator){
        while (iterator.hasNext()) {
            MenuItem menuItem = (MenuItem) iterator.next();
            if (menuItem.isVegetarian()) {
                System.out.print(menuItem.getName() + ", ");
                System.out.print(menuItem.getPrice() + " -- ");
                System.out.println(menuItem.getDescription());
            }
        }
    }
}
