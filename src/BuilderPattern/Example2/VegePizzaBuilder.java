package BuilderPattern.Example2;

public class VegePizzaBuilder extends AbstractPizzaBuilder {
    public VegePizzaBuilder() {
        this.name = "Veggie Lovers Pizza";
    }
    public AbstractPizzaBuilder addCheese() {
        // veggie lovers like parm
        this.toppings.add("parmesan");
        return this;
    }
    public AbstractPizzaBuilder addSauce() {
        this.toppings.add("sauce");
        return this;
    }
    public AbstractPizzaBuilder addTomatoes() {
        this.toppings.add("chopped tomatoes");
        return this;
    }
    public AbstractPizzaBuilder addGarlic() {
        this.toppings.add("garlic");
        return this;
    }
    public AbstractPizzaBuilder addOlives() {
        this.toppings.add("green olives");
        return this;
    }
    public AbstractPizzaBuilder addSpinach() {
        this.toppings.add("spinach");
        return this;
    }
    public AbstractPizzaBuilder addPepperoni() {
        // never EVER add Pepperoni to veggie lovers pizza
        return this;
    }
    public AbstractPizzaBuilder addSausage() {
        // never EVER add Sausage to veggie lovers pizza
        return this;
    }
}
