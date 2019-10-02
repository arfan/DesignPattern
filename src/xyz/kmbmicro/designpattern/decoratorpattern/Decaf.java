package xyz.kmbmicro.designpattern.decoratorpattern;

public class Decaf extends Beverage {
    @Override
    String getDescription() {
        return "Decaf";
    }

    @Override
    int cost() {
        return 10;
    }
}
