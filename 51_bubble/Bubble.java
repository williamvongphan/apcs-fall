import java.util.Arrays;

public class Bubble {
    public static int[] bubbleSort(int[] array) {
        if (array.length == 1) {
            return array;
        }
        else {
            while (!isSorted(array)) {
                for (int i = 0; i < array.length - 1; i++) {
                    if (array[i] > array[i + 1]) {
                        int temp = array[i];
                        array[i] = array[i + 1];
                        array[i + 1] = temp;
                    }
                }
            }
            return array;
        }
    }

    public static boolean isSorted(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] array = {1, 3, 2, 5, 4};
        System.out.println(Arrays.toString(bubbleSort(array)));
        int[] array2 = {7, 1, 5, 12, 3};
        System.out.println(Arrays.toString(bubbleSort(array2)));
    }
}