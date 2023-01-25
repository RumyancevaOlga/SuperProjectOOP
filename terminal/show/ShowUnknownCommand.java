package terminal.show;

import terminal.executable.CommandExecutable;
import terminal.executable.UnknownCommandExecutable;

public class ShowUnknownCommand implements ShowCommand {
    private final CommandExecutable commandExecutable;

    public ShowUnknownCommand(CommandExecutable commandExecutable) {
        this.commandExecutable = commandExecutable;
    }

    @Override
    public void show() {
        if (commandExecutable instanceof UnknownCommandExecutable) {
            System.out.println("Unknown command");
        }
    }
}
