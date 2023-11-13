public class Statistics {
    static int numberOfItems(int start, int end) {
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum++;
        }

        return sum;
    }

    static int sumOfNumbers(int start, int end) {
        int sum = 0;

        for (int i = start; i <= end; i++) {
            sum += i;
        }
        return sum;
    }

    static double arithmeticMean(int start, int end) {
        int numberOfItems = numberOfItems(start, end);
        int sum = sumOfNumbers(start, end);

        return sum / numberOfItems;
    }

    public static void main(String[] args) {
        System.out.println("Number of items: " + numberOfItems(5,10));
        System.out.println("Sum of numbers: " + sumOfNumbers(5,10));
        System.out.println("Arithmetic mean: " + arithmeticMean(5,10));
    }


}
