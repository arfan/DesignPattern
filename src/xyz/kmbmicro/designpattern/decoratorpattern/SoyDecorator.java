package xyz.kmbmicro.designpattern.decoratorpattern;

public class SoyDecorator extends AddonDecorator {
    public SoyDecorator(Beverage beverage) {
        super(beverage);
    }

    @Override
    String getDescription() {
        return beverage.getDescription() + " with Soy";
    }

    @Override
    int cost() {
        return beverage.cost() + 3;
    }
}
