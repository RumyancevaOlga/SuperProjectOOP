package terminal;

import java.util.List;

public class Command {

    private static final String ADD = "/add";
    private static final String DELETE = "/delete";
    private static final String DELETEBYFIO = "/deleteByFio";
    private static final String DELETEBYGROUPANDBIRTHDAY = "/deleteByFioAndBirthday";
    private List<String> arguments;
    private String mainFirstCommand;

    public Command(List<String> arguments) {
        this.arguments = arguments;
        this.mainFirstCommand = arguments.get(0);
    }

    public String getFirstArgument() {
        return arguments.get(1);
    }

    public boolean isCreateCommand() {
        return mainFirstCommand.equals(ADD);
    }

    public boolean isDeleteCommand() {
        return mainFirstCommand.equals(DELETE);
    }

    public boolean isDeleteByFioCommand() {
        return mainFirstCommand.equals(DELETEBYFIO);
    }

    public boolean isDeleteByGroupAndBirthdayCommand() {
        return mainFirstCommand.equals(DELETEBYGROUPANDBIRTHDAY);
    }
}
