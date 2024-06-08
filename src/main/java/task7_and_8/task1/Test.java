package task7_and_8.task1;

import task7_and_8.MarketSimulator;

import java.lang.reflect.InvocationTargetException;

public class Test {

    public static void main(String[] args) throws InterruptedException, InvocationTargetException,
            NoSuchMethodException, InstantiationException, IllegalAccessException {
        MarketSimulator<Buyer> marketSimulator = new MarketSimulator<>(Buyer.class);
        marketSimulator.simulate();
    }
}
