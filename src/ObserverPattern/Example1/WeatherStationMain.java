package ObserverPattern.Example1;

public class WeatherStationMain {
    public static void main(String[] args){
        WeatherData weatherDataSubject = new WeatherData();

        CurrentConditionDisplay current = new CurrentConditionDisplay(weatherDataSubject);
        StatisticsDisplay stats = new StatisticsDisplay(weatherDataSubject);
        ForecastDisplay forecast = new ForecastDisplay(weatherDataSubject);
        HeatIndexDisplay heat = new HeatIndexDisplay(weatherDataSubject);

        // mock event fire
        weatherDataSubject.setMeasurements(80, 65, 30.4f);
        weatherDataSubject.setMeasurements(82, 70, 29.2f);
        weatherDataSubject.setMeasurements(78, 90, 29.2f);

        System.out.println();
        System.out.println("Removing observer!");
        System.out.println();
        weatherDataSubject.removeObserver(forecast);
        weatherDataSubject.setMeasurements(78, 90, 29.2f);
    }
}
