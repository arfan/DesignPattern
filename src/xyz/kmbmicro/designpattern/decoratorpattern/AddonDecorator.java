package xyz.kmbmicro.designpattern.decoratorpattern;

public abstract class AddonDecorator extends Beverage {
    Beverage beverage;

    public AddonDecorator(Beverage beverage) {
        this.beverage = beverage;
    }
}
