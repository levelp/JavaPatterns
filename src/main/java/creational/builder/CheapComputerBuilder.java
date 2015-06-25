package creational.builder;

/**
 * Реализация
 */
public class CheapComputerBuilder extends ComputerBuilder {
    public void buildSystemBlock() {
        computer.setSystemBlock("Everest");
    }

    public void buildDisplay() {
        computer.setDisplay("CRT");
    }

    public void buildManipulators() {
        computer.setManipulators("mouse+keyboard");
    }
}