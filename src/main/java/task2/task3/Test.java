package task2.task3;

public class Test {

    public static void main(String[] args) {
        Computer.Processor processor = new Computer.Processor("Intel");
        System.out.println(processor.getDetails());

        Computer computer = new Computer();
        Computer.RAM ram = computer.new RAM(16);
        System.out.println(ram.getDetails());
    }
}
