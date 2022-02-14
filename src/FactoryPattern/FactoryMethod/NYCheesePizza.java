package FactoryPattern.FactoryMethod;

public class NYCheesePizza extends Pizza {
    public NYCheesePizza(){
        name = "NY Cheese Pizza";
        dough = "NY-style Regular Crust";
        sauce = "NY-style Marinara Pizza Sauce";
        toppings.add("NY-style Fresh Mozzarella");
        toppings.add("NY-style Parmesan");
    }
}
