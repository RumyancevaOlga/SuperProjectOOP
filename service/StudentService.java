package service;

import data.User;
import util.ReaderFromTxt;
import util.WriterFromTxt;

public class StudentService implements DataService {

    @Override
    public User read() {
        return ReaderFromTxt.read();
    }

    @Override
    public void create(User user) {
        WriterFromTxt.write(user);
    }
    
}
