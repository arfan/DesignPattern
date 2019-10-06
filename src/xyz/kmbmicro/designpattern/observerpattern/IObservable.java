package xyz.kmbmicro.designpattern.observerpattern;

public interface IObservable {
    void add(IObserver observer);

    void remove(IObserver observer);

    void notifyObserver();
}
