package xyz.kmbmicro.designpattern.abstractfactorypattern;

public class Cat implements Animal {
    @Override
    public void makeSound() {
        System.out.println("meong");
    }

    @Override
    public void getNutrition() {
        System.out.println("eat");
    }
}
