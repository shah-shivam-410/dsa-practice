package strings;

import java.util.Arrays;

/**
 * 
 * 205. Isomorphic Strings https://leetcode.com/problems/isomorphic-strings/
 *
 * Given two strings s and t, determine if they are isomorphic.
 * 
 * Two strings s and t are isomorphic if the characters in s can be replaced to
 * get t.
 * 
 * All occurrences of a character must be replaced with another character while
 * preserving the order of characters. No two characters may map to the same
 * character, but a character may map to itself.
 *
 * Example 1:
 * Input: s = "egg", t = "add" Output: true
 * 
 * Example 2:
 * Input: s = "foo", t = "bar" Output: false 
 * 
 * Example 3:
 * Input: s = "paper", t = "title" Output: true
 * 
 */

public class IsomorphicString {
	
	public static void main(String[] args) {
		System.out.println(isIsomorphic("paper", "title"));
	}
	
	
	public static Boolean isIsomorphic(String s1, String s2) {
		
		if(s1.length() != s2.length())
			return false;
		
		Integer[] arr1 = new Integer[256];
		Arrays.fill(arr1, 0);
		Integer[] arr2 = new Integer[256];
		Arrays.fill(arr2, 0);
		
		for(int i=0; i<s1.length(); i++) {
			arr1[s1.charAt(i)]++;
			arr2[s2.charAt(i)]++;
			if(!arr1[s1.charAt(i)].equals(arr2[s2.charAt(i)]))
				return false;
		}		
		
		return true;
	}

}
