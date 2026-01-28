package ch02.sec03;

public class CastingEx {
	public static void main(String[] args) {
		// 강제 형변환 (Casting)
		// (형변환타입)리터럴, (형변환)변수명
		// ()형변환 연산자에 의해 일시적 형변환
		int intValue = 44032;
		char charValue = (char)intValue;
		System.out.println(charValue);
		
		long longValue = 500;
		intValue = (int)longValue;
		System.out.println(intValue);
	}
}
