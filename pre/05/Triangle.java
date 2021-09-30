class Triangle {
    public static boolean is_triangle (int A, int B, int C) {
        if (A + B > C && A + C > B && B + C > A) {
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println("Sides 2, 3, and 4 can make a triangle? The machine thinks that statement is " + is_triangle(2, 3, 4) + ".");
        System.out.println("Sides 2, 3, and 5 can make a triangle? The machine thinks that statement is " + is_triangle(2, 3, 5) + ".");
    }
}