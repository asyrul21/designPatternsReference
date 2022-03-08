package IteratorPattern.Example1;

public class MenuItem {
    String name;
    String description;
    boolean vegetarian;
    double price;

    public MenuItem(String name, String des, Boolean vege, double price){
        this.name = name;
        this.description = des;
        this.vegetarian = vege;
        this.price = price;
    }

    public String getName(){
        return this.name;
    }

    public String getDescription(){
        return this.description;
    }

    public double getPrice(){
        return this.price;
    }

    public boolean isVegetarian(){
        return this.vegetarian;
    }


}
