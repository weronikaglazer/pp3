public class MyArrays {
    static int odd(int[] array) {
        int counter = 0;
        for (int number : array) {
            if (number > 0 && number % 2 == 0) {
                counter++;
            }
        }
        return counter;
    }

    static int above(int[] array) {
        int sum = 0;
        for (int number : array) {
            sum += number;
        }

        double mean = (double)sum / array.length;

        int counter = 0;
        for (int number : array) {
            if (number > mean) {
                counter++;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        int[] array1 = {3,2,-5,4,1,-7};
        int[] array2 = {5,2,7,4,2};

        System.out.println(MyArrays.odd(array1));
        System.out.println(MyArrays.above(array2));
    }
}
