package xyz.kmbmicro.designpattern.decoratorpattern;

public class Espresso extends Beverage {
    @Override
    String getDescription() {
        return "Espresso";
    }

    @Override
    int cost() {
        return 15;
    }
}
