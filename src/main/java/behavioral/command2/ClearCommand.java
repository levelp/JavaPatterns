package behavioral.command2;

import java.util.List;

/**
 * Очистка списка
 */
public class ClearCommand implements Command {
    private List<Integer> data;

    public ClearCommand(List<Integer> data) {
        this.data = data;
    }

    @Override
    public void execute() {
        data.clear();
    }
}
