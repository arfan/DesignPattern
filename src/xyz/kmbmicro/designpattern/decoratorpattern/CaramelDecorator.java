package xyz.kmbmicro.designpattern.decoratorpattern;

public class CaramelDecorator extends AddonDecorator {
    @Override
    String getDescription() {
        return beverage.getDescription()+" with Caramel";
    }

    @Override
    int cost() {
        return beverage.cost() + 2;
    }
}
