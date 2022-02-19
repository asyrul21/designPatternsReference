package TemplateMethodPattern.Example1;

public class CoffeeTeaRecipeMain {
    public static void main(String[] args){
        System.out.println("Template Method: Coffee/Tea Recipe");

        System.out.println();
        System.out.println("Making some Tea");
        CaffeineBeverage tea = new Tea();
        tea.prepareBeverage();

        System.out.println();
        System.out.println("Making some Coffee");
        CaffeineBeverage coffee = new Coffee();
        coffee.prepareBeverage();
    }
}
