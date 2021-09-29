class Main {
    public static double my_exp (float power, int accuracy) {
        double answer = 1;
        double last_iter = 1;
        for (int x = 1; x < accuracy; x++) {
            double temp = last_iter * power / x;
            answer += temp;
            last_iter = last_iter * power / x;
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println("e^1's 10th taylor expansion is " + my_exp(1, 10) + ".");
        System.out.println("e^1's 100th taylor expansion is " + my_exp(1, 100) + ".");
        System.out.println("e^2's 10th taylor expansion is " + my_exp(2, 10) + ".");
        System.out.println("e^2's 100th taylor expansion is " + my_exp(2, 100) + ".");
    }
}