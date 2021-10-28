public class For {
	public static String fenceF (int posts) {
		if (posts < 1) {
			return "";
		}
		String res = "|";
		for (int x = 1; x < posts; x++) {
			res += "--|";
		}
		return res;
	}

	public static String reverseF (String s) {
		String res = "";
		for (int x = s.length(); x > 0; x--) {
			res += s.substring(x - 1, x);
		}
		return res;
	}

	public static String reverseR (String s) {
		
	}

	public static void main (String[] args) {
		System.out.println(fenceF(0));
		System.out.println(fenceF(1));
		System.out.println(fenceF(3));
		System.out.println(fenceF(5));

		System.out.println(reverseF("stressed"));
		System.out.println(reverseF("desserts"));
		// made consistent
		System.out.println(reverseF("a man a plan a canal panama"));
	}
}