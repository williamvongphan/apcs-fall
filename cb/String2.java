public class String2 {
	public String doubleChar(String str) {
	  	String c = "";
		int a = str.length();
		for (int b = 0; b < a; b++) {
			c += str.substring(b, b+1);
			c += str.substring(b, b+1);
		}
		return c;
	}
	
	public int countHi(String str) {
  		return str.split("hi", -1).length - 1;
	}

	public boolean catDog(String str) {
  		// couldn't resist hahaha
  		return (str.split("cat", -1).length == str.split("dog", -1).length);
	}
	
	public int countCode(String str) {
		String[] letters = "abcdefghijklmnopqrstuvwxyz".split("");
		int sum = 0;
		for (int a = 0; a < 26; a++) {
			sum += str.split("co" + letters[a] + "e", -1).length - 1;
		}
		return sum;
	}

	public boolean endOther(String a, String b) {
  // no loops!
		a = a.toLowerCase();
		b = b.toLowerCase();
		int c = a.length();
		int d = b.length();
		int e = d;
		boolean f = false;
		if (c < d) {
			e = c;
			f = true;
		}
		if (f == true) {
			return a.substring(c - e, c).equals(b.substring(d - e, d));
		}
		if (f == false) {
			return b.substring(d - e, d).equals(a.substring(c - e, c));
		}
		return false;
	}
	
	public boolean xyzThere(String str) {
  		return str.split("xyz", -1).length > str.split(".xyz", -1).length ? true : false;
	}

}
