package task5.task1;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(10);
        list.add(3);
        list.add(6);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(4);
        list.add(8);
        list.add(1);
        list.add(5);
        list.add(7);
        list.add(9);

        Integer result = list.stream()
                .distinct()
                .filter(x -> x % 2 == 0)
                .reduce(Integer::sum).orElse(0);
        System.out.println(result);
    }
}
