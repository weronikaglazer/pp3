public class Counter {
    int counter = 0;

    public void increase() {
        counter++;
    }

    public void increase(int n) {
        counter += n;
    }

    public void decrease() {
        counter--;
    }

    public void decrease(int n) {
        counter -= n;
    }

    public int value() {
        return counter;
    }

    public static void main(String[] args) {
        Counter c = new Counter();

        c.increase();
        c.decrease();
        c.increase(20);
        c.decrease(12);
        c.value();
    }
}
