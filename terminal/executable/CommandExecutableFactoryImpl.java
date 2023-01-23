package terminal.executable;

import service.StudentService;
import terminal.Command;
import dto.Student;

public class CommandExecutableFactoryImpl implements CommandExecutableFactory {
    private final StudentService studentService;

    public CommandExecutableFactoryImpl(StudentService studentService) {
        this.studentService = studentService;
    }

    @Override
    public CommandExecutable command(Command input) {
        if (input.isCreateCommand()) {
            return new CreateStudentExecutable(studentService, new Student(input.getFirstArgument()));
        } else if (input.isDeleteCommand()) {
            return new DeleteStudentExecutable(studentService, new Student(input.getFirstArgument()));
        } else if (input.isDeleteByFioCommand()) {
            return new DeleteStudentByFioExecutable(studentService, input.getFirstArgument());
        } else if (input.isDeleteByGroupAndBirthdayCommand()) {
            Integer.parseInt(input.getFirstArgument().split("")[0]);
            return new DeleteStudentByGroupAndBirthdayExecutable(studentService,
                    Integer.parseInt(input.getFirstArgument().split("")[0]),
                    Integer.parseInt(input.getFirstArgument().split("")[1]));
        } else
            return new UnknownCommandExecutable();
    }

}
