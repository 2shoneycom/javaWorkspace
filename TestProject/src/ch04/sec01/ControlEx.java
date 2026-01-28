package ch04.sec01;
import java.util.Scanner;

public class ControlEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("******* 상품 정보 *******");
		System.out.println("1 노트북: 1,200,000 원");
		System.out.println("2 디지털카메라: 400,000 원");
		System.out.println("***********************");
		
		System.out.print("상품번호 입력: ");
		int order = sc.nextInt();
		int amount, total, discount;
		
		switch(order) {
		case 1:
			System.out.print("주문 수량 입력: ");
			amount = sc.nextInt();
			total = 1_200_000 * amount;
			break;
		case 2:
			System.out.print("주문 수량 입력: ");
			amount = sc.nextInt();
			total = 400_000 * amount;
			break;
		default:
			System.out.println("잘못 입력하였습니다. 종료합니다.");
			return;
		}
		
		discount = 0;
		if (total >= 1_000_000) {
			discount = (int) (total * 0.1);
		}
		else if (total >= 500_000) {
			discount = (int) (total * 0.05);
		}
		
		System.out.println("******* 주문 내용 *******");
		System.out.print("상품명 : ");
		System.out.println((order == 1) ? "노트북" : "디지털카메라");
		System.out.print("가격 : ");
		System.out.println((order == 1) ? "1200000 원" : "400000 원");
		System.out.println("주문 수량 : " + amount + " 개");
		System.out.println("주문액 : " + total + " 원");
		System.out.println("할인액 : " + discount + " 원");
		System.out.println("총지불액 : " + (total - discount) + " 원");
	}

}
