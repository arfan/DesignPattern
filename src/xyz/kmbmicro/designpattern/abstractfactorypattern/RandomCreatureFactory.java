package xyz.kmbmicro.designpattern.abstractfactorypattern;

import java.util.Random;

public class RandomCreatureFactory implements ICreatureFactory {
    Random random;

    public RandomCreatureFactory() {
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

    @Override
    public Plant getPlant() {
        int rand = random.nextInt(2);
        switch (rand) {
            case 0:
                return new Cactus();
            default:
                return new Coconut();
        }
    }
}
