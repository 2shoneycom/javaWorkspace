package ch06.sec02;

public class ComputerMain {

	public static void main(String[] args) {
		Computer myCom = new Computer();
		
		int[] values1 = {1, 2, 3};
		
		System.out.println(myCom.sum1(values1));
		
		System.out.println(myCom.sum2(1, 2, 3));
		System.out.println(myCom.sum2(1, 2));
		System.out.println(myCom.sum2(1, 2, 3, 4, 5));
		
		System.out.println(myCom.sum2(values1));
	}

}
