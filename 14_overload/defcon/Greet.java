public class Greet {

	// who likes typing that every time :P
	// aka utility function
	public static void print(String thing) {
		System.out.println(thing);
	}
	
	public static void main(String[] args) {
		String greeting;
		Bigsib richard = new Bigsib("Word up");
		Bigsib grizz = new Bigsib("Hey ya");
		Bigsib dotCom = new Bigsib("Sup");
		Bigsib tracy = new Bigsib("Salutations");
		greeting = richard.greet("freshman");
		print(greeting);
		greeting = tracy.greet("Dr. Spaceman");
		print(greeting);
		greeting = grizz.greet("Kong Fooey");
		print(greeting);
		greeting = dotCom.greet("mom");
		print(greeting);
	}
}
