package CompositePattern.Example2;

public class CompositeIteratorMain {
    static MenuComponent pancakeHouseMenu;
    static MenuComponent dinerMenu;
    static MenuComponent cafeMenu;
    static MenuComponent dessertMenu;

    public static void main(String[] args){
        System.out.println("Merged Menu with Desserts!");
        System.out.println();

        // define the BRANCHES
        pancakeHouseMenu = new Menu("PANCAKE HOUSE MENU", "BREAKFAST");
        dinerMenu = new Menu("DINER MENU", "LUNCH");
        cafeMenu = new Menu("CAFE MENU", "DINNER");
        dessertMenu = new Menu("DESSERT MENU", "DESSERT FOR LUNCH!");

        // add LEAVES to BRANCHES
        addMenuItemsToMenus();

        dinerMenu.add(dessertMenu);
        // add Branches to the root
        MenuComponent root = new Menu("ALL MENUS", "ALL MENUS COMBINED!");
        root.add(pancakeHouseMenu);
        root.add(dinerMenu);
        root.add(cafeMenu);

        Waitress waitress = new Waitress(root);

        waitress.printMenu();
        waitress.printVegetarianMenu();
    }

    public static void addMenuItemsToMenus(){
        pancakeHouseMenu.add(new MenuItem(
                "K&B's Pancake Breakfast",
                "Pancakes with scrambled eggs and toast",
                true,
                2.99));
        pancakeHouseMenu.add(new MenuItem(
                "Regular Pancake Breakfast",
                "Pancakes with fried eggs, sausage",
                false,
                2.99));
        pancakeHouseMenu.add(new MenuItem(
                "Blueberry Pancakes",
                "Pancakes made with fresh blueberries, and blueberry syrup",
                true,
                3.49));
        pancakeHouseMenu.add(new MenuItem(
                "Waffles",
                "Waffles with your choice of blueberries or strawberries",
                true,
                3.59));

        dinerMenu.add(new MenuItem(
                "Vegetarian BLT",
                "(Fakin') Bacon with lettuce & tomato on whole wheat",
                true,
                2.99));
        dinerMenu.add(new MenuItem(
                "BLT",
                "Bacon with lettuce & tomato on whole wheat",
                false,
                2.99));
        dinerMenu.add(new MenuItem(
                "Soup of the day",
                "A bowl of the soup of the day, with a side of potato salad",
                false,
                3.29));
        dinerMenu.add(new MenuItem(
                "Hot Dog",
                "A hot dog, with saurkraut, relish, onions, topped with cheese",
                false,
                3.05));
        dinerMenu.add(new MenuItem(
                "Steamed Veggies and Brown Rice",
                "Steamed vegetables over brown rice",
                true,
                3.99));

        dinerMenu.add(new MenuItem(
                "Pasta",
                "Spaghetti with marinara sauce, and a slice of sourdough bread",
                true,
                3.89));

        cafeMenu.add(new MenuItem(
                "Veggie Burger and Air Fries",
                "Veggie burger on a whole wheat bun, lettuce, tomato, and fries",
                true,
                3.99));
        cafeMenu.add(new MenuItem(
                "Soup of the day",
                "A cup of the soup of the day, with a side salad",
                false,
                3.69));
        cafeMenu.add(new MenuItem(
                "Burrito",
                "A large burrito, with whole pinto beans, salsa, guacamole",
                true,
                4.29));

        dessertMenu.add(new MenuItem(
                "Apple Pie",
                "Apple pie with a flakey crust, topped with vanilla icecream",
                true,
                1.59));

        dessertMenu.add(new MenuItem(
                "Cheesecake",
                "Creamy New York cheesecake, with a chocolate graham crust",
                true,
                1.99));
        dessertMenu.add(new MenuItem(
                "Sorbet",
                "A scoop of raspberry and a scoop of lime",
                true,
                1.89));
    }
}
