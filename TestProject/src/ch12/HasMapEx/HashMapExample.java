package ch12.HasMapEx;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Map<String, String> voca = new HashMap<>();

		boolean isRunning = true;
		while (isRunning) {
			System.out.println("메뉴를 선택하시오 1. 단어 추가 2. 단어 검색 3. 종료");
			int menu = sc.nextInt();
			switch (menu) {
			// 1. 단어 추가
			case 1:
				System.out.println("단어장에 단어를 추가합니다");
				System.out.print("영단어: ");
				String word = sc.next();
				System.out.print("뜻: ");
				String meaning = sc.next();
				voca.put(word, meaning);
				break;

			// 2. 단어 검색
			case 2:
				System.out.println("단어를 검색합니다");
				System.out.print("찾고 싶은 단어는? ");
				String result = voca.get(sc.next());
				if (result != null) {
					System.out.println(result);
				}
				else {
					System.out.println("없는 단어입니다.");
				}
				break;
				
			// 3. 종료
			case 3:
				isRunning = false;
				break;
			
			default:
				System.out.println("잘못된 입력입니다");
				break;
			}
			
		}

		System.out.println("종료합니다...");
		sc.close();
	}

}
