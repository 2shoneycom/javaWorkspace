package ch11.sec04;

public class GenMethodEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box<Integer> box = Util.<Integer>boxing(100);
		int value = box.get();
		
		Box<String> box2 = Util.boxing("홍길동"); 
		String name = box2.get();
		
		System.out.println(Util.<Integer>anyFunc(10));
		System.out.println(Util.anyFunc("zz"));
	}

}
