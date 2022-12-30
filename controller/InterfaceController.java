package controller;

public interface InterfaceController<E, I> {
    E save(E entity);

    E find(I id);
}
