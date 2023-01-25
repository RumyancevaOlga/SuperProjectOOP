package terminal.executable;

import dto.Student;
import service.StudentService;

public class DeleteStudentByGroupAndBirthdayExecutable implements CommandExecutable {
    private StudentService studentService;
    private int groupNumber;
    private int birthday;

    public DeleteStudentByGroupAndBirthdayExecutable(StudentService studentService, int groupNumber, int birthday) {
        this.groupNumber = groupNumber;
        this.birthday = birthday;
        this.studentService = studentService;
    }

    @Override
    public void execute() {
        studentService.deleteStudentByGroupAndBirthday(groupNumber, birthday);
    }

}
