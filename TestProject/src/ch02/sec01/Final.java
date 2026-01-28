package ch02.sec01;

public class Final {

	public static void main(String[] args) {
		// 상수: final 예약어 사용
		// final 데이터타입 상수명;
		final int COUNT = 3;
		
		final float PI = 3.14f;
		double radius = 10.0;
		double circleArea = 0;
		
		circleArea = radius * radius * PI;
		
		System.out.println("원의 면적 = " + circleArea);
	}

}
