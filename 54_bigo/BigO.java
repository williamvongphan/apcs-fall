import java.util.ArrayList;

public class BigO {
    public static String arrayToTSV (long[] array, int multiplier) {
        String result = "";
        for (int i = 0; i < array.length; i++) {
            result += multiplier * (i + 1) + "," + array[i] + "\n";
        }
        return result;
    }

    public static void main (String[] args) {
        int multiplier = 1000000;
        // test each method in ArrayList and print the runtime for increasing numbers of executions
        long before;
        long after;
        long[] times = new long[10];
        for (int i = 1; i <= 10; i++) {
            before = System.currentTimeMillis();
            ArrayList<Integer> list = new ArrayList<Integer>();
            for (int j = 0; j < multiplier * i; j++) {
                list.add(j);    // add 1 million elements
            }
            after = System.currentTimeMillis();
            times[i-1] = after - before;
        }
        System.out.println("Time for ArrayList.add:\n" + arrayToTSV(times, multiplier));
    }
}