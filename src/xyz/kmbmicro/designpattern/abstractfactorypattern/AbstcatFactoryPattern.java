package xyz.kmbmicro.designpattern.abstractfactorypattern;

public class AbstcatFactoryPattern {
    public static void main(String[] args) {
        RandomCreatureFactory factory = new RandomCreatureFactory();

        Animal hewan = factory.getAnimal();
        hewan.makeSound();

        Plant pohon = factory.getPlant();
        pohon.getNutrition();
    }
}
