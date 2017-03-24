package behavioral.command2;

import java.util.List;

/**
 * Напечатать список чисел
 */
public class PrintCommand implements Command {

    private List<Integer> list;

    public PrintCommand(List<Integer> list) {
        this.list = list;
    }

    @Override
    public void execute() {
        System.out.println(list);
    }
}
