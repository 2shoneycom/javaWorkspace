package ch06.sec02;

public class Computer {
	public int sum1(int[] values) {
		int sum = 0;
		for (int i = 0; i < values.length; i++) {
			sum += values[i];
		}
		return sum;
	}
	
	// 매개변수의 값의 정수형 리스트 전달
	//... : 전달된 값의 수에 따라 자동으로 배열로 생성?
	int sum2(int ... values) {
		int sum = 0; 
		for (int i = 0; i < values.length; i++) {
			sum += values[i];
		}
		return sum;
	}
}
