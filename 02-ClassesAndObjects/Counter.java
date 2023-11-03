public class Counter {
    int counter = 0;

    void plusOne() {
        counter++;
    }

    void minusOne() {
        counter--;
    }

    void plusTen() {
        counter += 10;
    }

    void minusTen() {
        counter -= 10;
    }

    void reset() {
        counter = 0;
    }

    void displayCounter() {
        System.out.println("Counter: " + counter);
    }

    public static void main(String[] args) {
        Counter a = new Counter();
        Counter b = new Counter();

        a.plusTen();
        a.plusTen();
        a.plusOne();
        a.plusOne();
        a.plusOne();

        for (int i = 1; i <= 4; i++) {
            b.minusTen();
        }

        for (int i = 1; i <= 7; i++) {
            b.minusOne();
        }

        a.displayCounter();
        b.displayCounter();

    }
}
