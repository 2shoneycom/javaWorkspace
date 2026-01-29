package ch05.sec01;
import java.util.Scanner;

public class ArrayInput2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] nums = new String[5];
		
		System.out.println("이름 입력: ");
		for(int i = 0; i < nums.length; i++) {
			System.out.printf("nums[%d] : ", i);
			nums[i] = sc.next();
		}
		
		System.out.println("\n입력된 값 출력");
		for(int i = 0; i < nums.length; i++) {
			System.out.printf("nums[%d] = %s%n ", i, nums[i]);
		}
		
		sc.close();
	}

}
