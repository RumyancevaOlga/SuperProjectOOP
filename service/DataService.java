package service;

import dto.User;

public interface DataService<E extends User> {
    E read();

    E create(E user);

    E saveUser(E user);

    E findUserById(int id);
}
