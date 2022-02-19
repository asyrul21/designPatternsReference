package TemplateMethodPattern.Example1;

public class Tea extends CaffeineBeverage {
    @Override
    public void brew() {
        System.out.println("Steeping the Tea");
    }

    @Override
    public void addCondiments() {
        System.out.println("Adding Lemon");
    }
}
