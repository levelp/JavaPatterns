package behavioral.command;

import behavioral.command.operations.AddCommand;
import behavioral.command.operations.MulCommand;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Калькулятор с Undo, Redo
 */
public class CommandTest {

    public static final double EPS = 1e-10;

    /**
     * Простейший тест
     */
    @Test
    public void testSimple() {
        State state = new State();
        assertEquals(0.0, state.curValue(), EPS);
        assertEquals(1, state.values.size());
        Receiver receiver = new Receiver(state);
        AddCommand addCommand = new AddCommand(state, 10);
        receiver.action(addCommand);
        assertEquals(10.0, state.curValue(), EPS);
        assertEquals(2, state.values.size());
        receiver.action(new MulCommand(state, 3));
        assertEquals(10.0 * 3.0, state.curValue(), EPS);
        state.undo();
        assertEquals(10.0, state.curValue(), EPS);
        state.redo();
        assertEquals(10.0 * 3.0, state.curValue(), EPS);

        addCommand.execute();
        assertEquals(10.0 * 3.0 + 10.0, state.curValue(), EPS);
    }
}
