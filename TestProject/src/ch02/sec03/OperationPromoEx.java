package ch02.sec03;

public class OperationPromoEx {

	public static void main(String[] args) {
		// 연산 중 발생하는 자동 형변환
		byte byteValue1 = 10;
		byte byteValue2 = 20;
		
//		byte byteValue3 = byteValue1 + byteValue2; (에러) + 는 int 연산자임
		// 즉, byteValue1과 byteValue2는 자동으로 '+ 연산자'에 의해 int로 형변환됨
		
		int intValue = byteValue1 + byteValue2;
		System.out.println(intValue);
		
		char charValue1 = 'A';
		char charValue2 = 1;
		int intValue2 = charValue1 + charValue2;
		System.out.println((char)intValue2);
		
		int intValue3 = 3;
		int intValue4 = 4;
		System.out.println(intValue4);
		
		double doubleValue = intValue3/4.0;	// 정수/실수 => 실수/실수 => 실수
		System.out.println(doubleValue);
	}

}
