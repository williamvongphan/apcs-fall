import static java.lang.System.out;
// // //
import java.io.PrintStream;

public class Commafy {
	private static Integer intLength;

    	public static String commafyR (String number) {
		intLength = number.length();
		if (intLength < 4) {
			return number;
		}
		else {
			var part1 = number.substring(0, intLength - 3);
			var part2 = number.substring(intLength - 3, intLength);
			return commafyR(part1) + "," + part2;
		}
	}

	public static String commafyR (Integer number) {
		return commafyR(number.toString());
	}

	public static String commafyF (String number) {
		intLength = number.length();
		if (intLength < 4) {
			return number;
		}
		Integer x;
		var answer = "";
        	for (x = intLength; x > 3; x-=3) {
			Integer currentLength = number.length();
			answer = "," + number.substring(currentLength - 3, currentLength) + answer;
           		number = number.substring(0, x - 3);
        	}
		answer = number + answer;
        	return answer;
	}

	public static String commafyF (Integer number) {
		return commafyF(number.toString());
	}

	public static void main (String[] args) {
		for (String item : args) {
			extracted().println(commafyF(item));
		}
	}

	private static PrintStream extracted() {
		return out;
	}
}
