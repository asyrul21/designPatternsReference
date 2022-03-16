package CombinedPatterns.Example1;

public class QuackCounterDecorator implements Quackable {
    Quackable quackable;
    static int quackCounts;

    public QuackCounterDecorator(Quackable q){
        this.quackable = q;
    }

    @Override
    public void quack() {
        this.quackable.quack();
        quackCounts++;
    }

    public static int getQuackCounts(){
        return quackCounts;
    }

    @Override
    public void registerObserver(Observer observer) {
        this.quackable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        this.quackable.notifyObservers();
    }
}
