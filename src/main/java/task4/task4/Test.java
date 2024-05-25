package task4.task4;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Ivan", 1, 1, List.of(4, 4, 5)));
        students.add(new Student("Oleg", 2, 1, List.of(5, 5, 5)));
        students.add(new Student("Petr", 3, 2, List.of(3, 4, 3)));
        students.add(new Student("Nick", 4, 2, List.of(4, 4, 4)));
        students.add(new Student("Igor", 5, 3, List.of(2, 3, 2)));
        students.add(new Student("Alex", 6, 3, List.of(3, 3, 3)));
        System.out.println(students);

        students = filterStudentsNextCourse(students);
        System.out.println(students);

        printStudents(students, 2);
    }

    private static List<Student> filterStudentsNextCourse(List<Student> students) {
        List<Student> res = new ArrayList<>();
        for (Student student : students) {
            double averageMark = student.getMarks().stream()
                    .mapToInt(Integer::intValue)
                    .average()
                    .orElse(0);

            if (averageMark >= 3) {
                student.increaseCourse();
                res.add(student);
            }
        }

        return res;
    }

    private static void printStudents(List<Student> students, int course) {
        for (Student student : students) {
            if (student.getCourse() == course) {
                System.out.println(student);
            }
        }
    }
}
