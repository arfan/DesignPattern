package xyz.kmbmicro.designpattern.decoratorpattern;

public abstract class AddonDecorator extends Beverage {
    public AddonDecorator(Beverage beverage) {
        this.beverage = beverage;
    }
    Beverage beverage;
}
