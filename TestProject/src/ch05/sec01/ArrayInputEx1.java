package ch05.sec01;
import java.util.Scanner;

public class ArrayInputEx1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] nums = new int[5];
		
		// 1. 값 입력 받아서 저장하기
		System.out.println("숫자 입력");
		for (int i = 0; i < nums.length; i++) {
			System.out.printf("num[%d] : ", i);
			nums[i] = sc.nextInt();
		}
		
		// 2. 입력된 값 활용하여 최댓값 구하기
		int max = -99999999;
		
		System.out.print("\n입력된 값 : ");
		for (int i = 0; i < nums.length; i++) {
			System.out.printf("%d ", nums[i]);
			if (nums[i] > max) {
				max = nums[i];
			}
		}
		
		System.out.printf("\n최대값 : %d\n", max);
	}

}
