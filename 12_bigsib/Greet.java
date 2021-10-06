/*
Team Dynastic Duo of Destiny {Fang, Ducky Cat, William, and CS50DDB}
APCS
HW 12 - On Elder Individuality and the Elimination of Radio Fuzz
2021-10-26
*/

public class Greet {
  public static void main( String[] args ) {
    String greeting;

    Bigsib Richard = new Bigsib();

	// Tests for HW12
	
    Richard.setHelloMsg("Word up");
    greeting = Richard.greet("freshman");
    System.out.println(greeting);

	Richard.setHelloMsg("Salutations");
    greeting = Richard.greet("Dr. Spaceman");
    System.out.println(greeting);

	Richard.setHelloMsg("Hey ya");
    greeting = Richard.greet("Kong Fooey");
    System.out.println(greeting);

	Richard.setHelloMsg("Sup");
    greeting = Richard.greet("mom");
    System.out.println(greeting);

  } //end main()
} //end Greet

/* DISCOVERIES
Attributes don't need to use `this.<attribute>`. It's not like javascript.
*/

/* QCC
Nothing as of right now
*/
