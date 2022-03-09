package CompositePattern.Example2;

import java.util.Stack;

public class CompositeIterator implements Iterator {
    // we collect all iterators in a stack
    Stack<Iterator> stack = new Stack<Iterator>();

    public CompositeIterator(Iterator iterator){
        stack.push(iterator);
    }

    @Override
    public boolean hasNext() {
        if(stack.empty()){
            return false;
        }else{
            // if not empty, get the iterator off the stack
            // Then call hasNext() recursively
            Iterator iterator = stack.peek();
            if(!iterator.hasNext()){
                stack.pop();
                return hasNext();
            }else{
                return true;
            }
        }
    }

    @Override
    public Object next() {
        // if there is next element, we get the current iterator off
        // the stack, and get its next element.
        if(hasNext()){
            // we then throw that component's iterator on the stack if the component is a Menu (BRANCH)
            // If the component is a MenuItem (LEAF), we get the Null Iterator, so that no iteration happens.
            Iterator iterator = stack.peek();
            MenuComponent component = (MenuComponent) iterator.next();

            stack.push(component.createIterator());

            return component;
        }else{
            return null;
        }
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
