public class Processor {
    private int cores = 4;
    private String brand = "Intel";
    private int threads = 17;

    String terminate() {
        return "Process terminated";
    }

    String allocateInMemory() {
        return "Allocated in memory";
    }

    int sum(int a, int b) {
        return a + b;
    }
}
