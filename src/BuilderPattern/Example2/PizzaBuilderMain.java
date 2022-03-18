package BuilderPattern.Example2;

public class PizzaBuilderMain {
    public static void main(String[] args) {
        AbstractPizzaBuilder veggieBuilder = new VegePizzaBuilder();
        Pizza veggie = veggieBuilder.addSauce().addCheese().addOlives().addTomatoes().addSausage().build();
        veggie.prepare();
        veggie.bake();
        veggie.cut();
        veggie.box();
        System.out.println(veggie);
        System.out.println();

        AbstractPizzaBuilder meatBuilder = new MeatPizzaBuilder();
        Pizza meat = meatBuilder.addSauce().addTomatoes().addCheese().addSausage().addPepperoni().build();
        meat.prepare();
        meat.bake();
        meat.cut();
        meat.box();
        System.out.println(meat);
    }
}
