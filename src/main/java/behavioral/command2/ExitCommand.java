package behavioral.command2;

/**
 * Выход из программы
 */
public class ExitCommand implements Command {
    @Override
    public void execute() {
        System.exit(0);
    }
}
