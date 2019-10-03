package xyz.kmbmicro.designpattern.abstractfactorypattern;

public class Dog implements Animal {
    @Override
    public void makeSound() {
        System.out.println("guk guk");
    }

    @Override
    public void getNutrition() {
        System.out.println("eat");
    }
}
