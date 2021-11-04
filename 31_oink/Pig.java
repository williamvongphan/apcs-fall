public class Pig {
	//Q: How does this initialization make your life easier?
	private static final String[] VOWELS = "aeiou".split("");
	private static final String TEST_STRING_1 = "Let me see your pig latin generator!";
	private static final String TEST_STRING_2 = "This sentence has a lot of vowels! aeiou aeiou.";
	private static final String TEST_STRING_3 = "Ths sntnc hs n vwls! Why?";

	/*=====================================
	  boolean hasA(String,String) -- checks for a letter in a String
	  pre:  w != null, letter.length() == 1
	  post: hasA("cat", "a") -> true
	  hasA("cat", "p")       -> false
	  =====================================*/
	public static boolean hasA(String w, String letter) {
		return w.split(letter, -1).length > 1;
	} //end hasA()


	/*=====================================
	  boolean isAVowel(String) -- tells whether a letter is a vowel
	  precondition: letter.length() == 1
	  =====================================*/
	public static boolean isAVowel(String letter) {
		for (String lp : VOWELS) {
			if (hasA(letter, lp)) return true;
			// return !0;
		}
		return false;
	}


	/*=====================================
	  int countVowels(String) -- counts vowels in a String
	  pre:  w != null
	  post: countVowels("meatball") -> 3
	  =====================================*/
	public static Integer countVowels(String w) {
		Integer ans = 0;
		for (String letter: VOWELS) {
			ans += w.split(letter, -1).length - 1;
		}
		return ans;
	}


	/*=====================================
	  boolean hasAVowel(String) -- tells whether a String has a vowel
	  pre:  w != null
	  post: hasAVowel("cat") -> true
	  hasAVowel("zzz")       -> false
	  =====================================*/
	public static boolean hasAVowel(String w) {
		for (String l: w.split("")) {
			if (isAVowel(l)) {
				return true;
			}
		}
		return false;
	}


	/*=====================================
	  String allVowels(String) -- returns vowels in a String
	  pre:  w != null
	  post: allVowels("meatball") -> "eaa"
	  =====================================*/
	public static String allVowels(String w) {
		String ans = "";
		for (String l: w.split("")) {
			if (isAVowel(l)) {
				ans += l;
			}
		}
		return ans;
	}


	public static void main(String[] args) {
		System.out.println("Does 'Piggy' have a 'y'? " + hasA("Piggy", "y"));
		System.out.println("Does 'Piggy' have a 'g'? " + hasA("Piggy", "g"));
		System.out.println("Does 'Piggy' have a 'n'? " + hasA("Piggy", "n"));

		System.out.println("Is 'a' a vowel? " + isAVowel("a"));
		System.out.println("Is 'e' a vowel? " + isAVowel("e"));
		System.out.println("Is 't' a vowel? " + isAVowel("t"));
		System.out.println("Is 'y' a vowel? " + isAVowel("y"));

		System.out.println("The string 'Let me see your pig latin generator!' has " + countVowels(TEST_STRING_1) + " vowels.");
		System.out.println("The string 'This sentence has a lot of vowels! aeiou aeiou.' has " + countVowels(TEST_STRING_2) + " vowels.");
		System.out.println("Ths sntnc hs n vwls! Why?' has " + countVowels(TEST_STRING_3) + " vowels.");

		System.out.println("The string 'Let me see your pig latin generator!' has a vowel? " + hasAVowel(TEST_STRING_1));
		System.out.println("The string 'This sentence has a lot of vowels! aeiou aeiou.' has a vowel? " + hasAVowel(TEST_STRING_2));
		System.out.println("'Ths sntnc hs n vwls! Why?' has a vowel? " + hasAVowel(TEST_STRING_3));

		System.out.println("The vowels of 'Let me see your pig latin generator!' are '" + allVowels(TEST_STRING_1) + "'");
		System.out.println("The vowels of 'This sentence has a lot of vowels! aeiou aeiou.' are '" + allVowels(TEST_STRING_2) + "'");
		System.out.println("The vowels of 'Ths sntnc hs n vwls! Why?' are '" + allVowels(TEST_STRING_3) + "'");
	} 

} //end class Pig