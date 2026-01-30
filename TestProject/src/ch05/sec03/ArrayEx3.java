package ch05.sec03;

public class ArrayEx3 {

	public static void main(String[] args) {
		int[] count = new int[10];

		for (int i = 0; i < 10; i++) {
			// 0 ~ 9 사이의 난수 발생
			int num = (int)(Math.random() * 10);
			count[num]++;
			System.out.print(num);
		}
		System.out.println();
		
		for (int i = 0; i < 10; i++) {
			System.out.printf("%d의 개수 :%d\n", i, count[i]);
		}
	}

}
