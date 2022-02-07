package DecoratorPattern.Example1;

public class StarbuzzMain {
    public static void main(String[] args){
        System.out.println("Starbuzz making a Double Mocha Soy Latte!");

        Beverage houseBlend = new HouseBlend();

        Beverage houseBlendMocha = new Mocha(houseBlend);
        Beverage houseBlendDoubleMocha = new Mocha(houseBlendMocha);
        Beverage houseBlendDoubleMochaSoy = new Soy(houseBlendDoubleMocha);

        System.out.println();
        System.out.println("Beverage:");
        System.out.println(houseBlendDoubleMochaSoy.getDescription());
        System.out.println("Price:");
        System.out.println(houseBlendDoubleMochaSoy.cost());
    }
}
