package xyz.kmbmicro.designpattern.factorymethodpattern;

public class FactoryMethodPattern {
    public static void main(String[] args) {
        RandomAnimalFactory factory = new RandomAnimalFactory();

        Animal hewan = factory.getAnimal();
        hewan.makeSound();
    }
}
