package task2.task1;

public class Sedan extends Car {

    @Override
    public int getNumberOfDoors() {
        return 4;
    }

    @Override
    public int getTrunkCapacity() {
        return 5;
    }

    @Override
    public void start() {
        System.out.println("Sedan started");
    }

    @Override
    public void stop() {
        System.out.println("Sedan stopped");
    }

    @Override
    public String getFuelType() {
        return "diesel";
    }

    public String getLuxuryLevel() {
        return "high";
    }
}
