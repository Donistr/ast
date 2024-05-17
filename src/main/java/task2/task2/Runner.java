package task2.task2;

import java.util.List;

public class Runner {

    public static void main(String[] args) {
        MutablePerson person = new MutablePerson("John", 30, List.of("hiking", "reading"));
        System.out.println(person);
        person.setName("Jane");
        person.setAge(31);
        person.getHobbies().add("cooking");
        System.out.println(person);

        ImmutablePerson immutablePerson = new ImmutablePerson("John", 30, List.of("hiking", "reading"));
        System.out.println(immutablePerson);
        //immutablePerson.setName("Jane");
        //immutablePerson.setAge(31);
        immutablePerson.getHobbies().add("cooking");
    }
}
