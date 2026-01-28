package ch03.sec01;
import java.util.*;
import java.text.DecimalFormat;

public class ArithmeticOp {

	public static void main(String[] args) {
		System.out.println("나머지 : " + 10%3);
		
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat();
		
		int kor, eng, math, total;
		float average;
		
		System.out.print("국어 점수 입력: ");
		kor = sc.nextInt();
		System.out.print("영어 점수 입력: ");
		eng = sc.nextInt();
		System.out.print("수학 점수 입력: ");
		math = sc.nextInt();
		
		total = kor + eng + math;
		average = (float)total/3;
		
		System.out.println("평균: " + average);
		
		sc.close();
	}

}
