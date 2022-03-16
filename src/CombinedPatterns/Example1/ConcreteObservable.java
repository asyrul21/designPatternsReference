package CombinedPatterns.Example1;

import java.util.ArrayList;
import java.util.Iterator;

public class ConcreteObservable implements QuackObservable {
    ArrayList<Observer> observers = new ArrayList<Observer>();
    QuackObservable quacker;

    public ConcreteObservable(QuackObservable duck){
        this.quacker = duck;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        // using Java's built in conversion from ArrayList to Iterator
        Iterator<Observer> iterator = observers.iterator();
        while (iterator.hasNext()){
            Observer obs = iterator.next();
            obs.update(quacker);
        }
    }
}
