package task7_and_8.task2;

import java.util.*;

public class Good {

    private static final Random RANDOM = new Random();
    private static final int GOOD_PRICE_LOWER_BOUND = 1;
    private static final int GOOD_PRICE_UPPER_BOUND = 100;
    private static final List<String> AVAILABLE_GOODS_NAMES = List.of("milk", "eggs", "juice", "ice cream", "bubble gum");
    private static final Map<String, Integer> AVAILABLE_GOODS = new HashMap<>();
    static {
        AVAILABLE_GOODS_NAMES.forEach(name ->
                AVAILABLE_GOODS.put(name, RANDOM.nextInt(GOOD_PRICE_LOWER_BOUND, GOOD_PRICE_UPPER_BOUND)));
    }

    public static Good getRandomAvailableGood() {
        int index = RANDOM.nextInt(0, AVAILABLE_GOODS_NAMES.size());
        String name = AVAILABLE_GOODS_NAMES.get(index);
        return new Good(name, AVAILABLE_GOODS.get(name));
    }

    private final String name;
    private final int price;

    private Good(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Good good = (Good) o;
        return price == good.price && Objects.equals(name, good.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }

    @Override
    public String toString() {
        return "Good{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
