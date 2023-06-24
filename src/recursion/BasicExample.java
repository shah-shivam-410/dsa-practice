package recursion;

public class BasicExample {

	public static void main(String[] args) {
//		prin/tHello(10);
//		System.out.println(countOfWays(3, 3));
//		String str = "abba";
//		System.out.println(isPalin(str, 0, str.length()-1));
		printHello(5);
	}
	
	public static void printHello(int n) {
		if(n == 0)
			return;
		System.out.println("Hello " + n);
		printHello(n-1);
	}
	
	public static int countOfWays(int m, int n) {
		if(m == 1 || n == 1)
			return 1;
		return countOfWays(m, n-1) + countOfWays(m-1, n);
	}
	
	public static boolean isPalin(String str, int low, int high) {
		if(low >= high)
			return true;
		if(str.charAt(high) != str.charAt(low))
			return false;
		return isPalin(str, low+1, high-1);
	}
	
}
