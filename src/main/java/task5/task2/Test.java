package task5.task2;

import java.util.LinkedList;

public class Test {

    public static void main(String[] args) {
        LinkedList<String> countries = new LinkedList<>();
        countries.addFirst("Russia");
        countries.addFirst("Ukraine");
        countries.addLast("Belarus");
        countries.addLast("Poland");
        System.out.println(countries);

        countries.removeFirst();
        countries.removeLast();
        System.out.println(countries);

        System.out.println(countries.getFirst());
        System.out.println(countries.getLast());
    }
}
