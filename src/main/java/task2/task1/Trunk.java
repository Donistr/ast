package task2.task1;

public class Trunk extends Car {

    @Override
    public int getNumberOfDoors() {
        return 6;
    }

    @Override
    public int getTrunkCapacity() {
        return 100;
    }

    @Override
    public void start() {
        System.out.println("Trunk started");
    }

    @Override
    public void stop() {
        System.out.println("Trunk stopped");
    }

    @Override
    public String getFuelType() {
        return "gasoline";
    }

    public int getMaxLoadCapacity() {
        return 10000;
    }
}
