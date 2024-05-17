package task2.task1;

public class Test {

    public static void main(String[] args) {
        Sedan sedan = new Sedan();
        sedan.start();
        sedan.stop();
        System.out.println(sedan.getFuelType());
        System.out.println(sedan.getNumberOfDoors());
        System.out.println(sedan.getTrunkCapacity());
        System.out.println(sedan.getLuxuryLevel());

        Trunk trunk = new Trunk();
        trunk.start();
        trunk.stop();
        System.out.println(trunk.getFuelType());
        System.out.println(trunk.getNumberOfDoors());
        System.out.println(trunk.getTrunkCapacity());
        System.out.println(trunk.getMaxLoadCapacity());
    }
}
