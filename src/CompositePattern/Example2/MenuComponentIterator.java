package CompositePattern.Example2;

import java.util.ArrayList;

public class MenuComponentIterator implements Iterator {
    ArrayList<MenuComponent> menuComponents;
    int currentPosition = 0;

    public MenuComponentIterator(ArrayList<MenuComponent> components){
        this.menuComponents = components;
    }

    @Override
    public boolean hasNext() {
        if(currentPosition >= menuComponents.size()){
            return false;
        }
        return true;
    }

    @Override
    public MenuComponent next() {
        MenuComponent item = this.menuComponents.get(currentPosition);
        this.currentPosition += 1;
        return item;
    }

    @Override
    public void remove() {
        if(currentPosition <= 0){
            throw new IllegalStateException("You can't remove an item until you have done at least one next()");
        }
        this.menuComponents.remove(this.currentPosition);
    }
}
