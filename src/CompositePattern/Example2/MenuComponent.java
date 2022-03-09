package CompositePattern.Example2;

public abstract class MenuComponent {
    // Composite Methods
    public void add(MenuComponent menuComponent){
        throw new UnsupportedOperationException();
    }
    public void remove(MenuComponent menuComponent){
        throw new UnsupportedOperationException();
    }
    public MenuComponent getChild(int i){
        throw new UnsupportedOperationException();
    }

    // Operation Methods
    public String getName(){
        throw new UnsupportedOperationException();
    };
    public String getDescription(){
        throw new UnsupportedOperationException();
    };
    public double getPrice(){
        throw new UnsupportedOperationException();
    };
    public boolean isVegetarian(){
        throw new UnsupportedOperationException();
    };
    public void print(){
        throw new UnsupportedOperationException();
    };

    // Composite Iterator Method
    public abstract Iterator createIterator();
}
