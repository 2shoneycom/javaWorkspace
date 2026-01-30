package ch05.sec03;
import java.util.Scanner;

public class Array2DEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[][] answer = {
				{"chair", "의자"},
				{"computer", "컴퓨터"},
				{"integer", "정수"}
		};

		for (int i = 0; i < 3; i++) {
			System.out.printf("Q%d. %s의 뜻은 : ", i+1, answer[i][0]);
			String uInput = sc.next();
			
			if (uInput.equals(answer[i][1])) {
				System.out.println("정답입니다.\n");
			}
			else {
				System.out.printf("틀렸습니다. 정답은 %s입니다.\n\n", answer[i][1]);
			}
		}
	}

}
