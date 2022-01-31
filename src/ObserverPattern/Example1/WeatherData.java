package ObserverPattern.Example1;

import java.util.ArrayList;

public class WeatherData implements Subject {
    private float temperature;
    private float humidity;
    private float pressure;

    private ArrayList<Observer> observers;
    public WeatherData(){
        observers = new ArrayList<Observer>();
    }

    @Override
    public void registerObserver(Observer obs) {
        observers.add(obs);
    }

    @Override
    public void removeObserver(Observer obs) {
        int index = observers.indexOf(obs);
        if(index >= 0) {
            observers.remove(obs);
        }
    }

    @Override
    public void notifyObservers() {
        for(Observer obs: observers){
            obs.update(temperature, humidity, pressure);
        }
    }

    public void measurementsChanged(){
        notifyObservers();
    }

    // the method below is to mock an event where
    // the weather conditions are changed
    public void setMeasurements(float temp, float humidity, float pressure){
        this.temperature = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
