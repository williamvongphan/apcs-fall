/***
 * driver for class Coin ~~~ SUGGESTED WORKFLOW: ~~~ 1. Compile this file and
 * run. Note anything notable. 2. Move the "TOP" line down, so that it is below
 * the first statement. (emacs: with cursor at beginning of TOP line, C-k C-k,
 * DOWN, DOWN, C-y) (your editor: ???) 3. Compile and run again. 4. Resolve
 * errors one at a time until it works. 5. Repeat 2-4 until TOP meets BOTTOM.
 ***/

public class Driver {

	public static void main(String[] args) {

		// build Objects from blueprint specified by class Coin

		int x = 1234;
		int y = 5678;
		int YoB = 2007;

		Coin yours = new Coin("quarter");
		Coin mine = new Coin("penny");

		// goal 1
		while (yours.getHeadsCtr() < x) {
			yours.flip();
		}
		System.out.println("Your coin was flipped " + yours.getFlipCtr() + " times and landed on heads " + yours.getHeadsCtr() + " times.");

		
		// goal 2
		yours.reset("No face", 0.5);
		mine.reset("No face", 0.5);
		int a = 0;
		int b = 0;
		while (a < y) {
			yours.flip();
			mine.flip();
			if (yours.equals(mine)) {
				a += 1;
			}
			b += 1
		}
		System.out.println("Coins were flipped " + b + " times and matched " + a + " times.");

	}// end main()

}// end class