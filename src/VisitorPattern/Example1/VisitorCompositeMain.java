package VisitorPattern.Example1;


public class VisitorCompositeMain {
    static MenuComponent pancakeHouseMenu;
    static MenuComponent dinerMenu;
    static MenuComponent cafeMenu;
    static MenuComponent dessertMenu;
    public static void main(String[] args){
        System.out.println("\nVisitor Pattern for Composite Structure!\n");

        // define the BRANCHES
        pancakeHouseMenu = new Menu("PANCAKE HOUSE MENU", "BREAKFAST");
        dinerMenu = new Menu("DINER MENU", "LUNCH");
        cafeMenu = new Menu("CAFE MENU", "DINNER");
        dessertMenu = new Menu("DESSERT MENU", "DESSERT FOR LUNCH!");

        addMenuItemsToMenus();

        dinerMenu.add(dessertMenu);
        // add Branches to the root
        MenuComponent root = new Menu("ALL MENUS", "ALL MENUS COMBINED!");
        root.add(pancakeHouseMenu);
        root.add(dinerMenu);
        root.add(cafeMenu);

        Waitress waitress = new Waitress(root);
        waitress.printMenu();

        System.out.println("\n--------------------------------------");
        System.out.println("Visitor Calculates Total Prices!");
        System.out.println("--------------------------------------\n");
        double normalItemTotalPrice = waitress.calculateNormalItemsTotalPrice();
        double vegeItemTotalPrice = waitress.calculateVegetarianItemsTotalPrice();
        System.out.println("Normal items total price: " + normalItemTotalPrice);
        System.out.println("Vegetarian items total price: " + vegeItemTotalPrice);

        System.out.println("\n--------------------------------------");
        System.out.println("Visitor Captures Names of Menu Items!!");
        System.out.println("--------------------------------------\n");
        String normalItemNames = waitress.getNormalItemNames();
        String vegeItemNames = waitress.getVegetarianItemNames();
        System.out.println("Normal items names: " + normalItemNames);
        System.out.println("Vegetarian items names: " + vegeItemNames);
    }

    public static void addMenuItemsToMenus(){
        pancakeHouseMenu.add(new VegetarianMenuItem(
                "K&B's Pancake Breakfast",
                "Pancakes with scrambled eggs and toast",
                2.99));
        pancakeHouseMenu.add(new NormalMenuItem(
                "Regular Pancake Breakfast",
                "Pancakes with fried eggs, sausage",
                2.99));
        pancakeHouseMenu.add(new VegetarianMenuItem(
                "Blueberry Pancakes",
                "Pancakes made with fresh blueberries, and blueberry syrup",
                3.49));
        pancakeHouseMenu.add(new VegetarianMenuItem(
                "Waffles",
                "Waffles with your choice of blueberries or strawberries",
                3.59));

        dinerMenu.add(new VegetarianMenuItem(
                "Vegetarian BLT",
                "(Fakin') Bacon with lettuce & tomato on whole wheat",
                2.99));
        dinerMenu.add(new NormalMenuItem(
                "BLT",
                "Bacon with lettuce & tomato on whole wheat",
                2.99));
        dinerMenu.add(new VegetarianMenuItem(
                "Soup of the day",
                "A bowl of the soup of the day, with a side of potato salad",
                3.29));
        dinerMenu.add(new NormalMenuItem(
                "Hot Dog",
                "A hot dog, with saurkraut, relish, onions, topped with cheese",
                3.05));
        dinerMenu.add(new VegetarianMenuItem(
                "Steamed Veggies and Brown Rice",
                "Steamed vegetables over brown rice",
                3.99));

        dinerMenu.add(new VegetarianMenuItem(
                "Pasta",
                "Spaghetti with marinara sauce, and a slice of sourdough bread",
                3.89));

        cafeMenu.add(new VegetarianMenuItem(
                "Veggie Burger and Air Fries",
                "Veggie burger on a whole wheat bun, lettuce, tomato, and fries",
                3.99));
        cafeMenu.add(new VegetarianMenuItem(
                "Burrito",
                "A large burrito, with whole pinto beans, salsa, guacamole",
                4.29));

        dessertMenu.add(new VegetarianMenuItem(
                "Apple Pie",
                "Apple pie with a flakey crust, topped with vanilla icecream",
                1.59));

        dessertMenu.add(new VegetarianMenuItem(
                "Cheesecake",
                "Creamy New York cheesecake, with a chocolate graham crust",
                1.99));
        dessertMenu.add(new VegetarianMenuItem(
                "Sorbet",
                "A scoop of raspberry and a scoop of lime",
                1.89));
    }
}
