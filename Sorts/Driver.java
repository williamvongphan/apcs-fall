import java.util.ArrayList;

public class Driver {
    public static ArrayList<Comparable> arrayMaker (int size) {
        ArrayList<Comparable> test = new ArrayList<Comparable>();
        for (int i = 0; i < size; i++) {
            test.add((int)(Math.random()*100));
        }
        return test;
    }

    public static ArrayList<Comparable> ascendingArrayMaker (int size) {
        ArrayList<Comparable> test = new ArrayList<Comparable>();
        for (int i = 0; i < size; i++) {
            test.add(i);
        }
        return test;
    }

    public static ArrayList<Comparable> descendingArrayMaker (int size) {
        ArrayList<Comparable> test = new ArrayList<Comparable>();
        for (int i = 0; i < size; i++) {
            test.add(size - i);
        }
        return test;
    }

    public static void main(String[] args) {
        // test each kind of sort function on an arraylist of test numbers
        ArrayList<Comparable> test = new ArrayList<Comparable>();
        System.out.println("DATA FOR BUBBLESORT");
        String outTableBubbleSortSwaps = "Size\tBest\tAverage\tWorst\n";
        for (int x = 0; x < 10; x++) {
            int[] swapBenchBest = Sorts.bubbleSortBenchmark(ascendingArrayMaker(x * 100));
            int[] swapBenchAverage = Sorts.bubbleSortBenchmark(arrayMaker(x * 100));
            int[] swapBenchWorst = Sorts.bubbleSortBenchmark(descendingArrayMaker(x * 100));
            outTableBubbleSortSwaps += x * 100 + "\t" + swapBenchBest[2] + "\t" + swapBenchAverage[2] + "\t" + swapBenchWorst[2] + "\n";
        }
        System.out.println(outTableBubbleSortSwaps);

        System.out.println("DATA FOR INSERTIONSORT");
        String outTableInsertionSortSwaps = "Size\tBest\tAverage\tWorst\n";
        for (int x = 0; x < 10; x++) {
            int[] swapBench2Best = Sorts.insertionSortBenchmark(ascendingArrayMaker(x * 100));
            int[] swapBench2Average = Sorts.insertionSortBenchmark(arrayMaker(x * 100));
            int[] swapBench2Worst = Sorts.insertionSortBenchmark(descendingArrayMaker(x * 100));
            outTableInsertionSortSwaps += x * 100 + "\t" + swapBench2Best[2] + "\t" + swapBench2Average[2] + "\t" + swapBench2Worst[2] + "\n";
        }

        System.out.println(outTableInsertionSortSwaps);

        System.out.println("DATA FOR SELECTIONSORT");
        String outTableSelectionSortSwaps = "Size\tBest\tAverage\tWorst\n";
        for (int x = 0; x < 10; x++) {
            int[] swapBench3Best = Sorts.selectionSortBenchmark(ascendingArrayMaker(x * 100));
            int[] swapBench3Average = Sorts.selectionSortBenchmark(arrayMaker(x * 100));
            int[] swapBench3Worst = Sorts.selectionSortBenchmark(descendingArrayMaker(x * 100));
            outTableSelectionSortSwaps += x * 100 + "\t" + swapBench3Best[2] + "\t" + swapBench3Average[2] + "\t" + swapBench3Worst[2] + "\n";
        }

        System.out.println(outTableSelectionSortSwaps);
    }
}