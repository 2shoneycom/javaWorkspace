package ch05.sec01;

public class StringEx {

	public static void main(String[] args) {
		// String 변수 (참조 변수)
		String name1 = "홍길동";
		String name2 = "홍길동";
		
		System.out.println("name1 name2는 동일 객체를 참조하는가: " + (name1 == name2));
		
		String name3 = new String("홍길동");
		String name4 = new String("홍길동");
		
		System.out.println("name3 name4는 동일 객체를 참조하는가: " + (name3 == name4));
	}

}
