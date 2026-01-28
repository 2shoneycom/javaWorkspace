package ch02.sec01;

public class Literal {
	public static void main(String[] args) {
		// 리터럴 -> 실제 값 총칭(저장되는 값의 유형을 총칭)
		// 정수/실수/문자/문자열/논리
		// 95;
		int score = 95;
		double average = 88.5;
//		char alpha = "A";
		char beta = 'B';
		boolean result = true;
		
		// 문자열은 기본 타입 아님
		String name = "fuckinShit";
		
		System.out.println("score: " + score);
		System.out.println("average: " + average);
		System.out.println("beta: " + beta);
		System.out.println("result: " + result);
		System.out.println("name: " + name);
	}
}
