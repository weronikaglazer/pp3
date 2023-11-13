import java.util.Arrays;

public class MyArray {
    static int even(int[] array) {
        int counter = 0;

        for (int number : array) {
            if (number % 2 == 0) {
                counter++;
            }
        }
        return counter;
    }

    static int positiveOdd(int[] array) {
        int counter = 0;

        for (int number : array) {
            if (number % 2 != 0 && number > 0) {
                counter++;
            }
        }
        return counter;
    }

    static int[] reverse(int[] array) {
        int[] tempArray = new int[array.length];
        int index = 0;

        for (int i = array.length - 1; i>=0; i--) {
            tempArray[index] = array[i];
            index++;
        }

        return tempArray;
    }

    static boolean compare(int[] array1, int[] array2) {
        if (array1.length == array2.length) {
            for (int i = 0; i < array1.length; i++) {
                if (array1[i] == array2[i]) {
                    continue;
                } else {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }

    

    static boolean exist(int number, int[] array) {
        boolean exists = false;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                exists = true;
            }
        }
        return exists;
    }

    static int secondMax(int[] array) {
        Arrays.sort(array);
        return array[array.length - 2];
    }

    static int lastColumn(int[][] array) {
        int sum = 0;

        for (int[] row : array) {
            sum += row[array.length - 1];
        }

        return sum;
    }

    static int[][] swap(int[][] array) {

        for (int[] row : array) {
            int firstVal = row[0];
            int lastVal = row[array.length - 1];
            row[0] = lastVal;
            row[array.length - 1] = firstVal;
        }

        return array;
    }

    static int[] two2one(int[][] array) {
        int sum = 0;
        int index = 0;

        for (int[] row : array) {
            sum += row.length;
        }

        int[] newArray = new int[sum];

        for (int[] row : array) {
            for (int number : row) {
                newArray[index] = number;
                index++;
            }
        }

        return newArray;
    }
}
