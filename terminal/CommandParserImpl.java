package terminal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CommandParserImpl implements CommandParser<String> {

    @Override
    public Command parseCommand(String inputCommand) {
        List<String> forParse = new ArrayList<String>(Arrays.asList(inputCommand.split(" ")));
        return new Command(forParse);
    }

}
