package ch10;

public class TryCatch {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3};
		
		try {
			System.out.println(arr[2]);	// 예외 발생
			System.out.println("test");	// 예외 발생 이후는 실행 안됨
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열 인덱스 범위 벗어남");
		}
		finally {
			System.out.println("정상 실행되었습니다");
		}
		
		System.out.println("프로그램 종료...");
	}

}
