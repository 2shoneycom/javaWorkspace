package exPackage.game_project.game;

import java.util.Scanner;

public class GaBaBo {
	private static GaBaBo instance = null;

	private GaBaBo() {
	}

	public static GaBaBo getInstance() {
		if (instance == null) {
			instance = new GaBaBo();
		}
		return instance;
	}

	public void startGame() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println();
		System.out.println("           가위바위보 게임");
		System.out.println("가위 바위 보 게임: 1. 가위, 2. 바위, 3. 보");
		
		char isOn = 'y'; // 게임 지속 여부
		while (isOn == 'y') {
			System.out.println("====================================");
			System.out.print("번호 입력:");
			
			// 사용자와 컴퓨터의 선택 입력 받기
			int userSelect = sc.nextInt();
			int cpuSelect = (int)(Math.random() * 3) + 1;
			
			// 승자 판단 및 결과 출력
			switch (getWinner(userSelect, cpuSelect)) {
			case 0:
				System.out.println("비겼습니다!");
				break;
			case 1:
				System.out.println("당신이 이겼습니다^^");
				break;
			case 2:
				System.out.println("당신이 졌습니다 ㅜㅜ");
				break;
			default:
				System.out.print("예상치 못한 오류가 발생했습니다! (승패 판단 오류)");
				break;
			}
			
			// 컴퓨터의 선택 출력
			switch (cpuSelect) {
			case 1:
				System.out.println("컴퓨터는 가위입니다.");
				break;
			case 2:
				System.out.println("컴퓨터는 바위입니다.");
				break;
			case 3:
				System.out.println("컴퓨터는 보입니다.");
				break;
			default:
				System.out.println("예상치 못한 오류가 발생했습니다! (컴퓨터 선택 에러)");
				break;
			}

			// 게임 지속 여부 선택
			System.out.print("계속하시겠습니까? (y): ");
			isOn = sc.next().charAt(0);
		}
		
		System.out.println("게임을 종료합니다.\n");
	}

	private int getWinner(int user, int cpu) {
		if (user == cpu)
			return 0;	// 비기면 0 반환
		
		if (user-cpu == 1 || user-cpu == -2)
			return 1;	// 이기면 1 반환
		
		return 2;	// 졌으면 2 반환
	}
}
