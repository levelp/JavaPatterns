package behavioral.command;

/**
 * Команда
 */
public abstract class Command {
    protected final State state;

    public Command(State state) {
        this.state = state;
    }

    /**
     * Выполнить команду
     */
    public abstract void execute();
}
