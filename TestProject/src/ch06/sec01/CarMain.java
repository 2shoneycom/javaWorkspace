package ch06.sec01;

public class CarMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c = new Car();
		Car c1; c1 = new Car();
		Car c2 = new Car();
		
		c.carNo = "11가 1234";
		c1.carNo = "22나 5678";
		c2.carNo = "33다 3333";
		
		c.carMaker = "현대";
		c.carMaker = "기아";
		
		c.showCarInfo();
	}

}
