package task4.task4;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private final String name;
    private final int group;
    private int course;
    private final List<Integer> marks;

    public Student(String name, int group, int course, List<Integer> marks) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.marks = new ArrayList<>(marks);
    }

    public String getName() {
        return name;
    }

    public int getGroup() {
        return group;
    }

    public int getCourse() {
        return course;
    }

    public List<Integer> getMarks() {
        return marks;
    }

    public void increaseCourse() {
        ++course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", group=" + group +
                ", course=" + course +
                ", marks=" + marks +
                '}';
    }
}
