package terminal;

public interface CommandParser<E> {
    Command parseCommand(E inputCommand);
}
