package terminal.executable;

import service.StudentService;
import dto.Student;

public class CommandExecutableFactory {
    private StudentService studentService;

    public CommandExecutable command(String[] input) {
        if (input[0].equals("/add")) {
            return new CreateStudentExecutable(studentService, new Student(input[1]));
        } else if (input[0].equals("/delete")) {
            return new DeleteStudentExecutable(studentService, new Student(input[1]));
        } else if (input[0].equals("/deleteByFio")) {
            return new DeleteStudentByFioExecutable(studentService, new Student(input[1]));
        } else if (input[0].equals("/deleteByGroupAndBirthday")) {
            return new DeleteStudentByGroupAndBirthdayExecutable(studentService, new Student(input[1]));
        } else
            return null;
    }

}
