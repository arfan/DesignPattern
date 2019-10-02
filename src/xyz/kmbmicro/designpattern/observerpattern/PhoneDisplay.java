package xyz.kmbmicro.designpattern.observerpattern;

public class PhoneDisplay implements IObserver {
    private final WeatherStation weatherStation;

    public PhoneDisplay(WeatherStation weatherStation) {
        this.weatherStation = weatherStation;
    }

    @Override
    public void update() {
        System.out.println("updated "+weatherStation.getTemperature());
    }
}
