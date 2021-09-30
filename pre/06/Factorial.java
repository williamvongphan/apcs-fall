class Factorial {
    public static long factorial (long number) {
        long answer = 1;
        for (long x = number; x > 0; x--) {
            answer *= x;
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println("2 factorial is " + factorial(2) + ".");
        System.out.println("3 factorial is " + factorial(3) + ".");
        System.out.println("4 factorial is " + factorial(4) + ".");
    }
}