/*
 *
 *	██╗███╗░░██╗███████╗░█████╗░
 *	██║████╗░██║██╔════╝██╔══██╗
 *	██║██╔██╗██║█████╗░░██║░░██║
 *	██║██║╚████║██╔══╝░░██║░░██║
 *	██║██║░╚███║██║░░░░░╚█████╔╝
 *	╚═╝╚═╝░░╚══╝╚═╝░░░░░░╚════╝░
 */

/*
 *	TNPG: NAW FAM | Roster: Alif Rahman, William Vongphanith, Nakib Abedin APCS
 *	pd06 lab00 --Etterbay Odingcay Oughthray Ollaborationcay 2021-11-08 Time
 *	Spent: 1.3 hrs + 0.6hrs for formatting
 *	class Pig a pig latin translator.
 *	What we have done in v0. 
 *	--> Implement ability to control what you want expressed in the pig latin translator: do you want capitalization taken care of? Do you want punctuation to be taken care of? Do you want y to be a vowel?
 *	--> --> Implemented the ability to take care of capitalization
 *	--> --> Implemented the ability to take care of punctualization
 *	--> --> Left implementation of YControl for next class. 
*/

public class Pig {
	private static final String VOWELS = "aeiou";
	private static final String YOWELS = "aeiouy";
	private static final String CAPS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	private static final String PUNCS = ".,:;!?";

	/*
	 */

	/**
	 * hasA: does the given string contain a letter?
	 * 
	 * @param w
	 * @param letter
	 * @return
	 **/
	public static boolean hasA(String w, String letter) {
		return w.indexOf(letter) != -1;
	} // end hasA()

	/**
	 * isAVowel: checks if the letter given is a vowel.
	 * 
	 * @param letter
	 * @return
	 **/
	public static boolean isAVowel(String letter) {
		return VOWELS.indexOf(letter) != -1;
	}

	/**
	 * countVowels: counts the vowels in a given string.
	 * 
	 * @param w
	 * @return
	 **/
	public static int countVowels(String w) {
		return allVowels(w).length();
	}

	/**
	 * hasAVowel: checks if a string has a vowel.
	 * 
	 * @param w
	 * @return
	 **/
	public static boolean hasAVowel(String w) {
		for (String vowel : VOWELS.split("")) {
			if (w.split(vowel, -1).length - 1 >= 1)
				return true;
		}
		return false;
	}

	/**
	 * allVowels: returns string of all vowels in input.
	 * 
	 * @param w
	 * @return
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
	 * firstVowel: returns the first vowel in a string.
	 * 
	 * @param w
	 * @return
	 **/
	public static String firstVowel(String w) {

		String ans = "";

		if (hasAVowel(w)) // Q: Why this necess?
			ans = allVowels(w).substring(0, 1);

		return ans;
	}

	/**
	 * beginsWithVowel: does the word begin with a vowel?
	 * 
	 * @param w
	 * @return
	 **/
	public static boolean beginsWithVowel(String w) {
		return isAVowel(w.substring(0, 1));
	}

	/**
	 * boolToInt: converts false to 0 and true to 1
	 * 
	 * @param in
	 * @return
	 **/
	public static Integer boolToInt(boolean in) {
		// fallback for if true != 1 and false != 0
		return (in == true) ? 1 : 0;
	}

	/**
	 * wordToPig: converts a given WORD to pig latin.
	 * 
	 * @param w
	 * @param handlePunctuation
	 * @param handleCaps
	 * @param yAsVowel
	 * @return
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

	/**
	 * isPunc: checks if given character is punctuation.
	 * 
	 * @param symbol
	 * @return
	 **/
	public static boolean isPunc(String symbol) {
		return PUNCS.indexOf(symbol) != -1;
	}

	/**
	 * isUpperCase: checks if the letter is an uppercase one.
	 * 
	 * @param letter
	 * @return
	 **/
	public static boolean isUpperCase(String letter) {
		return letter == letter.toUpperCase();
	}

	/**
	 * hasPunc: checks if the string has punctuation.
	 * 
	 * @param w
	 * @return
	 **/
	public static boolean hasPunc(String w) {
		String[] letters = w.split("");
		for (String l : letters) {
			if (isPunc(l))
				return true;
		}
		return false;
	}

	/**
	 * puncOnly: return a string of only punctuation from input.
	 * 
	 * @param w
	 * @return
	 **/
	public static String puncOnly(String w) {
		String punctuation = "";
		String[] letters = w.split("");
		for (String l : letters) {
			if (isPunc(l))
				punctuation += l;
		}
		return punctuation;
	}

	/**
	 * lettersOnly: returns string of letters only from input.
	 * 
	 * @param w
	 * @return
	 **/
	public static String lettersOnly(String w) {
		String res = "";
		String[] letters = w.split("");
		for (String l : letters) {
			if (!isPunc(l))
				res += l;
		}
		return res;
	}

	/**
	 * beginsWithUpper: checks if the string is capitalized properly.
	 * 
	 * @param w
	 * @return
	 **/
	public static boolean beginsWithUpper(String w) {
		return isUpperCase(w.substring(0, 1));
	}

	/**
	 * stringToPig: converts a STRING to Pig Latin, splitting into word tokens and
	 * passing to wordToPig()
	 * 
	 * @param s
	 * @param handlePunctuation
	 * @param handleCaps
	 * @param yAsVowel
	 * @return
	 **/
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

	/**
	 * stringToPig: converts a STRING to Pig Latin, splitting into word tokens and
	 * passing to wordToPig()
	 * 
	 * @param s
	 * @param handlePunctuation
	 * @param handleCaps
	 * @return
	 **/
	public static String stringToPig(String s, boolean handlePunctuation, boolean handleCaps) {
		return stringToPig(s, handlePunctuation, handleCaps, true);
	}

	/**
	 * stringToPig: converts a STRING to Pig Latin, splitting into word tokens and
	 * passing to wordToPig()
	 * 
	 * @param s
	 * @param handlePunctuation
	 * @return
	 **/
	public static String stringToPig(String s, boolean handlePunctuation) {
		return stringToPig(s, handlePunctuation, true, true);
	}

	/**
	 * stringToPig: converts a STRING to Pig Latin, splitting into word tokens and
	 * passing to wordToPig()
	 * 
	 * @param s
	 * @return
	 **/
	public static String stringToPig(String s) {
		return stringToPig(s, true, true, true);
	}

	/*
	 * main: test function
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(stringToPig("Pigway is funway."));
		System.out.println(stringToPig("Yeasdkasdjikqjwmnd!!uiasDAQWDcDWEdqqs.....!!"));
	}
}