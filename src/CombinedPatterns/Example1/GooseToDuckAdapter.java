package CombinedPatterns.Example1;

public class GooseToDuckAdapter implements Quackable {
    Goose goose;
    ConcreteObservable observable;

    public GooseToDuckAdapter(Goose g){
        this.goose = g;
        this.observable = new ConcreteObservable(this);
    }

    @Override
    public void quack() {
        this.goose.honk();
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
        return "Goose pretending to be a duck!";
    }
}
