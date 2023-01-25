import db.StudentTable;
import repository.StudentRepository;
import service.StudentService;
import terminal.CommandParserImpl;
import terminal.TerminalReader;
import terminal.executable.CommandExecutableFactoryImpl;

public abstract class Main {
    public static void main(String[] args) {
        TerminalReader
                .getInstance(new CommandParserImpl(),
                        new CommandExecutableFactoryImpl(new StudentService(new StudentRepository(new StudentTable()))))
                .runReader();
    }
}
