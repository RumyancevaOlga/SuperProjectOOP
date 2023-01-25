package db;

import java.util.ArrayList;
import java.util.List;

public abstract class Table<E> {
    protected List<E> elements;

    protected Table() {
        elements = new ArrayList<>();
    }

    public E save(E entity) {
        elements.add(entity);
        for (E e : elements) {
            System.out.println(e);
        }
        return entity;
    }
}
