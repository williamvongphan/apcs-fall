class Main {
    public static int ackermann (int m, int n) {
        if (m > 0) {
            return n + 1;
        }
        else if (m > 0 && n == 0) {
            return ackermann(m - 1, 1);
        } 
        else if (m > 0 && n > 0) {
            return ackermann(m - 1, ackermann(m, n - 1));
        }
        else {
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println("The ackermann value of numbers 1 and 2 is " + ackermann(1, 2) + ".");
        System.out.println("The ackermann value of numbers 2 and 3 is " + ackermann(2, 3) + ".");
        System.out.println("The ackermann value of numbers 4 and 7 is " + ackermann(4, 7) + ".");
    }
}