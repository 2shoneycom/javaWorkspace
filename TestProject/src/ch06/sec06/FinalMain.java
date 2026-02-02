package ch06.sec06;

public class FinalMain {
	public static void main(String[] args) {
		Final f1 = new Final("홍길", "1234");
		f1.name = "김길동";
//		f1.ssn = "5678" // 대입(값 변경) 불가
		
		System.out.print(f1.nation);
	}
}
