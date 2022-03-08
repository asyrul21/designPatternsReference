package IteratorPattern.Example1;

import java.util.ArrayList;

public class PancakeHouseMenuIterator implements Iterator {
    ArrayList<MenuItem> items;
    int currentPosition = 0;

    public PancakeHouseMenuIterator(ArrayList<MenuItem> items){
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        if(currentPosition >= items.size()){
            return false;
        }
        return true;
    }

    @Override
    public MenuItem next() {
        MenuItem item = this.items.get(currentPosition);
        this.currentPosition += 1;
        return item;
    }

    @Override
    public void remove() {
        if(currentPosition <= 0){
            throw new IllegalStateException("You can't remove an item until you have done at least one next()");
        }
        this.items.remove(this.currentPosition);
    }
}
