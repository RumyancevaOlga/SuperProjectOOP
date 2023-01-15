package terminal.executable;

import dto.Student;
import service.StudentService;

public class DeleteStudentByFioExecutable implements CommandExecutable {
    private StudentService studentService;
    private Student student;

    public DeleteStudentByFioExecutable(StudentService studentService, Student student) {
        this.student = student;
        this.studentService = studentService;
    }

    @Override
    public void execute() {
        studentService.deleteStudentByFio(student.getFio());
        System.out.println("Delete student: " + student.getFio());
    }
}
