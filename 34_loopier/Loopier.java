import java.util.*;

public class Loopier {
	public static int[] slice (int[] array, int begin, int end) {
		int[] ans = new int[end - begin];
		for (int idx = begin; idx < end; idx++ ) {
			ans[idx - begin] = array[idx];
		}
		
	}
	
	public static int[] init (int[] array) {
		int l = array.length;
		for (int x = 0; x < l; x++) {
			array[x] = (int) (Math.random() * 69420);
		}
		return array;
	}
	
	public static String toString (int[] array) {
		String ans = "[";
		int l = array.length;
		for (int x = 0; x < l; x++) {
			int b = array[x];
			ans += Integer.toString(b);
			if (!(x == l - 1)) {
				ans += ", ";
			}
		}
		ans += "]";
		return ans;
	}
	
	public static int linSearch (int[] array, int target) {
		int l = array.length;
		for (int x = 0; x < l; x++) {
			if (array[x] == target) {
				return x;
			}
		}
		return -1;
	}
	
	public static int linSearchR (int[] array, int target) {
		if (array[0] == target) {
			return 0;
		}	
		else {
			if (array.length == 1) {
				return -1;
			}
			else {
				array = slice(array, 1);
				return linSearchR(array, target);
			}
		}
	}
	
	public static void main (String[] args) {
		int[] test = new int[3];
		
		System.out.println(toString(init(test)));	
		
		int[] test1 = {5, 7, 9, 11};
		
		System.out.println(linSearchR(test1, 11));
	}
}
