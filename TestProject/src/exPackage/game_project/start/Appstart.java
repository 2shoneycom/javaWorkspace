package exPackage.game_project.start;
import java.util.Scanner;

import exPackage.game_project.game.GaBaBo;
import exPackage.game_project.game.Guess;
import exPackage.game_project.info.AppInfo;

public class Appstart {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("**************************************");
		System.out.println("    ⭐⭐게임에 오신 것을 환영합니다^^️");
		System.out.println("**************************************");
		
		boolean isOn = true;
		while (isOn) {
			System.out.println("           메뉴");
			System.out.println("--------------------------------------");
			System.out.println("1. 애플리케이션 정보");
			System.out.println("2. 가위바위보 게임");
			System.out.println("3. 숫자 알아맞히기 게임");
			System.out.println("4. 종료");
			System.out.println("--------------------------------------");
			System.out.print("메뉴 번호 입력: ");
			
			int select = sc.nextInt();
			switch (select) {
			case 1:
				AppInfo.getInstance().showInfo();
				break;
			case 2:
				GaBaBo.getInstance().startGame();
				break;
			case 3:
				Guess.getInstance().startGame();
				break;
			case 4:
				isOn = false;
				break;
			default:
				System.out.println("\n번호를 잘못 입력하셨습니다!\n");
				break;
			}
		}
		
		System.out.println();
		System.out.println("**************************************");
		System.out.println("             종료합니다!");
		System.out.println("**************************************");
		sc.close();
	}
}
