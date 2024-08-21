package study_group.study_group;

import study_group.student.Student;

import java.util.Iterator;
import java.util.List;

public class StudentIterator<T> implements Iterator<T> {
    private int currentId;
    private List<T> students;

    public StudentIterator(List<T> students) {
        this.students = students;
    }

    @Override
    public boolean hasNext() {
        return students.size() > currentId;
    }

    @Override
    public T next() {
        return students.get(currentId++);
    }
}
