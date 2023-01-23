package terminal.executable;

public class UnknownCommandExecutable implements CommandExecutable {

    @Override
    public void execute() {
        System.out.println("Unknown command");
    }

}
