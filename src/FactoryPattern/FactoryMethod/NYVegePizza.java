package FactoryPattern.FactoryMethod;

public class NYVegePizza extends Pizza {
    public NYVegePizza(){
        name = "NY Vegetarian Pizza";
        dough = "NY-style Regular Crust";
        sauce = "NY-style Marinara Pizza Sauce";
        toppings.add("NY-style Fresh Mozzarella");
        toppings.add("NY-style Parmesan");
    }
}
