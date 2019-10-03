package xyz.kmbmicro.designpattern.abstractfactorypattern;

public class Coconut implements Plant {
    @Override
    public void getNutrition() {
        System.out.println("coconut get water and sun light");
    }
}
