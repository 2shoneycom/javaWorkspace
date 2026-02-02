package ch06.sec04;

public class CarThis {
	String model; // <- this.model
	int speed;
	
	CarThis(String model) { // <- model
		this.model = model; 
	}
	
	void setSpeed(int speed) {
		this.speed = speed;
	}
	
	void run() {
		for (int i = 10; i <= 50; i+= 10) {
			this.setSpeed(i);
			System.out.println(this.model + "가 달립니다. (시속: " + this.speed + "km/h)");
		}
	}
	
	void run1() {
		for (int i = 10; i <= 50; i += 10) {
			setSpeed(i);
			System.out.println(this.model + "가 달립니다. (시속: " + this.speed + "km/h)");
		}
	}
}
