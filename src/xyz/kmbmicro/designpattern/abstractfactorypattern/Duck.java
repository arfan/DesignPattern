package xyz.kmbmicro.designpattern.abstractfactorypattern;

public class Duck implements Animal {
    @Override
    public void makeSound() {
        System.out.println("kwek-kwek");
    }

    @Override
    public void getNutrition() {
        System.out.println("eat");
    }
}
