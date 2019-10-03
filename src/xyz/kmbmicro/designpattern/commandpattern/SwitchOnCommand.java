package xyz.kmbmicro.designpattern.commandpattern;

/**
 * The Command for turning on the light - ConcreteCommand #1
 */
class SwitchOnCommand implements Command {
    private final Light light;

    public SwitchOnCommand(Light light) {
        this.light = light;
    }

    @Override // Command
    public void execute() {
        light.turnOn();
    }
}
