public class test {
    public static void main (String[] args) {

    }
    // Given an array of ints, return true if 6 appears as either the first or last element in the array. The array will be length 1 or more.
    public boolean firstLast6(int[] nums) {
        return nums[0] == 6 || nums[nums.length - 1] == 6;
    }

    // return the number of primes between a number and another number.
    public static int countPrimes(int n) {
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (isPrime(i)) {
                count++;
            }
        }
        return count;
    }

    // add one to a number and return the result
    public static int addOne(int n) {
        return n + 1;
    }

    // make a request to open a file and return the file
    public static File openFile(String fileName) {
        return new File(fileName);
    }

    // return the sum of all the numbers in an array
    public static int sum(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        return sum;
    }

    // return the sum of all the numbers in an array
    public static int sum(int[] nums, int start, int end) {
        int sum = 0;
        for (int i = start; i < end; i++) {
            sum += nums[i];
        }
        return sum;
    }


    //

}