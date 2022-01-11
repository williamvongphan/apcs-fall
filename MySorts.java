public class MySorts {
    // THE CODE BELOW IS NOT TESTED!
    // DO NOT USE IT IN A PRODUCTION ENVIRONMENT!

    public static void insertionSort(ArrayList<Comparable> data) {
        ArrayList<Comparable> sorted = new ArrayList<Comparable>();
        for (int i = 0; i < data.size(); i++) {
            Comparable temp = data.get(i);
            int j = i;
            while (j > 0 && temp.compareTo(sorted.get(j - 1)) < 0) {
                sorted.set(j, sorted.get(j - 1));
                j--;
            }
        }
        data = sorted;
    }

    public static void bubbleSort( ArrayList<Comparable> data )
    {
        if (data.size() <= 1) {
            return;
        }
        else {
            for (int i = 0; i < data.size() - 1; i++) {
                for (int j = data.size() - 1; j > i; j--) {
                    if (data.get(j).compareTo(data.get(j-1)) < 0) {
                        Comparable temp = data.get(j);
                        data.set(j, data.get(j-1));
                        data.set(j-1, temp);
                    }
                }
            }
            return;
        }
    }

    public static void selectionSort(ArrayList<Comparable> a) {
        int minIndex;
        for (int i = 0; i < a.size() - 1; i++) {
            // pass counter
            System.out.println("Pass " + (i + 1));
            minIndex = i;
            for (int j = i + 1; j < a.size(); j++) {
                if (a.get(j).compareTo(a.get(minIndex)) < 0) {
                    minIndex = j;
                }
            }
            Comparable temp = a.get(i);
            a.set(i, a.get(minIndex));
            a.set(minIndex, temp);
        }
    }
}
