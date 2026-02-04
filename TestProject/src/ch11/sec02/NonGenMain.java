package ch11.sec02;

public class NonGenMain {
	
	public static void main (String[] args) {
		Box<String> box = new Box<String>();
		Box<Integer> box2 = new Box<Integer>();
		
		box.set("홍길동");
		box2.set(7);
		
		String name = box.get(); // String <- Object : 타입 불일치 (강제 형변환 필요)
		
		int num = box2.get();
	}
	
}
