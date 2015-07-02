package behavioral.command;

/**
 * Обработка цепо
 */
public class Receiver {
    private final State state;

    public Receiver(State state) {
        this.state = state;
    }

    public void action(Command command) {
        System.out.println(command.getClass().getSimpleName());
        command.execute();
    }
}
