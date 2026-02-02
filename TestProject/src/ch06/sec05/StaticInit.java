package ch06.sec05;

public class StaticInit {
	// 인스턴스 멤버
	int a;
	void method() {}
	
	// static 멤버
	static int staticA;
	static void staticMethod() {
//		this.a = 10; // static 메소드 내 this 사용 불가
	}
	
	// static 초기화 블록
	static {
//		a = 1;
//		method();
		
		staticA = 10;
		staticMethod();
		
		StaticInit st = new StaticInit();
		st.a = 10;
	}
}
