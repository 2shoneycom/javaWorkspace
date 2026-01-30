package ch05.sec03;

public class Array2D {

	public static void main(String[] args) {
		int[][] a = new int[3][4];

		int[][] a1 = {{1, 2, 3, 4},{5, 6, 7, 8},{9, 10, 11, 12}};
		
		char[][] b = {{'a', 'b', 'c'}, {'d', 'e', 'f'}};
		
		int[][] score = {
				{100, 100, 100},
				{20, 20, 20},
				{30, 30, 30},
				{40, 40, 40},
				{50, 50, 50},
		};
		
		System.out.println(score[0][0]);
		System.out.println(score.length);
		System.out.println(score[0].length);
		System.out.println(score[0]);
		System.out.println(score);
	}

}
