package xyz.kmbmicro.designpattern.factorymethodpattern;

public class Duck implements Animal {
    @Override
    public void makeSound() {
        System.out.println("kwek-kwek");
    }
}
