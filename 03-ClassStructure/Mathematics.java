public class Mathematics {

    static int largerOfTwoNumbers(int a, int b) {
        return Math.max(a, b);
    }

    static double piNumber() {
        return Math.PI;
    }

    static float absoluteValue(float value) {
        return Math.abs(value);
    }

    static double squareRoot(double value) {
        return Math.sqrt(value);
    }

    static double randomNumber() {
        return Math.random();
    }

    static int randomNumberInRange(int number) {
        return (int) (Math.random() * number);
    }

    static double sinOfDegrees(double degrees) {
        return Math.sin(degrees);
    }
    public static void main(String[] args) {
        System.out.println(largerOfTwoNumbers(34, 39));
        System.out.println(piNumber());
        System.out.println(absoluteValue(-17));
        System.out.println(squareRoot(9.0/2.0));
        System.out.println(randomNumber());
        System.out.println(randomNumberInRange(11));
        System.out.println(sinOfDegrees(90));
    }
}