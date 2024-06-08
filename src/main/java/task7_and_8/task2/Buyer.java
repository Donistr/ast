package task7_and_8.task2;

public class Buyer extends task7_and_8.task1.Buyer implements IUseBasket {

    private static final int GOODS_COUNT_LOWER_BOUND = 1;
    private static final int GOODS_COUNT_UPPER_BOUND = 5;

    private final Basket basket = new Basket();

    public Buyer(int id) {
        super(id);
    }

    protected void fillBasket() {
        int count = RANDOM.nextInt(GOODS_COUNT_LOWER_BOUND, GOODS_COUNT_UPPER_BOUND);
        while (basket.getSize() < count) {
            basket.put(Good.getRandomAvailableGood());
        }
    }

    @Override
    public void takeBasket() {
        System.out.println("buyer " + id + " started taking basket");
        sleepSimulateOperation();
        System.out.println("buyer " + id + " ended taking basket");
    }

    @Override
    public void putGoodsToBasket() {
        System.out.println("buyer " + id + " started putting goods to basket");
        fillBasket();
        sleepSimulateOperation();
        System.out.println("buyer " + id + " ended putting goods to basket");
        System.out.println("buyer " + id + " basket: " + basket);
    }

    @Override
    public void run() {
        enterToMarket();
        takeBasket();
        chooseGoods();
        putGoodsToBasket();
        goOut();
    }
}
