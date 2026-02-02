package ch06.sec06;

public class Singleton {
	public static Singleton instance = new Singleton();
	
	// 외부에서 생성자 호출하는 것을 막음
	private Singleton() {}
	
//	public static Singleton getInstance() {
//		if (instance == null) {
//			instance = new Singleton();
//		}
//		return instance;
//	}
	
	public void printHash() {
		System.out.println(instance);
	}
}
