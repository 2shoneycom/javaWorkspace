package ch03.sec01;
import java.util.Scanner;

public class CompareOp2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String pass = "1234";
		String userPass = "";
		
		System.out.print("비밀번호 입력: ");
		userPass = sc.next();
		
		// 참조 변수를 비교하는 것은 "서로 담고있는 주소가 같는가?"를 물어보는 것
		if (pass == userPass) {
			System.out.println("PASS");
		}
		else {
			System.out.println("No PASS");
		}
		
		if (pass.equals(userPass)) {
			System.out.println("PASS");
		}
		else {
			System.out.println("No PASS");
		}
		
		sc.close();
	}

}
