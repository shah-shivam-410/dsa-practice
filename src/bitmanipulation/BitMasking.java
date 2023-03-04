package bitmanipulation;

/**
 * 
 * i follows - 0 based indexing, so if 4th bit need to manipulate use 3, in general for nth bit n-1;
 * 
 * Mask for (i+1)th bit:
 * 1 << i
 * 
 * Find ith bit in a number: use and (&) operator
 * (a & (1 << i)) != 0 ? 1 : 0;
 * 
 * To set ith bit in a number: use or (|) operator
 * a | (1 << i)
 * 
 * To clear ith bit in a number: use not (~) operator to invert mask and then use and (&) operator
 * a & ~(1 << i)
 * 
 * To return number making least significant bit 0;
 * n & (n-1) 
 * e.g. 100101 -> 100100
 * 
 * 
 * To find number of digits (in decimal) or bits (in binary)
 * = ((int) log n) + 1;
 * base for log will be 2 for binary and 10 for decimal.
 * 
 */

public class BitMasking {

	public static void main(String[] args) {

		Integer a = 13;
		
		System.out.println(Integer.toBinaryString(a));
		
		// To find 7th bit of a;
		Integer ans = (a & (1 << 7)) != 0 ? 1 : 0;
		System.out.println(ans);
		
		// TO invert 4th bit
		ans  = a & ~(1 << 3);
		
		System.out.println(Integer.toBinaryString(ans));
	}

}
