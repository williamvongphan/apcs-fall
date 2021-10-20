public class StatsDriver {
	public static void main(String[] args) {
		System.out.println(Stats.mean(3, 5));
		System.out.println("Above call should print \"4\"");

		System.out.println(Stats.mean(3, 3));
		System.out.println("Above call should print \"3\"");
		
		System.out.println(Stats.mean(-3, 0));
		System.out.println("Above call would have an error");
		
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
		System.out.println("Above call should print \"10\"");

		System.out.println(Stats.max(10.0, -3.0));
		System.out.println("Above call should print \"10\"");

		System.out.println(Stats.geoMean(3, 27));
		System.out.println("Above call should print \"9\"");

		System.out.println(Stats.geoMean(9.0, 9.0));
		System.out.println("Above call should print \"9\"");

		System.out.println(Stats.geoMean(3.1, 26.89));
		System.out.println("Above call should print \"9.13011500475\"");

		System.out.println(Stats.geoMean(-9.0, 729.0));
		System.out.println("Above call should error because imaginary sqrt");
	}
}