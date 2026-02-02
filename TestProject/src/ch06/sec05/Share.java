package ch06.sec05;

public class Share {
	int a;
	static int staticA;
	
	public void set(int n) {
		a += n;
		staticA += n;
	}
	
	public int showA() {
		return a;
	}
	
	public static int showStaticA() {
		return staticA;
	}
}
