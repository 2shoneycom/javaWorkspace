package ch10;

public class TryCatchMulti {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3 };

		try {
			System.out.println(arr[5]); // 배열 인덱스 접근 오류 가능성
			int value1 = Integer.parseInt("a1"); // 수치 불가능한 data가 올 수 있는 오류 가능성
		} 
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열 인덱스 범위 벗어남");
		}
		catch (NumberFormatException e) {
			System.out.println("수치 불가능한 데이터 오류");
		}
		finally {
			System.out.println("try, catch 문 끝");
		}

		System.out.println("프로그램 종료...");
	}

}
