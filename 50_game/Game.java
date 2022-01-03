import java.util.ArrayList;

public class Game {
    public static void expressInTermsOf (int goal, int[] available) {
        String[] operators = {"+", "-", "*", "/"};
        ArrayList<String> opOrder = new ArrayList<String>();
        loop1:
        for (int i = 0; i < operators.length; i++) {
            loop2:
            for (int j = 0; j < available.length; j++) {
                loop3:
                for (int k = 0; k < available.length; k++) {
                    if (opToResult(available[j], available[k], operators[i]) == goal) {
                        opOrder.add(operators[i]);
                        break loop3;
                    }
                }
            }
        }
        System.out.println(opOrder);
    }

   public static int opToResult (int a, int b, String op) {
       if (op == "+") {
           return a + b;
       } else if (op == "-") {
           return a - b;
       } else if (op == "*") {
           return a * b;
       } else if (op == "/") {
           if (b == 0) {
               return 0;
           }
           return a / b;
       } else {
           return 0;
       }
   }

   public static void main (String[] args) {
        int[] available = {2, 0, 2, 1};
        for (int i = 1; i < 41; i++) {
            expressInTermsOf(i, available);
        }
   }
}
