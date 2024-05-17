package task2.task3;

public class Computer {

    public static class Processor {
        private final String model;

        public Processor(String model) {
            this.model = model;
        }

        public String getDetails() {
            return model;
        }
    }

    public class RAM {
        private final int size;

        public RAM(int size) {
            this.size = size;
        }

        public int getDetails() {
            return size;
        }
    }
}
