import java.util.Random;

// uTiLiLiLiLiLiTiEs

class Utils {
	public static int random_acct_number () {
		Random random = new Random();
		return random.nextInt(1000000000 - 100000000) + 100000000;

		// Java is a hot mess.
	}
}
