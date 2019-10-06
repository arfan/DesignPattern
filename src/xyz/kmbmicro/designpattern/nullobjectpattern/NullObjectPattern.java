package xyz.kmbmicro.designpattern.nullobjectpattern;

public class NullObjectPattern {
    public static void main(String args[]) {
        Animal a = new Dog();
        a.makeSound();

        Animal b = new NullAnimal();
        b.makeSound();
    }
}
