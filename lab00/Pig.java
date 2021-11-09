/*
TNPG: NAW FAM | Roster: Alif Rahman, William Vongphanith, Nakib Abedin APCS
pd06 lab00 --Etterbay Odingcay Oughthray Ollaborationcay 2021-11-08 Time
Spent: 1.3 hr
class Pig a pig latin translator.
What we have done in v0. 
--> Implement ability to control what you want expressed in the pig latin translator: do you want capitalization taken care of? Do you want punctuation to be taken care of? Do you want y to be a vowel?
--> --> Implemented the ability to take care of capitalization
--> --> Implemented the ability to take care of punctualization
--> --> Left implementation of YControl for next class. 
*/

public class Pig {

	private static final String VOWELS = "aeiou";
	private static final String YOWELS = "aeiouy";
	private static final String CAPS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	private static final String PUNCS = ".,:;!?";

	/**
	 * boolean hasA(String,String) -- checks for a letter in a String pre: w !=
	 * null, letter.length() == 1 post: hasA("cat", "a") -> true hasA("cat", "p") ->
	 * false
	 **/
	public static boolean hasA(String w, String letter) {

		return w.indexOf(letter) != -1;

		/*
		 * equiv code, wo using indexOf()... boolean ans = false; for( int i = 0; i <
		 * w.length(); i++ ) { if ( w.substring(i,i+1).equals(letter) ) { ans = true;
		 * //Q: is there a more efficient way? } } return ans;
		 */
	} // end hasA()

	/**
	 * boolean isAVowel(String) -- tells whether a letter is a vowel precondition:
	 * letter.length() == 1
	 **/
	public static boolean isAVowel(String letter) {
		return VOWELS.indexOf(letter) != -1;
	}

	/**
	 * int countVowels(String) -- counts vowels in a String pre: w != null post:
	 * countVowels("meatball") -> 3
	 **/
	public static int countVowels(String w) {

		return allVowels(w).length();

		/*
		 * long version using for int numVowels = 0; //init vowels counter var //must
		 * touch each letter in word, so use FOR for( int i = 0; i < w.length(); i++ ) {
		 * if ( isAVowel( w.substring(i,i+1) ) ) numVowels++; } return numVowels;
		 */
	}

	/**
	 * boolean hasAVowel(String) -- tells whether a String has a vowel pre: w !=
	 * null post: hasAVowel("cat") -> true hasAVowel("zzz") -> false
	 **/
	public static boolean hasAVowel(String w) {
		return w.indexOf(w) >= 0;
	}

	/**
	 * String allVowels(String) -- returns vowels in a String pre: w != null post:
	 * allVowels("meatball") -> "eaa"
	 **/
	public static String allVowels(String w) {

		String ans = ""; // init return String

		for (int i = 0; i < w.length(); i++) {

			if (isAVowel(w.substring(i, i + 1)))
				ans += w.substring(i, i + 1); // grow the return String
		}
		return ans;
	}

	/**
	 * String firstVowel(String) -- returns first vowel in a String pre: w != null
	 * post: firstVowel("") --> "" firstVowel("zzz") --> "" firstVowel("meatball")
	 * --> "e"
	 **/
	public static String firstVowel(String w) {

		String ans = "";

		if (hasAVowel(w)) // Q: Why this necess?
			ans = allVowels(w).substring(0, 1);

		return ans;
	}

	/**
	 * boolean beginsWithVowel(String) -- tells whether a String begins with a vowel
	 * pre: w != null and w.length() > 0 post: beginsWithVowel("apple") --> true
	 * beginsWithVowel("strong") --> false
	 **/
	public static boolean beginsWithVowel(String w) {
		return isAVowel(w.substring(0, 1));
	}

	public static Integer boolToInt(boolean in) {
		// fallback for if true != 1 and false != 0
		return (in == true) ? 1 : 0;
	}

	/**
	 * String wordToPig(String) -- converts an English word to Pig Latin pre:
	 * w.length() > 0 post: wordToPig("apple") --> "appleway" wordToPig("strong")
	 * --> "ongstray" wordToPig("java") --> "avajay"
	 **/
	public static String wordToPig(String w, boolean handlePunctuation, boolean handleCaps, boolean yAsVowel) {
		String ans = "";
		if (handlePunctuation) {
			String punc = puncOnly(w);
			String letts = lettersOnly(w);
			if (beginsWithVowel(letts))
				ans = letts + "way";
			else {
				int vPos = letts.indexOf(firstVowel(letts));
				ans = letts.substring(vPos) + letts.substring(0, vPos) + "ay";
			}
			ans = ans + punc;
		} else {
			String letts = w;
			if (beginsWithVowel(letts))
				ans = letts + "way";
			else {
				int vPos = letts.indexOf(firstVowel(letts));
				ans = letts.substring(vPos) + letts.substring(0, vPos) + "ay";
			}
		}
		if (handleCaps) {
			ans = ans.substring(0, 1).toUpperCase() + ans.substring(1, ans.length()).toLowerCase();
		}
		return ans;
	}

	/*
	 * ===================================== boolean isPunc(String) -- tells whether
	 * a character is punctuation pre: symbol.length() == 1 post: isPunc(".") ->
	 * true isPunc("b") -> false =====================================
	 */
	public static boolean isPunc(String symbol) {
		return PUNCS.indexOf(symbol) != -1;
	}

	/*
	 * ===================================== boolean isUpperCase(String) -- tells
	 * whether a letter is uppercase pre: letter.length() == 1 post:
	 * isUpperCase("a") -> false isUpperCase("A") -> true
	 * =====================================
	 */

	public static boolean isUpperCase(String letter) {
		return letter == letter.toUpperCase();
	}

	/*
	 * ===================================== boolean hasPunc(String) -- tells
	 * whether a String contains punctuation pre: w != null post: hasPunc(“cat.”) ->
	 * true hasPunc(“cat”) -> false =====================================
	 */

	public static boolean hasPunc(String w) {
		String[] letters = w.split("");
		for (String l : letters) {
			if (isPunc(l))
				return true;
		}
		return false;
	}

	public static String puncOnly(String w) {
		String punctuation = "";
		String[] letters = w.split("");
		for (String l : letters) {
			if (isPunc(l))
				punctuation += l;
		}
		return punctuation;
	}

	public static String lettersOnly(String w) {
		String res = "";
		String[] letters = w.split("");
		for (String l : letters) {
			if (!isPunc(l))
				res += l;
		}
		return res;
	}

	/*
	 * ===================================== boolean beginsWithUpper(String) --
	 * tells whether 1st letter is uppercase pre: w != null and w.length() > 0 post:
	 * beginsWithUpper("Apple") -> true beginsWithUpper("apple") -> false
	 * =====================================
	 */
	public static boolean beginsWithUpper(String w) {
		return isUpperCase(w.substring(0, 1));
	}

	// begin overload
	public static String stringToPig(String s, boolean handlePunctuation, boolean handleCaps, boolean yAsVowel) {
		// tokenizer
		String[] tokens = s.split(" ");
		String res = "";
		for (String token : tokens) {
			res += wordToPig(token, handlePunctuation, handleCaps, yAsVowel) + " ";
		}
		// remove that piece of trash space at the end
		return res;
	}

	// too bad that java doesn't support default parameter values... makes me cry
	public static String stringToPig(String s, boolean handlePunctuation, boolean handleCaps) {
		return stringToPig(s, handlePunctuation, handleCaps, true);
	}

	public static String stringToPig(String s, boolean handlePunctuation) {
		return stringToPig(s, handlePunctuation, true, true);
	}

	public static String stringToPig(String s) {
		return stringToPig(s, true, true, true);
	}

	public static void main(String[] args) {
		System.out.println(stringToPig("Pigway is funway."));
	} // end main()

} // end class Pig