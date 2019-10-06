package xyz.kmbmicro.designpattern.observerpattern;

import java.util.ArrayList;

public class WeatherStation implements IObservable {
    ArrayList<IObserver> observers = new ArrayList<>();
    private String temperature = "100";

    @Override
    public void add(IObserver observer) {
        observers.add(observer);
    }

    @Override
    public void remove(IObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (IObserver observer : observers) {
            observer.update();
        }
    }

    public String getTemperature() {
        return this.temperature;
    }
}
