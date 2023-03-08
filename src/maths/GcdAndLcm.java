package maths;

public class GcdAndLcm {

	public static void main(String[] args) {
		System.out.println(gcd(24, 60));
		System.out.println(lcm(24, 60));
	}
	
	static Integer gcd(Integer a, Integer b) {
		if(b == 0) return a;
		return gcd(b, a % b);
	}
	
	static Integer lcm(Integer a, Integer b) {
		return (a * b) / gcd(a, b);
	}
	
}
