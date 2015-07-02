package behavioral.command.operations;

import behavioral.command.Command;
import behavioral.command.State;

/**
 * Разделить число
 */
public class DivCommand extends Command {
    /**
     * Какое значение прибавить
     */
    public double value;

    public DivCommand(State state, double value) {
        super(state);
        this.value = value;
    }

    @Override
    public void execute() {
        state.addValue(state.curValue() / value);
    }
}
