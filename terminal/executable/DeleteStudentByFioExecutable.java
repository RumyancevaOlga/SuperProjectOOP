package terminal.executable;

import dto.Student;
import service.StudentService;

public class DeleteStudentByFioExecutable implements CommandExecutable {
    private StudentService studentService;
    private String fio;

    public DeleteStudentByFioExecutable(StudentService studentService, String fio) {
        this.fio = fio;
        this.studentService = studentService;
    }

    @Override
    public void execute() {
        studentService.deleteStudentByFio(fio);
        System.out.println("Delete student: " + fio);
    }
}
