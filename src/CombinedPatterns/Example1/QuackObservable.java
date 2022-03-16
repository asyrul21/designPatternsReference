package CombinedPatterns.Example1;

public interface QuackObservable {
    public void registerObserver(Observer observer);
    public void notifyObservers();
}
