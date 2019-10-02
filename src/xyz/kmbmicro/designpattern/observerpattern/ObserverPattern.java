package xyz.kmbmicro.designpattern.observerpattern;

public class ObserverPattern {
    public static void main(String args[]) {
        WeatherStation station = new WeatherStation();
        PhoneDisplay display = new PhoneDisplay(station);

        station.add(display);
        station.notifyObserver();
    }
}
