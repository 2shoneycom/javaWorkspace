package ch06.sec01;
import java.util.Scanner;

public class Student {
	private String stdNo;
	private String stdName;
	private int year;
	private int score;
	
	public void inputStdInfo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("****학생 정보 입력****");
		System.out.print("학번 : "); stdNo = sc.next();
		System.out.print("성명 : "); stdName = sc.next();
		System.out.print("학년 : "); year = sc.nextInt();
		System.out.print("점수 : "); score = sc.nextInt();
		sc.close();
	}
	
	public void showStdInfo() {
		System.out.println("***학생 정보 출력****");
		System.out.printf("학번 : %s\n", stdNo);
		System.out.printf("성명 : %s\n", stdName);
		System.out.printf("학년 : %d\n", year);
		System.out.printf("점수 : %d\n", score);
	}
}
