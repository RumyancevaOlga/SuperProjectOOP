package service;

import data.User;

public interface DataService<E extends User> {
    public User read();

    public User create(User user);
}
