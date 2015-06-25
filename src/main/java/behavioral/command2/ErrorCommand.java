package behavioral.command2;

public class ErrorCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Wrong command2!");
    }
}
