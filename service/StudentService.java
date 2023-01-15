package service;

import dto.Student;
import dto.User;
import repository.StudentRepository;
import util.ReaderFromTxt;
import util.WriterFromTxt;

public class StudentService implements DataService<Student> {

    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Student deleteStudent(Student student) {
        return studentRepository.deleteStudent(student);
    }

    public Student deleteStudentByFio(String fio) {
        return studentRepository.deleteStudentByFio(fio);
    }

    public Student deleteStudentByGroupAndBirthday(int groupNumber, int birthday) {
        return studentRepository.deleteStudentByGroupAndBirthday(groupNumber, birthday);
    }

    @Override
    public Student read() {
        return (Student) ReaderFromTxt.read();
    }

    @Override
    public Student create(Student student) {
        return (Student) WriterFromTxt.write(student);
    }

    @Override
    public Student findUserById(int id) {
        return studentRepository.findById(id);
    }

    @Override
    public Student saveUser(Student user) {
        return studentRepository.save(user);
    }

}
