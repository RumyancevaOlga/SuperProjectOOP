package terminal;

import java.util.Scanner;

import terminal.executable.CommandExecutable;
import terminal.executable.CommandExecutableFactory;

public class TerminalReader {
    private static TerminalReader terminalReader;
    private CommandParser commandParser;

    public static TerminalReader getInstance(CommandParser commandParser) {
        if (terminalReader == null)
            terminalReader = new TerminalReader(commandParser);
        return terminalReader;
    }

    private TerminalReader(CommandParser commandParser) {
        this.commandParser = commandParser;
    }

    public void getInfo() {
        Scanner in = new Scanner(System.in);
        while (true) {
            String command = in.nextLine();
            String[] parseCommand = commandParser.parseCommand(command);
            CommandExecutableFactory commandExecutableFactory = new CommandExecutableFactory();
            CommandExecutable commandExecutable = commandExecutableFactory.command(parseCommand);
            commandExecutable.execute();
        }
    }
}
