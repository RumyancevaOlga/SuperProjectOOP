package terminal.executable;

import dto.Student;
import service.StudentService;

public class CreateStudentExecutable implements CommandExecutable {
    private StudentService studentService;
    private Student student;

    public CreateStudentExecutable(StudentService studentService, Student student) {
        this.student = student;
        this.studentService = studentService;
    }

    @Override
    public void execute() {
        studentService.saveUser(student);
        System.out.println("Add student: " + student.getFio());
    }
}
