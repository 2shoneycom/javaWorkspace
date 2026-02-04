package ch11.sec01;

public class NonGenMain {
	
	public static void main (String[] args) {
		Box box = new Box();
		Box box2 = new Box();
		
		box.set("홍길동");
		box2.set(7);
		
		String name = (String)box.get(); // String <- Object : 타입 불일치 (강제 형변환 필요)
		
		int num = (int)box2.get();
	}
	
}
