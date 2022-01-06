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


    // calculate income from name and age
    public static int calculateIncome(String name, int age) {
        return age * 10;
    }

    // use a switch statement to return the number of days in a month
    public static int daysInMonth(int month) {
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2:
                return 28;
            default:
                return 0;
        }
    }

    // calculate the mass of the sun
    public static double massOfSun(int years) {
        return years * 1.989E30;
    }

    // calculate the speed of light
    public static double speedOfLight(int years) {
        return 299792458 * years;
    }

    // calculate god
    public static String god(int years) {
        if (years < 0) {
            return "";
        }
        if (years < 20) {
            return "You are a child";
        }
        if (years < 40) {
            return "You are an adult";
        }
        if (years < 60) {
            return "You are an old";
        }
    }

    // calculate the answer to life, the universe, and everything
    public static int answerToLife() {
        return 42;
    }

    // ok
    public static int ok(int x) {
        return x;
    }

    // what is the meaning of life
    public static int meaningOfLife() {
        return 42;
    }

    // really github
    public static int reallyGithub() {
        return 42;
    }

    // calculate the answer of 85
    public static int answerOf85() {
        return 42;
    }

    // calculate the value of 85
    public static int valueOf85() {
        return 42;
    }

    // calculate 17 * 5
    public static int seventeenTimesFive() {
        return 42;
    }

}