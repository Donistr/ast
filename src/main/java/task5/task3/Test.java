package task5.task3;

import java.util.HashSet;
import java.util.Set;

public class Test {

    public static void main(String[] args) {
        Set<Person> persons = new HashSet<>();
        persons.add(new Person("John", 30));
        persons.add(new Person("Jane", 31));
        persons.add(new Person("Jorge", 32));
        System.out.println(persons);

        persons.remove(new Person("Jane", 31));
        persons.remove(new Person("Jorge", 32));
        System.out.println(persons);
    }
}
