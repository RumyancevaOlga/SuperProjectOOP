package terminal.executable;

import dto.Student;
import service.StudentService;

public class DeleteStudentExecutable implements CommandExecutable {
    private StudentService studentService;
    private Student student;

    public DeleteStudentExecutable(StudentService studentService, Student student) {
        this.student = student;
        this.studentService = studentService;
    }

    @Override
    public void execute() {
        studentService.deleteStudent(student);
    }

}
