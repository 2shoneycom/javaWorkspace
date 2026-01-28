package ch03.sec01;
import java.util.Scanner;

public class TimeCalculation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int userSec = -1;
		
		System.out.print("시간 입력 (초): ");
		userSec = sc.nextInt();

		// 예외 처리
		if (userSec < 0) {
			System.out.println("시간을 잘못 입력하였습니다.");
			return;
		}
		
		int hour = userSec / 3600;
		int min = userSec % 3600 / 60;
		int sec = userSec % 60;
		
		System.out.println(userSec + "초는 " + hour + "시간, " + min + "분, " + sec + "초입니다.");
	}

}
