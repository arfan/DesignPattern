package xyz.kmbmicro.designpattern.singletonpattern;

public class SingletonPattern {
    public static void main(String[] args) {
        Singleton s = Singleton.getInstance();
        System.out.println(s.toString());
    }
}
