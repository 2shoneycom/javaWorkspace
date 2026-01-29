package ch05.sec02;
import java.util.Scanner;

public class ControlEx2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int balance = 0;
		
		boolean running = true;
		while (running) {
			System.out.println("--------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료 ");
			System.out.println("--------------------------------");
		
			System.out.print("선택>");
			int select = sc.nextInt();
			
			switch (select) {
			case 1:
				System.out.print("예금액>");
				int deposit = sc.nextInt();
				
				if (deposit < 0) {
					System.out.println("잘못된 금액을 입력하셨습니다");
					continue;
				}
				
				balance += deposit;
				break;
			case 2:
				System.out.print("출금액>");
				int withdraw = sc.nextInt();
				
				if (withdraw < 0) {
					System.out.println("잘못된 금액을 입력하셨습니다");
					continue;
				}
				else if (withdraw > balance) {
					System.out.println("잔액이 부족합니다");
					continue;
				}
				
				balance -= withdraw;
				break;
			case 3:
				System.out.printf("잔고>%d\n", balance);
				break;
			case 4:
				System.out.println("\n프로그램 종료");
				running = false;
				break;
			default:
				break;
			}
			
			System.out.println();
		}

	}

}
