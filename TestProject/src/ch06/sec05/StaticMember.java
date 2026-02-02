package ch06.sec05;

public class StaticMember {
	public static int staticVal;
	public int num;
	
	public void getNum(int x) {
		num = x; 			// 인스턴스 멤버 사용 가능
		staticVal = x; 		// static 멤버 사용 가능
		staticMethod(x);	// static 메소드 사용 가능
	}
	
	public static void staticMethod(int x) {
//		num = x; 		// 인스턴스 멤버 사용 불가능
		staticVal = x; 	// static 멤버 사용 가능
		
//		getNum(x); 		// 인스턴스 메소드 사용 불가능
		f1();			// static 메소드 사용 가능
	}
	
	public static void f1() {
		// 이건 가능
		StaticMember test = new StaticMember();
		test.getNum(0);
	}
}
