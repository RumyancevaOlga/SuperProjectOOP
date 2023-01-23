package terminal.executable;

import service.StudentService;
import terminal.Command;

public class LogingCommandExecutableFactory extends CommandExecutableFactoryImpl {

    public LogingCommandExecutableFactory(StudentService studentService) {
        super(studentService);
    }

    @Override
    public CommandExecutable command(Command input) {
        System.out.println(input);
        CommandExecutable commandExecutable = super.command(input);
        System.out.println("Something");
        return commandExecutable;
    }
}
