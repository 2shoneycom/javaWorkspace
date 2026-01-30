package ch06.sec02;

public class Calculator {
	void powerOn() {
		System.out.println("전원을 켭니다");
	}
	
	int plus(int x, int y) {
		return x + y;
	}
	
	double divide (int x, int y) {
		return (double) x / (double) y;
	}
	
	void powerOff() {
		System.out.println("전원을 끕니다"); 
	}
	
	public static void main(String[] args) {
		Calculator myCalc = new Calculator();
		myCalc.powerOn();
		
		int result1 = myCalc.plus(5, 10);
		
		System.out.println(myCalc.plus(5, 10));
		
		byte x = 10; byte y = 4;
		double result2 = myCalc.divide(x,  y);
		System.out.println(result1 + result2);
		
		myCalc.powerOff();
	}
}
