import java.util.Arrays;

class Powerarray {
    public static double[] power (double[] a) {
        for (int i = 0; i < a.length; i++) {
            a[i] = Math.pow(a[i], 2.0);
            // THAT'S MESSED UP! WHY NOT a[i] **= 2; ??
        }
        return a;
    }

    public static void main(String[] args) {
        double[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        // I'm never gonna use java again after the above...
        System.out.println("The first ten numbers, squared, are " + Arrays.toString(power(arr)) + ".");
    }
}