package creational.builder;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Тестируем Builder
 */
public class ComputerBuilderTest {

    @Test
    public void test1() {
        Director director = new Director();
        director.setComputerBuilder(new CheapComputerBuilder());
        director.constructComputer();

        Computer computer = director.getComputer();
        assertEquals("CRT", computer.getDisplay());
        assertEquals("Everest", computer.getSystemBlock());
        assertEquals("mouse+keyboard", computer.getManipulators());
    }
}
