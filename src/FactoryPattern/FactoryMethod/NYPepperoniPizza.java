package FactoryPattern.FactoryMethod;

public class NYPepperoniPizza extends Pizza {
    public NYPepperoniPizza(){
        name = "NY Pepperoni Pizza";
        dough = "NY-style Regular Crust";
        sauce = "NY-style Marinara Pizza Sauce";
        toppings.add("NY-style Fresh Mozzarella");
        toppings.add("NY-style Parmesan");
    }
}
