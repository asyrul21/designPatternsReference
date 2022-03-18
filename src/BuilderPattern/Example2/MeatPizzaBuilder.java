package BuilderPattern.Example2;

public class MeatPizzaBuilder extends AbstractPizzaBuilder {
    public MeatPizzaBuilder() {
        this.name = "Meat Lovers Pizza";
    }
    public AbstractPizzaBuilder addCheese() {
        // meat lovers like moz
        this.toppings.add("mozzerella");
        return this;
    }
    public AbstractPizzaBuilder addSauce() {
        this.toppings.add("NY style sauce");
        return this;
    }
    public AbstractPizzaBuilder addTomatoes() {
        this.toppings.add("sliced tomatoes");
        return this;
    }
    public AbstractPizzaBuilder addGarlic() {
        this.toppings.add("garlic");
        return this;
    }
    public AbstractPizzaBuilder addOlives() {
        // never add olives to meat lovers pizza
        return this;
    }
    public AbstractPizzaBuilder addSpinach() {
        // never add spinach to meat lovers pizza
        return this;
    }
    public AbstractPizzaBuilder addPepperoni() {
        this.toppings.add("pepperoni");
        return this;
    }
    public AbstractPizzaBuilder addSausage() {
        this.toppings.add("sausage");
        return this;
    }
}
