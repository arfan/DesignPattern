package xyz.kmbmicro.designpattern.bridgepattern;

// Logger has two implementations: info and warning
@FunctionalInterface
interface Logger {
    static Logger info() {
        return message -> System.out.println("info: " + message);
    }

    static Logger warning() {
        return message -> System.out.println("warning: " + message);
    }

    void log(String message);
}