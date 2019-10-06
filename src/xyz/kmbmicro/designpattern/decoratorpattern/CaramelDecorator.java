package xyz.kmbmicro.designpattern.decoratorpattern;

public class CaramelDecorator extends AddonDecorator {
    public CaramelDecorator(Beverage beverage) {
        super(beverage);
    }

    @Override
    String getDescription() {
        return beverage.getDescription() + " with Caramel";
    }

    @Override
    int cost() {
        return beverage.cost() + 2;
    }
}
