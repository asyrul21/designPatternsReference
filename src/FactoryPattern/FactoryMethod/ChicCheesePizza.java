package FactoryPattern.FactoryMethod;

public class ChicCheesePizza extends Pizza {
    public ChicCheesePizza(){
        name = "Chicago Cheese Pizza";
        dough = "Chicago-style Regular Crust";
        sauce = "Chicago-style Marinara Pizza Sauce";
        toppings.add("Chicago-style Fresh Mozzarella");
        toppings.add("Chicago-style Parmesan");
    }

    @Override
    public void cut() {
        System.out.println("Cutting the pizza into SQUARE slices");
    }
}
