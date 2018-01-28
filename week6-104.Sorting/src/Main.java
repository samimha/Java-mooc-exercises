
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] values = {8, 3, 7, 9, 1, 2, 4};
        sort(values);
    }

    public static int smallest(int[] array) {
        int smallest = array[0];
        for (int number : array) {
            if (number < smallest) {
                smallest = number;
            }
        }
        return smallest;
    }

    public static int indexOfTheSmallest(int[] array) {
        int smallest = smallest(array);
        int i = 0;
        for (int number : array) {
            if (number == smallest) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static int indexOfTheSmallestStartingFrom(int[] array, int index) {
        int smallest = array[index];
        for (int j = index; j < array.length; j++) {
            if (array[j] < smallest) {
                smallest = array[j];
            }
        }

        for (int i = index; i < array.length; i++) {
            if (array[i] == smallest) {
                return i;
            }
        }
        return -1;
    }

    public static void swap(int[] array, int index1, int index2) {
        // code goes here

        int i1 = array[index1];
        int i2 = array[index2];

        array[index1] = i2;
        array[index2] = i1;
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            swap(array, indexOfTheSmallestStartingFrom(array, i), i);
            System.out.println(Arrays.toString(array));
        }
    }
}
