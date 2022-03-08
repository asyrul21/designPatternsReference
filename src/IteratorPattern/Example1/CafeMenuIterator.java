package IteratorPattern.Example1;

import java.util.HashMap;
import java.util.Iterator;

// for this one we will use Java's built in Iterator interface

public class CafeMenuIterator implements IteratorPattern.Example1.Iterator {
    Iterator<MenuItem> iterator;

    public CafeMenuIterator( HashMap<String, MenuItem> menuItems){
        this.iterator = menuItems.values().iterator();
    }

    @Override
    public boolean hasNext() {
        // delegate
        return this.iterator.hasNext();
    }

    @Override
    public Object next() {
        // delegate
        return this.iterator.next();
    }

    @Override
    public void remove() {
        // delegate
        this.iterator.remove();
    }
}
