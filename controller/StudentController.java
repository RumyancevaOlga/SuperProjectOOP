package controller;

import data.Student;
import service.StudentService;

public class StudentController implements InterfaceController<Student, Integer> {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @Override
    public Student save(Student student) {
        return studentService.saveStudent(student);
    }

    @Override
    public Student find(Integer id) {
        return studentService.findStudentById(id);
    }
}
