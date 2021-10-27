public class Maf {
	public static double GCD (double a, double b) {
		while (a > b) {
			a -= b;
		}
		return a;
	}

	public static long GCD (long a, long b) {
		return (long) GCD(a, b);
	}

	public static int GCD (int a, int b) {
		return (int) GCD(a, b);
	}

	public static float GCD (float a, float b) {
		return (float) GCD(a, b);
	}

	public static void main (String[] args) {
		System.out.println("The GCD of 15 and 6 is " + GCD(15, 6));
	}
}