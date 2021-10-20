public class StatsDriver {
	public static void main(String[] args) {
		System.out.println(Stats.mean(3, 5));
		System.out.println("Above call should print \"4\"");

		System.out.println(Stats.mean(3, 3));
		System.out.println("Above call should print \"3\"");
		
		System.out.println(Stats.mean(-3, 0));
		System.out.println("Above call should print -1.5 but prints -1 (due to typecast)");
		
		System.out.println(Stats.mean(3, -3));
		System.out.println("Above call should print \"0\"");
		
		System.out.println(Stats.mean(3.5, 7.5));
		System.out.println("Above call should print \"5.5\"");

		System.out.println(Stats.mean(3.0, 3.0));
		System.out.println("Above call should print \"3.0\"");

		System.out.println(Stats.mean(3.0, 0.0));
		System.out.println("Above call should print \"1.5\"");

		System.out.println(Stats.mean(3.0, -3.0));
		System.out.println("Above call should print \"0.0\"");

		System.out.println(Stats.max(8, 25));
		System.out.println("Above call should print \"25\"");

		System.out.println(Stats.max(10, -3));
		System.out.println("Above call should print \"10\"");

		System.out.println(Stats.max(15, 15));
		System.out.println("Above call should print \"15\"");

		System.out.println(Stats.max(8.0, 25.0));
		System.out.println("Above call should print \"25.0\"");

		System.out.println(Stats.max(10.0, -3.0));
		System.out.println("Above call should print \"10.0\"");

		System.out.println(Stats.geoMean(3, 27));
		System.out.println("Above call should print \"9\"");

		System.out.println(Stats.geoMean(9.0, 9.0));
		System.out.println("Above call should print \"9.0\" but doesn't because of our approximation method (it prints something very close)");

		System.out.println(Stats.geoMean(3.1, 26.89));
		System.out.println("Above call should print \"9.13011500475\" but doesn't because of our approximation method (it prints something very close)");

		System.out.println(Stats.geoMean(-9.0, 729.0));
		System.out.println("Above call should error (imaginary square root) but doesn't because our solution approximates the answer (and approximates it wrong in this case)");
	}
}