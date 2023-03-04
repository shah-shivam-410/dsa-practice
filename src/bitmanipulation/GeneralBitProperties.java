package bitmanipulation;

/**
 * 
 *  x >> y --> right shift operator
 *  depicts x divided by 2, y times.
 *  
 *  x << y --> left shift operator
 *  depicts x multiplied by 2, y times.
 *  
 *  Masking any integer with 1 will return either 1 or 0. --> use and (&)  operator
 *  If it is 0 then input is 'even'.
 *  If it is 1 then input is 'odd'.
 *  
 *  Swapping two integers can be done with xor (^) operator by using 3 times.
 *  p = p ^ q;
 *  q = p ^ q;
 *  p = p ^ q;
 *  
 *  XOR properties:
 *  x ^ x = 0;
 *  x ^ 0 = x
 *  
 */


public class GeneralBitProperties {

	public static void main(String[] args) {

		int a = 10;
		int b = a >> 2;
		int c = a << 2;
		
		int x = 1245343;
		
		int p = 345;
		int q = 2343;
		
		System.out.println(a + " " + b + " " + c);
		
		System.out.println((x & 1) == 1 ? "Odd" : "even");
		
		System.out.println("p:" + p + " q:" + q);
		p = p ^ q;
		q = p ^ q;
		p = p ^ q;
		System.out.println("p:" + p + " q:" + q);
		
	}

}
