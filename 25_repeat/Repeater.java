/*
	Team "Lack of Coordination"
	Presents: 
	HW25 -- Do I Need To Repeat Myself?
	10 / 26 / 21
	Time taken: 7 minutes (~ 0.1 hrs)

	Discoveries: 
	--> Iteration is easier than I thought in recursion!!!

	QCC: 
	--> None
*/

public class Repeater {
	public static String fenceW(int numPosts) {
		String res = "|";
		int iters = 1;
		while (numPosts > iters) {
			res += "--|";
			iters++;
		}
		return res;
	}

	public static String fenceR(int numPosts) {
		if (numPosts == 1) {
			return "|";
		} else {
			return fenceR(numPosts - 1) + "--|";
		}
	}

	public static void main(String[] args) {
		System.out.println(fenceW(5));
		System.out.println(fenceR(5));

	}
}