package CombinedPatterns.Example1;

public class RubberDuck implements Quackable {
    ConcreteObservable observable;

    public RubberDuck(){
        observable = new ConcreteObservable(this);
    }

    @Override
    public void quack() {
        System.out.println("Squeak!");
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
        return "Rubber Duck";
    }
}
