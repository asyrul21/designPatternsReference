package BuilderPattern.Example2;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractPizzaBuilder {
    String name;
    List<String> toppings = new ArrayList<String>();

    public abstract AbstractPizzaBuilder addCheese();
    public abstract AbstractPizzaBuilder addSauce();
    public abstract AbstractPizzaBuilder addTomatoes();
    public abstract AbstractPizzaBuilder addGarlic();
    public abstract AbstractPizzaBuilder addOlives();
    public abstract AbstractPizzaBuilder addSpinach();
    public abstract AbstractPizzaBuilder addPepperoni();
    public abstract AbstractPizzaBuilder addSausage();
    public Pizza build() {
        Pizza pizza = new Pizza();
        pizza.setName(this.name);
        pizza.addToppings(toppings);
        return pizza;
    }
}
