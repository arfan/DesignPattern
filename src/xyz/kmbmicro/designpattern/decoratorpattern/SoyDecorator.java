package xyz.kmbmicro.designpattern.decoratorpattern;

public class SoyDecorator extends AddonDecorator {
    @Override
    String getDescription() {
        return beverage.getDescription()+" with Soy";
    }

    @Override
    int cost() {
        return beverage.cost() + 3;
    }
}
