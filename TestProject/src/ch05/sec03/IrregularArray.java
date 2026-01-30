package ch05.sec03;

public class IrregularArray {

	public static void main(String[] args) {
		// 가변 배열 (비 정방형 배열)
		// 각 행마다 열의 개수가 다른 배열
		int[][] a = new int[4][];	// 행수만 결정된 2차원 배열
		
		a[0] = new int[1];
		a[1] = new int[2];
		a[2] = new int[3];
		a[3] = new int[4];
		
		char b[][] = {{'a'},{'b', 'c'}, {'d', 'e', 'f'}};
	}

}
