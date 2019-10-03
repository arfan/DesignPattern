package xyz.kmbmicro.designpattern.abstractfactorypattern;

public class Cactus implements Plant {
    @Override
    public void getNutrition() {
        System.out.println("cactus get water and sun light");
    }
}
