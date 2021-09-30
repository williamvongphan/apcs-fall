import java.util.Arrays;

class Maxidx {
    public static int index_of_max (int[] a) {
        int idx = 0;
        int size = a.length;
        int max = 0;
        for (int x = 0; x < size; x++) {
            if (a[x] > max) {
                idx = x;
            }
        }
        return idx - 1 // to account for offset;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 5, 2, 6, 7, 10, 8, 0};
        // I'm never gonna use java again after the above...
        System.out.println("Max index of arr is " + index_of_max(arr) + ".");
    }
}