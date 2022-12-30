package iterators;

import java.util.Iterator;
import java.util.List;

import data.StudentGroup;

public class GroupStreamIterator implements Iterator<StudentGroup> {
    private List<StudentGroup> listStudentGroup;
    private int cursor;

    public GroupStreamIterator(List<StudentGroup> listStudentGroup) {
        this.listStudentGroup = listStudentGroup;
    }

    @Override
    public boolean hasNext() {
        return cursor < listStudentGroup.size();
    }

    @Override
    public StudentGroup next() {
        return listStudentGroup.get(cursor++);

    }

}
