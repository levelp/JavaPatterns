package creational.builder;

/**
 * Компьютер
 */
public class Computer {
    private String display = null;
    private String systemBlock = null;
    private String manipulators = null;

    public String getManipulators() {
        return manipulators;
    }

    public void setManipulators(String manipulators) {
        this.manipulators = manipulators;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    public String getSystemBlock() {
        return systemBlock;
    }

    public void setSystemBlock(String systemBlock) {
        this.systemBlock = systemBlock;
    }
}