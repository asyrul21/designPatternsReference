package FactoryPattern.AbstractFactory;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {
    String name;

    Dough dough;
    Sauce sauce;
    Cheese cheese;

    // declare the prepare method as abstract
    abstract void prepare();

    public String getName() {
        return name;
    }

    public void bake() {
        System.out.println("Baking " + name);
    }

    public void cut() {
        System.out.println("Cutting " + name);
    }

    public void box() {
        System.out.println("Boxing " + name);
    }

    public void setName(String name){
        this.name = name;
    }

    public String toString() {
        // code to display pizza name and ingredients
        StringBuffer display = new StringBuffer();
        display.append("---- " + name + " ----\n");
        display.append(dough.getName() + "\n");
        display.append(sauce.getName() + "\n");
        display.append(cheese.getName() + "\n");

        return display.toString();
    }
}
