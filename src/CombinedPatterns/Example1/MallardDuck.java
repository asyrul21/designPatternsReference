package CombinedPatterns.Example1;

public class MallardDuck implements Quackable {
    ConcreteObservable observable;

    public MallardDuck(){
        observable = new ConcreteObservable(this);
    }

    @Override
    public void quack() {
        System.out.println("Quack!");
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
        return "Mallard Duck";
    }
}
