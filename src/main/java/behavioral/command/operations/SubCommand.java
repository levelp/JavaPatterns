package behavioral.command.operations;

import behavioral.command.Command;
import behavioral.command.State;

/**
 * Вычесть число
 */
public class SubCommand extends Command {
    /**
     * Какое значение прибавить
     */
    public double value;

    public SubCommand(State state, double value) {
        super(state);
        this.value = value;
    }

    @Override
    public void execute() {
        state.addValue(state.curValue() - value);
    }
}
