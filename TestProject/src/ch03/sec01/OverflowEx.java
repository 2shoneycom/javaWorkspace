package ch03.sec01;

public class OverflowEx {

	public static void main(String[] args) {
		int x = 1000000;
		int y = 1000000;
		int z = x * y;
		long l = (long)x * (long)y;
		
		System.out.println(z);
		System.out.println(l);
		
		System.out.println(10/0.0);	// Infinity!
		System.out.println(10/0);	// (by zero) error!
		
		System.out.println(10 % 0.0);	// NaN
		System.out.println(10%0);	// (by zero) error!
	}

}
