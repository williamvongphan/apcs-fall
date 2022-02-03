import java.util.ArrayList;

public class Sorts {
    public static ArrayList<Comparable> insertionSort( ArrayList<Comparable> a )
    {
        int passes;
        int swaps;
        int compares;
        ArrayList<Comparable> sorted = new ArrayList<Comparable>();
        for( Comparable o : a )
            sorted.add( o );
        for( int i = 1; i < sorted.size(); i++ ) {
            for( int j = i; j > 0; j-- ) {
                if ( sorted.get( j ).compareTo( sorted.get( j-1 ) ) < 0 )
                    sorted.set( j, sorted.set( j-1, sorted.get( j ) ) );
                else
                    break;
            }
        }
        return sorted;
    }

    public static int[] insertionSortBenchmark( ArrayList<Comparable> a )
    {
        int passes = 0;
        int swaps = 0;
        int compares = 0;
        ArrayList<Comparable> sorted = new ArrayList<Comparable>();
        for( Comparable o : a )
            sorted.add( o );
        for( int i = 1; i < sorted.size(); i++ ) {
            passes += 1;
            for( int j = i; j > 0; j-- ) {
                compares += 1;
                if ( sorted.get( j ).compareTo( sorted.get( j-1 ) ) < 0 ) {
                    swaps += 1;
                    sorted.set( j, sorted.set( j-1, sorted.get( j ) ) );
                }
                else
                    break;
            }
        }
        int[] benchmarks = {passes, compares, swaps};
        return benchmarks;
    }

    public static ArrayList<Comparable> selectionSort(ArrayList<Comparable> a) {
        int minIndex;
        int passes;
        int swaps;
        int compares;
        ArrayList<Comparable> sorted = new ArrayList<Comparable>();
        for( Comparable o : a )
            sorted.add( o );
        for (int i = 0; i < sorted.size() - 1; i++) {
            minIndex = i;
            for (int j = i + 1; j < sorted.size(); j++) {
                if (sorted.get(j).compareTo(sorted.get(minIndex)) < 0) {
                    minIndex = j;
                }
            }
            Comparable temp = sorted.get(i);
            sorted.set(i, a.get(minIndex));
            sorted.set(minIndex, temp);
        }
        return sorted;
    }

    public static int[] selectionSortBenchmark (ArrayList<Comparable> a) {
        int minIndex;
        int passes = 0;
        int swaps = 0;
        int compares = 0;
        ArrayList<Comparable> sorted = new ArrayList<Comparable>();
        for( Comparable o : a )
            sorted.add( o );
        for (int i = 0; i < sorted.size() - 1; i++) {
            passes += 1;
            minIndex = i;
            for (int j = i + 1; j < sorted.size(); j++) {
                compares += 1;
                if (sorted.get(j).compareTo(sorted.get(minIndex)) < 0) {
                    minIndex = j;
                }
            }
            Comparable temp = sorted.get(i);
            sorted.set(i, a.get(minIndex));
            swaps += 1;
            sorted.set(minIndex, temp);
        }
        int[] benchmarks = {passes, compares, swaps};
        return benchmarks;
    }

    public static ArrayList<Comparable> bubbleSort ( ArrayList<Comparable> data ) {
        for( int i = 0; i < data.size(); i++ ) {
            for( int j = 0; j < data.size()-1-i; j++ ) {
                if( data.get(j).compareTo(data.get(j+1)) > 0 ) {
                    Comparable temp = data.get(j);
                    data.set(j, data.get(j+1));
                    data.set(j+1, temp);
                }
            }
        }
        return data;
    }

    public static int[] bubbleSortBenchmark ( ArrayList<Comparable> data ) {
        int passes = 0;
        int swaps = 0;
        int compares = 0;
        for( int i = 0; i < data.size(); i++ ) {
            passes += 1;
            for( int j = 0; j < data.size()-1-i; j++ ) {
                compares += 1;
                if( data.get(j).compareTo(data.get(j+1)) > 0 ) {
                    Comparable temp = data.get(j);
                    data.set(j, data.get(j+1));
                    data.set(j+1, temp);
                    swaps += 1;
                }
            }
        }
        int[] benchmarks = {passes, compares, swaps};
        return benchmarks;
    }
}