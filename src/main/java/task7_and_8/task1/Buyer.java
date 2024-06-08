package task7_and_8.task1;

import task7_and_8.IBuyer;

import java.util.Random;

public class Buyer extends Thread implements IBuyer {

    private static final int SLEEP_SIMULATE_OPERATION_LOWER_BOUND_MILLS = 500;
    private static final int SLEEP_SIMULATE_OPERATION_UPPER_BOUND_MILLS = 2000;
    protected static final Random RANDOM = new Random();

    protected final int id;

    public Buyer(int id) {
        this.id = id;
    }

    protected void sleepSimulateOperation() {
        try {
            Thread.sleep(RANDOM.nextInt(SLEEP_SIMULATE_OPERATION_LOWER_BOUND_MILLS, SLEEP_SIMULATE_OPERATION_UPPER_BOUND_MILLS));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void enterToMarket() {
        System.out.println("buyer " + id + " entered market");
    }

    @Override
    public void chooseGoods() {
        System.out.println("buyer " + id + " started choosing goods");
        sleepSimulateOperation();
        System.out.println("buyer " + id + " ended choosing goods");
    }

    @Override
    public void goOut() {
        System.out.println("buyer " + id + " left market");
    }

    @Override
    public void run() {
        enterToMarket();
        chooseGoods();
        goOut();
    }
}
