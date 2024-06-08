package task7_and_8;

import task7_and_8.task1.Buyer;

import java.lang.reflect.InvocationTargetException;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class MarketSimulator<T extends Buyer> {

    private static final int SIMULATION_DURATION_MILS = 2 * 60 * 1000;
    private static final int BUYERS_PER_SECOND_UPPER_BOUND = 3;
    private static final Random RANDOM = new Random();

    private final ExecutorService executor = Executors.newCachedThreadPool();
    private int buyerId = 1;

    private final Class<T> buyerClass;

    public MarketSimulator(Class<T> buyerClass) {
        this.buyerClass = buyerClass;
    }

    public void simulate() throws InterruptedException, NoSuchMethodException, InvocationTargetException,
            InstantiationException, IllegalAccessException {
        long endTime = System.currentTimeMillis() + SIMULATION_DURATION_MILS;
        while (System.currentTimeMillis() < endTime) {
            int buyersCount = RANDOM.nextInt(0, BUYERS_PER_SECOND_UPPER_BOUND);

            for (int i = 0; i < buyersCount; ++i) {
                executor.execute(buyerClass.getConstructor(int.class).newInstance(buyerId));
                ++buyerId;
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        executor.shutdown();
        executor.awaitTermination(5, TimeUnit.SECONDS);
    }
}
