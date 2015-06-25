package behavioral.command.operations;

import behavioral.command.Command;
import behavioral.command.State;

/**
 * Прибавить число
 */
public class AddCommand extends Command {
    /**
     * Какое значение прибавить
     */
    public double value;

    public AddCommand(State state, double value) {
        super(state);
        this.value = value;
    }

    @Override
    public void execute() {
        state.addValue(state.curValue() + value);
    }
}
