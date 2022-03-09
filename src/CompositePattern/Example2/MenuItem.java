package CompositePattern.Example2;

public class MenuItem extends MenuComponent {
    // MenuItem is a LEAF. Only override methods that are applicable to the leaf node.
    String name;
    String description;
    double price;
    boolean vegetarian;

    public MenuItem(String name, String des, boolean isVege,  double price){
        this.name = name;
        this.description = des;
        this.price = price;
        this.vegetarian = isVege;
    }

    public String getName(){
        return name;
    }

    public String getDescription(){
        return name;
    }

    public double getPrice(){
        return price;
    }

    public boolean isVegetarian(){
        return vegetarian;
    }

    public void print() {
        System.out.print("  " + getName());
        if (isVegetarian()) {
            System.out.print("(v)");
        }
        System.out.println(", " + getPrice());
        System.out.println("     -- " + getDescription());
    }

    @Override
    public Iterator createIterator() {
        return new NullIterator();
    }
}
