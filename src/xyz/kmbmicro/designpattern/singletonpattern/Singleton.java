package xyz.kmbmicro.designpattern.singletonpattern;

public class Singleton {
    static Singleton instance;

    private Singleton() {}

    @Override
    public String toString(){
        return "singleton";
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }

        return instance;
    }
}
