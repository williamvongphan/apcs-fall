class Power {
    public static long power (long number, int power) {
        long answer = 1;
        for (int x = 0; x < power; x++) {
            answer *= number;
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println("2 to the power of 2 is " + power(2, 2) + ".");
        System.out.println("3 to the power of 3 is " + power(3, 3) + ".");
        System.out.println("4 to the power of 4 is " + power(4, 4) + ".");
    }
}