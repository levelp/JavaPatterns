package behavioral.command2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Генератор случайных чисел
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> list = new ArrayList<>();

        while (scanner.hasNextLine()) {
            Command command = readCommand(scanner, list);
            command.execute();
        }
    }

    private static Command readCommand(Scanner scanner, List<Integer> list) {
        String line = scanner.nextLine();
        if (line.equalsIgnoreCase("exit")) {
            return new ExitCommand();
        } else if (line.equalsIgnoreCase("next")) {
            return new NextCommand(list);
        } else if (line.equalsIgnoreCase("print")) {
            return new PrintCommand(list);
        } else if (line.equalsIgnoreCase("clear")) {
            return new ClearCommand(list);
        } else {
            new ErrorCommand();
        }

        return new ErrorCommand();
    }
}
