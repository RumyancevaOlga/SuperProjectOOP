package terminal.executable;

import dto.Student;
import service.StudentService;

public class DeleteStudentByGroupAndBirthdayExecutable implements CommandExecutable {
    private StudentService studentService;
    private Student student;

    public DeleteStudentByGroupAndBirthdayExecutable(StudentService studentService, Student student) {
        this.student = student;
        this.studentService = studentService;
    }

    @Override
    public void execute() {
        studentService.deleteStudentByGroupAndBirthday(student.getGroupNumber(), student.getBirthday());
        System.out.println("Delete student: " + student.getFio());
    }

}
