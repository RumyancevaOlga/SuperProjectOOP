package terminal.show;

import terminal.executable.CommandExecutable;
import terminal.executable.DeleteStudentByFioExecutable;

public class ShowDeleteStudentByFio implements ShowCommand {
    private final CommandExecutable commandExecutable;

    public ShowDeleteStudentByFio(CommandExecutable commandExecutable) {
        this.commandExecutable = commandExecutable;
    }

    @Override
    public void show() {
        if (commandExecutable instanceof DeleteStudentByFioExecutable) {
            System.out.println("Delete students");
        }

    }

}
