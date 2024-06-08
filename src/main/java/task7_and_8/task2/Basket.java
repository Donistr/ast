package task7_and_8.task2;

import java.util.HashSet;
import java.util.Set;

public class Basket {

    private final Set<Good> goods = new HashSet<>();

    public void put(Good good) {
        goods.add(good);
    }

    public int getSize() {
        return goods.size();
    }

    @Override
    public String toString() {
        return "Basket{" +
                "goods=" + goods +
                '}';
    }
}
