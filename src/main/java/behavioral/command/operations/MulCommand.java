package behavioral.command.operations;

import behavioral.command.Command;
import behavioral.command.State;

/**
 * Умножить число
 */
public class MulCommand extends Command {
    /**
     * Какое значение прибавить
     */
    public double value;

    public MulCommand(State state, double value) {
        super(state);
        this.value = value;
    }

    @Override
    public void execute() {
        state.addValue(state.curValue() * value);
    }
}
