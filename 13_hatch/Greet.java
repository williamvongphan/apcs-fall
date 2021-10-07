/*
Team Dynastic Duo of Destiny {Fang, Ducky Cat, William, and CS50DDB}
APCS
HW 13 - Where do BigSibs Come From?
2021-10-07
*/

public class Greet {
  public static void main( String[] args ) {
    String greeting;

	// set message in constructor
    Bigsib Richard = new Bigsib("Word up");

	// Tests for HW12
	
    greeting = Richard.greet("freshman");
    System.out.println(greeting);

    greeting = Richard.greet("Dr. Spaceman");
    System.out.println(greeting);
	// now that's a little disrespectful, right Richard?

    greeting = Richard.greet("Kong Fooey");
    System.out.println(greeting);
	// is he a lowerclassman?

    greeting = Richard.greet("mom");
    System.out.println(greeting);
	// that's plain weird.

  } //end main()
} //end Greet

/*
Discoveries:

If you create a function (without a return type), with the same name as the class, it will be a constructor!

Not like javascript, which is cleaner about that (`constructor()` is easier to figure out within a class)
*/

/* 
QCC

N/A
*/