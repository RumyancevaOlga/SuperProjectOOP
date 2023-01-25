package repository;

import db.StudentTable;
import dto.Student;

public class StudentRepository implements UserRepository<Student, Integer> {
    private StudentTable studentTable;

    public StudentRepository(StudentTable studentTable) {
        this.studentTable = studentTable;
    }

    public Student deleteStudent(Student student) {
        studentTable.deleteStudent(student);
        return null;
    }

    public Student deleteStudentByFio(String fio) {
        studentTable.deleteByFio(fio);
        return null;
    }

    public Student deleteStudentByGroupAndBirthday(int groupNumber, int birthday) {
        return null;
    }

    @Override
    public Student save(Student entity) {
        return studentTable.save(entity);
    }

    @Override
    public Student findById(Integer id) {
        return null;
    }

    @Override
    public Student findByFio(String fio) {
        return null;
    }

}
