package service;

import dto.Teacher;
import dto.User;
import repository.TeacherRepository;
import util.ReaderFromTxt;
import util.WriterFromTxt;

public class TeacherService implements DataService<Teacher> {

    private final TeacherRepository teacherRepository;

    public TeacherService(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }

    @Override
    public Teacher read() {
        return (Teacher) ReaderFromTxt.read();
    }

    @Override
    public Teacher create(Teacher user) {
        return (Teacher) WriterFromTxt.write(user);
    }

    @Override
    public Teacher saveUser(Teacher user) {
        return teacherRepository.save(user);
    }

    @Override
    public Teacher findUserById(int id) {
        return teacherRepository.findById(id);
    }

}
