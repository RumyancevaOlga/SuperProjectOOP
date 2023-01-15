package repository;

import dto.User;

public interface UserRepository<E extends User, I> extends Repository<E, I> {
    public abstract E findByFio(String fio);
}
