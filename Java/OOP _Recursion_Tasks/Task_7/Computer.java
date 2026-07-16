package Task_7;

public class Computer {
    public static class Processor {
        private String model;
        private int cores;

        public Processor() {
        }

        public String getModel() {
            return model;
        }

        public int getCores() {
            return cores;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public void setCores(int cores) {
            this.cores = cores;
        }

        public void printInfo() {
            System.out.println("Processor Model: " + model);
            System.out.println("Processor Cores:" + cores);
        }
    }

    public Computer() {
    }
}
