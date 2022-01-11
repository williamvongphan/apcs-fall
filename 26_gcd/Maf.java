public class Maf {
	public static double GCD(double a, double b) {
		while (a > b) {
			a -= b;
		}
		return a;
	}

	// added more me-fods
	public static long GCD(long a, long b) {
		return (long) GCD((double) a, (double) b);
	}

	public static int gcd(int a, int b) {
		int answer;
		if (a > b) {
			answer = b;
			while (a % answer != 0 || b % answer != 0) {
				answer = answer - 1;
			}
		} else {
			answer = a;
			while (a % answer != 0 || b % answer != 0) {
				answer = answer - 1;
			}
		}
		return answer;
	}

	public static int gcdER(int a, int b) {
		if (a == 0) {
			return b;
		}
		return gcdER(b % a, a);
	}

	public static int gcdEW(int a, int b) {
		while (a > b) {
			a -= b;
		}
		return a;
	}

	// added more me-fods
	public static void main(String[] args) {
		System.out.println("The GCD of 15 and 6 is " + GCD(15, 6));
		System.out.println("The GCD of 1874 and 192 is " + GCD(1874, 192));
		System.out.println("The GCD of 15.0 and 6.0 is " + GCD(15.0, 6.0));
		System.out.println("The GCD of 1874.0 and 192.0 is " + GCD(1874.0, 192.0));
	}
}
