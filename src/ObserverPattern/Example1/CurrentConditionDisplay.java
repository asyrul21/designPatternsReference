package ObserverPattern.Example1;

public class CurrentConditionDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private Subject weatherDataObservable;

    public CurrentConditionDisplay(Subject observable){
        this.weatherDataObservable = observable;
        weatherDataObservable.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature + "F Degrees and " + humidity + "% humidity");
    }
}
