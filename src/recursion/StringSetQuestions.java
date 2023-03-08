package recursion;

public class StringSetQuestions {

	public static void main(String[] args) {
		String s = "abc";
		allPermutation(s, 0, s.length()-1);
	}

	
	/**
	 * Powerset: All possible set of given string.
	 * e.g. abc: "", a, b, c, ab, ac, bc, abc.
	 * @param str
	 */
	public static void powerSet(String str) {
		printPowerSet(str, 0, "");
	}

	public static void printPowerSet(String str, int i, String curr) {
		if(i == str.length()) {
			System.out.println(curr);
			return;
		}
		printPowerSet(str, i+1, curr + str.charAt(i));
		printPowerSet(str, i+1, curr);
	}
	
	/**
	 * Permutation: All possible combination of string by changing character's position.
	 * e.g. abc: abc, acb, bac, bca, cab, cba. 
	 * @param str
	 */
	public static void allPermutation(String str, int low, int high) {
		if(low == high) {
			System.out.println(str);
			return;
		}
		for(int i=low; i<=high; i++) {
			str = swapTwoChar(str, i, low);
			allPermutation(str, low+1, high);
			str = swapTwoChar(str, i, low);
		}
	}
	
	/**
	 * To swap characters at i and j indexes in string st.
	 * @param st
	 * @param i
	 * @param j
	 * @return
	 */
	public static String swapTwoChar(String st, int i, int j) {
		char[] charArray = st.toCharArray();
		char temp = charArray[i];
		charArray[i] = charArray[j];
		charArray[j] = temp;
		return new String(charArray);
	}
	
}
