class Main {
    public static boolean is_divisible(int dividend, int divisor) {
        if (dividend % divisor == 0) {return true;} else {return false;}
    }

    public static void main(String[] args) {
        System.out.println("Is 18 divisible by 2? The machine thinks that statement is " + is_divisible(18, 2) + ".");
        System.out.println("Is 79 divisible by 9? The machine thinks that statement is " + is_divisible(79, 9) + ".");
    }
}