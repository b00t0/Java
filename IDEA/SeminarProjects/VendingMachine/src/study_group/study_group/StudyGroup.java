package study_group.study_group;

import study_group.student.Student;
import study_group.student.StudentComparatorByAge;

import java.util.*;

public class StudyGroup implements Iterable<Student>{
    private List<Student> students;

    public StudyGroup() {
        students = new ArrayList<>();
    }

    public void addStudent(Student student){
        students.add(student);
    }

    public void sortByName(){
        Collections.sort(students);
    }

    public void sortByAge(){
        students.sort(new StudentComparatorByAge());
    }

    @Override
    public Iterator<Student> iterator() {
        return new StudentIterator(students);
    }
}
