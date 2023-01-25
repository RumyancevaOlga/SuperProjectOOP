package terminal.show;

import terminal.Command;
import terminal.executable.CommandExecutable;
import terminal.executable.UnknownCommandExecutable;

public class ShowCommandFactory {
    public ShowCommand show(Command command, CommandExecutable commandExecutable) {
        if (command.isCreateCommand()) {
            return new ShowCreateStudent(commandExecutable);
        } else if (command.isDeleteByFioCommand()) {
            return new ShowDeleteStudentByFio(commandExecutable);
        }
        else return new ShowUnknownCommand(commandExecutable);
    }
}
