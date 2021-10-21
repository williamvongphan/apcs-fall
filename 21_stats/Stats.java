/*
TNPG: Awesome Name
HW 21: STAtisTically Speaking...
10/20/21
Notes:
--> We tried to implement all of the methods with functions that were as elementary as possible. We used functions that were unknown to us only once in the code (Math.pow for our recursive root finder). This sacrifices readability and understandability (is that a word?), but I've tried to explain each utility function in a block comment above the helper. 
Discoveries:
--> 
*/

public class Stats {
	/*
	 * Utility Code
	 */

	/*
	 * Round code was simple enough to figure out in a few seconds. Simply add 0.5
	 * to the given value (so if it rounds up, the value of it plus 0.5 becomes a
	 * higher integer) then floor it.
	 */
	public static int round(double a) {
		return (int) (a + 0.5);
	}

	/*
	 * Sqrt code that returns the integer part of the square root of the integer
	 * provided. I took a competitive programming course over the summer and I wrote
	 * this code for a Leetcode problem. Originally written in Javascript, wasn't
	 * too hard to convert to Java. It works by creating a boundary and converging
	 * the boundary towards a single value, by checking if the value of the midpoint
	 * squared is greater than the value we're square rooting. Once that boundary is
	 * a single point, it returns that value.
	 */
	public static int sqrt(int a) {
		int left = 1;
		int right = round(a / 2) + 1;

		while (left <= right) {
			int mid = round(left + (int) ((right - left) / 2));

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

	/*
	 * Sqrt code 2, this time returns the arbritrary root of a number to a specified
	 * accuracy using the same method as above, and returns doubles instead of ints.
	 */

	static double epsilon = 1e-12; // set the margin of error you want here

	public static double root(double x, int n) {
		double left = 0;
		double right = max(1.0, x); // handles <1 correctly, uses a function we implemented ourselves!

		while (right - left > epsilon) {
			double mid = (right - left) / 2 + left;
			double xGuess = Math.pow(mid, n);

			if (xGuess > x) {
				right = mid;
			} else {
				left = mid;
			}
		}

		return (right - left) / 2 + left;
	}

	/*
	 * Start of edited Skeleton
	 */
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

	/*
	 * public static int max(int a, int b) { return a > b ? a : b; }
	 */

	public static double max(double a, double b) {
		if (a > b) {
			return a;
		} else {
			return b;
		}
	}

	/*
	 * public static double max(double a, double b) { return a > b ? a : b; }
	 */

	public static int geoMean(int a, int b) {
		return sqrt(a * b);
	}

	/*
	 * public static int geoMean(int a, int b) { return (int) Math.pow(a * b, 1.0 /
	 * 2.0); //
	 * https://stackoverflow.com/questions/25743901/find-cube-root-of-a-number-using
	 * -system-math-pow-method-in-c-sharp }
	 */

	public static double geoMean(double a, double b) {
		return root(a * b, 2);
	}

	/*
	 * public static double geoMean(double a, double b) { return Math.pow(a * b, 1.0
	 * / 2.0); }
	 */

	public static int max(int a, int b, int c) {
		if (a >= b && a >= c) {
			return a;
		} else if (b >= a && b >= c) {
			return b;
		} else {
			return c;
		}
	}

	public static double max(double a, double b, double c) {
		if (a >= b && a >= c) {
			return a;
		} else if (b >= a && b >= c) {
			return b;
		} else {
			return c;
		}
	}

	public static int geoMean(int a, int b, int c) {
		return round(root(a * b * c, 3));
	}

	/*
	public static int geoMean(int a, int b, int c) {
		return (int) Math.round(Math.pow(a * b * c, 1.0 / 3.0));
	}
	*/

	public static double geoMean(double a, double b, double c) {
		return root(a * b * c, 3);
	}

	/*
	public static int geoMean(int a, int b, int c) {
		return Math.round(Math.pow(a * b * c, 1.0 / 3.0));
	}
	*/
}