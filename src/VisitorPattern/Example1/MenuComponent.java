package VisitorPattern.Example1;

public abstract class MenuComponent implements Visitable {
    // Composite Methods
    public abstract void add(MenuComponent menuComponent);
    public abstract void remove(MenuComponent menuComponent);
    public abstract MenuComponent getChild(int i);

    // Operation Methods
    public abstract String getName();
    public abstract String getDescription();
    public abstract double getPrice();
    public abstract void print();
}
