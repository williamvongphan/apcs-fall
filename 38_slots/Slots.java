/*****************************************************
 * William Vongphanith, Jefford Shau, Jacob Kirmayer
 * APCS pd06
 * HW38 -- Shmoney
 * 2021-11-17
 *
 * class Slots
 * Discoveries: Not much
 * QCC: Not much
 *****************************************************/

public class Slots {

	//instance variable to represent master copy for slot machine
	private static final String[] FRUITS = {
		"lime",
		"lime",
		"lime",
		"lemon",
		"lemon",
		"lemon",
		"cherry",
		"cherry",
		"cherry",
		/*
		  add extra fruits until your heart is content...
		  Some suggestions:
		"orange", "orange", "orange", 
		"grapefruit", "grapefruit", "grapefruit", 
		"tangerine", "tangerine", "tangerine", 
		"ugli", "ugli", "ugli", 
		*/
		"peach",
		"peach",
		"peach"
	};

	private String[] _fruits; //to be init'd by each instance


	/*=====================================
	  Slots() -- default constructor
	  pre:  constant array FRUITS exists, has been initialized
	  post: mutable array _fruits contains same elements as FRUITS
	  =====================================*/
	public Slots() {
		this._fruits = FRUITS;
	}


	/*=====================================
	  String toString() -- overrides inherited toString()
	  pre:  
	  post: returns String of elements in slots 0 thru 2, separated by tabs
	  =====================================*/
	public String toString() {
		return _fruits[0] + "\t" + _fruits[1] + "\t" + _fruits[2];
	}


	/*=====================================
	  void swap(int,int) -- array swap util fxn
	  pre:  _fruits array exists
	  post: elements at indices i, j are swapped
	  =====================================*/
	private void swap(int i, int j) {
		String[] temp = _fruits;
		temp[i] = _fruits[j];
		temp[j] = _fruits[i];
		_fruits = temp;
	}

	public static int randIntExclusive (int arrayLength, int idx){
		int randInt = (int) (Math.random()*(arrayLength-1));
		if (randInt>=idx){
			randInt++;
		}
		System.out.println(randInt);
		return randInt;
	}

	public static boolean isAllSame (String[] array) {
		return (array[0] == array[1] && array[1] == array[2] && array[0] == array[2]);
	}

	public static boolean isAllDifferent (String[] array) {
		return (array[0] != array[1] && array[1] != array[2] && array[0] != array[2]);
	}

	/*=====================================
	  void spinOnce() -- simulate a pull of the slot machine lever
	  pre:  _fruits array exists
	  post: randomized order of elements in _fruits array
	  =====================================*/

	public void spinOnce() {
		// A simple approach to shuffling:
		// iterate through the array, swapping
		// the val at each index with a randomly chosen other index
		for (int a = 0; a < _fruits.length; a++) {
			this.swap(a,randIntExclusive(_fruits.length,a));
		}
	}


	/*=====================================
	  boolean jackpot() -- checks for a winning combo
	  pre:  _fruits is existing array
	  post: returns true if first 3 slots represent winning combo,
	  false otherwise
	  =====================================*/
	public boolean jackpot() {
		return isAllSame(_fruits);
	}


	/*=====================================
	  boolean miniWin() -- checks for a winning combo
	  pre:  _fruits is existing array
	  post: returns true if first 3 slots represent winning combo,
	  or if first 3 slots mutually distinct, 
	  false otherwise
	  =====================================*/

	public boolean miniWin() {
		return isAllSame(_fruits) || isAllDifferent(_fruits);
	}


	//main() method for testing
	public static void main(String[] args) {
		//usage: move bar below down 1 line at a time to test functionality...


		Slots machine01 = new Slots();
		Slots machine02 = new Slots();
		//test to verify slot machines function indepently
		System.out.println();
		System.out.println( "Machine01 initial state:\t" + machine01 );
		System.out.println( "Machine02 initial state:\t" + machine02 );
		
		System.out.println( "\nSpinning machine01...\n" );
		machine01.spinOnce();
		System.out.println();
		System.out.println( "Machine01 state:\t" + machine01 );
		System.out.println( "Machine02 state:\t" + machine02 );
		System.out.println();
		
		//test gamble-until-you-win mechanism
		System.out.println( "Preparing to spin until a mini win! . . ." );
		System.out.println( "------------------------------------" );
		//if you haven't won, spin again until you win!
		
		while( machine01.miniWin() == false ) {
		  System.out.println( "Your spin..." + "\t" + machine01 );
		  System.out.println( "LOSE\n" );
		  machine01.spinOnce();
		}
		System.out.println( "====================================" );
		System.out.println( "Your spin..." + "\t" + machine01 );
		System.out.println( "WIN\n" );
		System.out.println( "Preparing to spin until...jackpot! . . ." );
		System.out.println( "------------------------------------" );
		//if you haven't won, spin again until you win!
		while( machine01.jackpot() == false ) {
		  System.out.println( "Your spin..." + "\t" + machine01 );
		  System.out.println( "LOSE\n" );
		  machine01.spinOnce();
		}
		System.out.println( "====================================" );
		System.out.println( "Your spin..." + "\t" + machine01 );
		System.out.println( "JACKPOT!\n" );
	} //end main

} //end class Slots
