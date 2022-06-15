package VisitorPattern.Example1;

public class NormalMenuItem extends MenuItem {
    String name;
    double price;
    String description;

    public NormalMenuItem(String name, String description, double price){
        this.name = name;
        this.price = price;
        this.description = description;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void print() {
        System.out.print("  " + getName());
        System.out.println(", " + getPrice());
        System.out.println("     -- " + getDescription());
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitNormalMenuItem(this);
    }
}
