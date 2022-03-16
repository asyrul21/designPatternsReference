package CombinedPatterns.Example1;

import java.util.ArrayList;
import java.util.Iterator;

public class FlockQuackableComposite implements Quackable {
    ArrayList<Quackable> quackers = new ArrayList<Quackable>();

    @Override
    public void quack() {
        // using Java's built in conversion from ArrayList to Iterator here
        Iterator<Quackable> iterator = quackers.iterator();
        while (iterator.hasNext()){
            Quackable q = iterator.next();
            q.quack();
        }
    }

    public void add(Quackable q){
        this.quackers.add(q);
    }

    // this is to register in bulk the same observer to all observable
    // one-to-many relationship: one observer, but many observable.
    public void registerObserver(Observer observer) {
        Iterator<Quackable> iterator = quackers.iterator();
        while (iterator.hasNext()) {
            Quackable duck = (Quackable)iterator.next();
            duck.registerObserver(observer);
        }
    }

    // we do not need to implement this, since each observable
    // already overrides their own notifyObservers
    public void notifyObservers() { }

    public String toString() {
        return "Flock of Ducks";
    }
}
