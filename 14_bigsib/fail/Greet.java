public class Greet1 {

	// who likes typing that every time :P
	// aka utility function
	public static void print(String thing) {
		System.out.println(thing);
	}
	
	public static void main(String[] args) {
		String greeting;
		Bigsib richard = new Bigsib();
		Bigsib grizz = new Bigsib();
		Bigsib dotCom = new Bigsib();
		Bigsib tracy = new Bigsib();
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
