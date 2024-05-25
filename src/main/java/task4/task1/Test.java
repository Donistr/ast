package task4.task1;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        List<String> countries = new ArrayList<>();
        countries.add("Poland");
        countries.add("Germany");
        countries.add("Japan");
        System.out.println(countries);

        countries.set(1, "France");
        System.out.println(countries);

        countries.remove(1);
        System.out.println(countries);

        countries.remove("Japan");
        System.out.println(countries);

        System.out.println(countries.indexOf("Poland"));

        System.out.println(countries.contains("Poland"));
    }
}
