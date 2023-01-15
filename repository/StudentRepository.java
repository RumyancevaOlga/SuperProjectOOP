package repository;

import dto.Student;

public class StudentRepository implements UserRepository<Student, Integer> {

    public Student deleteStudent(Student student) {
        return null;
    }

    public Student deleteStudentByFio(String fio) {
        return null;
    }

    public Student deleteStudentByGroupAndBirthday(int groupNumber, int birthday) {
        return null;
    }

    @Override
    public Student save(Student entity) {
        return null;
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
