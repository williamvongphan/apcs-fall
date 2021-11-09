
/**
   Clyde "Thluffy" Sinclair
   APCS
   DEMO -- Use Scanner class to read from standard input

   USAGE:
   1. Read for understanding.
   2. Record predictions.

   3.
   $ javac <thisclass>.java
   $ java <thisclass>
   ...

   4. enter text, followed by ENTER to send
   ...

   5. Reconcile predictions with observations.

   ( CTRL-C to exit )

**/

import java.util.Scanner; //Scanner is not part of java's std lib

public class Scan {

	public static void main(String[] args) {
		// instantiate a Scanner with STDIN as its bytestream
		Scanner sc = new Scanner(System.in);

		while (sc.hasNextLine()) {
			String l = sc.nextLine();
			System.out.println("IN: " + l);
			System.out.println("OUT: " + Pig.stringToPig(l));
		}

	}// end main()

}// end class DemoScanner
