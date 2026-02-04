package ch12;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<String> list = new ArrayList<>();
		
		for (int i = 0; i < 4; i++) {
			System.out.print("단어를 입력하세요>>");
			list.add(sc.next());
		}
		System.out.println("------------------------------"); 
		
		int maxLenIndex = 0;
		for (int i = 0; i < list.size(); i++) {
			// 단어 출력
			System.out.print(list.get(i) + " ");
			
			// 가장 긴 단어 고르기
			if (list.get(i).length() > list.get(maxLenIndex).length()) {
				maxLenIndex = i;
			}
		}
		System.out.println();
		System.out.println("가장 긴 단어는 : " + list.get(maxLenIndex));
		System.out.println("가장 긴 단어의 길이는 : " + list.get(maxLenIndex).length());
		
		sc.close();
	}

}
