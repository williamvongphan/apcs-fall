
public class Stats {

	public static double sqrt(int a) {
		long left = 1;
		long right = Math.round(a / 2) + 1;

		while (left <= right) {
			long mid = Math.round(left + Math.floor((right - left) / 2));

			if (mid * mid > a) {
				right = mid - 1;
			} else if (mid * mid < a) {
				left = mid + 1;
			} else {
				return mid;
			}
		}

		return right;
	}

	public static int mean(int a, int b) {
		return (a + b) / 2;
	}

	public static double mean(double a, double b) {
		return (a + b) / 2;
	}

	public static int max(int a, int b) {
		if (a > b) {
			return a;
		} else {
			return b;
		}
	}

	public static double max(double a, double b) {
		if (a > b) {
			return a;
		} else {
			return b;
		}
	}

	public static int geoMean (int a, int b) {
		return sqrt(a * b);
	}

	public static double max(double a, double b, double c) {

	}

	public static int geoMean(int a, int b, int c) {

	}

	public static double geoMean(double a, double b, double c) {

	}
}