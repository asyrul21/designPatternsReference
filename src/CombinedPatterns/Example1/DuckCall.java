package CombinedPatterns.Example1;

public class DuckCall implements Quackable{
    ConcreteObservable observable;

    public DuckCall(){
        observable = new ConcreteObservable(this);
    }

    @Override
    public void quack() {
        System.out.println("Kwak!");
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        this.observable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        this.observable.notifyObservers();
    }

    public String toString(){
        return "Duck Call";
    }
}
