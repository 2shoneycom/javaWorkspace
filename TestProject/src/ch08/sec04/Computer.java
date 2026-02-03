package ch08.sec04;

public class Computer extends Calculator {
	@Override
	double areaCircle(double r) {
		System.out.println("Computer 객체 areaCircle 실행");
		return Math.PI*r*r;
	}
}
