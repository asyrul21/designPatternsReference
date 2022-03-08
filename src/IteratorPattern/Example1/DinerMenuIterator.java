package IteratorPattern.Example1;

public class DinerMenuIterator implements Iterator {
    MenuItem[] items;
    int position = 0;

    public DinerMenuIterator(MenuItem[] items){
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        if(position >= items.length || items[position] == null){
            return false;
        }
        return true;
    }

    @Override
    public MenuItem next() {
        MenuItem currentItem = this.items[position];
        position += 1;
        return currentItem;
    }

    @Override
    public void remove() {
        if(position <= 0){
            throw new IllegalStateException("You can't remove an item until you have done at least one next()");
        }
        // shift up all elements up one
        if(this.items[position - 1] != null){
            for(int i = position -1; i < (this.items.length - 1); i++){
                this.items[i] = this.items[i+1];
            }
            this.items[this.items.length - 1] = null;
        }
    }
}
