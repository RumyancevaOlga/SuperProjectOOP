package terminal;

import java.util.Scanner;

import terminal.executable.CommandExecutable;
import terminal.executable.CommandExecutableFactory;
import terminal.executable.CommandExecutableFactoryImpl;
import terminal.executable.LogingCommandExecutableFactory;

public class TerminalReader {
    private static TerminalReader terminalReader;
    private final CommandParser commandParser;
    private final CommandExecutableFactory commandExecutableFactory;

    public static TerminalReader getInstance(CommandParser commandParser,
            CommandExecutableFactory commandExecutableFactory) {
        if (terminalReader == null)
            terminalReader = new TerminalReader(commandParser, commandExecutableFactory);
        return terminalReader;
    }

    private TerminalReader(CommandParser commandParser, CommandExecutableFactory commandExecutableFactory) {
        this.commandParser = commandParser;
        this.commandExecutableFactory = commandExecutableFactory;
    }

    public void runReader() {
        Scanner in = new Scanner(System.in);
        while (true) {
            String command = in.nextLine();
            Command parseCommand = commandParser.parseCommand(command);
            // CommandExecutableFactoryImpl commandExecutableFactory = new
            // LogingCommandExecutableFactory(null);
            // CommandExecutable commandExecutable =
            // commandExecutableFactory.command(parseCommand);
            commandExecutableFactory.command(parseCommand);
        }
    }
}
