package behavioral.command2;

import java.util.List;
import java.util.Random;

/**
 * Сгенерировать следующее число
 */
public class NextCommand implements Command {
    private static Random random = new Random();
    private List<Integer> acceptor;

    public NextCommand(List<Integer> acceptor) {
        this.acceptor = acceptor;
    }

    @Override
    public void execute() {
        acceptor.add(random.nextInt());
    }
}
