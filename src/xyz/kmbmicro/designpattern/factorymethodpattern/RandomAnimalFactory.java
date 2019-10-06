package xyz.kmbmicro.designpattern.factorymethodpattern;

import java.util.Random;

public class RandomAnimalFactory implements IAnimalFactory {
    Random random;

    public RandomAnimalFactory() {
        this.random = new Random();
    }

    @Override
    public Animal getAnimal() {
        int rand = random.nextInt(3);

        switch (rand) {
            case 0:
                return new Dog();
            case 1:
                return new Cat();
            default:
                return new Duck();
        }
    }
}
