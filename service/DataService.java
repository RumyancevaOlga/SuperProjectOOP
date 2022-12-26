package service;

import data.User;

public interface DataService {
    public User read();

    public void create(User user);
}
