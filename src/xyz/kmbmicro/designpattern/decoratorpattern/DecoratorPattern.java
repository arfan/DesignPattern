package xyz.kmbmicro.designpattern.decoratorpattern;

public class DecoratorPattern {
    public static void main(String[] args) {
        Decaf decaf = new Decaf();
        CaramelDecorator caramelDecorator = new CaramelDecorator(decaf);

        System.out.println(caramelDecorator.getDescription());
        System.out.println(caramelDecorator.cost());
    }
}
