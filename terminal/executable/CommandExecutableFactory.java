package terminal.executable;

import terminal.Command;

public interface CommandExecutableFactory {
    CommandExecutable command(Command command);
}
