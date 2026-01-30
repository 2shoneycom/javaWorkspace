package ch06.sec02;

public class SavingsMain {

	public static void main(String[] args) {
		Savings mySave = new Savings();
		
		// 초기 설정
		mySave.setName();
		mySave.setBalance();
		
		// 예금주 이름 출력
		System.out.printf("예금주 : %s\n", mySave.getName());
		// 입금전 잔액 출력
		System.out.printf("입금전 잔액: %d\n", mySave.getBalance());
		
		// 예금액 입력
		mySave.inputDeposit();
		
		// 이자 출력
		System.out.printf("이자 : %d\n", mySave.getInterest());
		// 최종 잔액 출력
		System.out.printf("최종 잔액: %d\n", mySave.getBalance());
	}

}
