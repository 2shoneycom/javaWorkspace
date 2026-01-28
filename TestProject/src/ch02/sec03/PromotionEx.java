package ch02.sec03;

public class PromotionEx {

	public static void main(String[] args) {
		// 자동 형변환: 작은 타입의 data가 큰 타입 변수로 저장되는 경우
		// java가 실행 중에 자동으로 진행함
		byte byteValue = 10;
		int intValue = byteValue;
		System.out.println(intValue);
		
		char charValue = '가';
		intValue = charValue;
		System.out.println("가의 유니코드: " + intValue);
	}

}
