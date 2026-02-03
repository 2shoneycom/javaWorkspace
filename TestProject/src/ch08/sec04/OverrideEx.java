package ch08.sec04;

public class OverrideEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r = 10;
		Calculator cal = new Calculator();
		System.out.println("원의 넓이 : " + cal.areaCircle(r));
		
		System.out.println();
		
		Computer com = new Computer();
		System.out.println("원의 넓이 : " + com.areaCircle(r));
		
		SuperAirplane sa = new SuperAirplane();
		sa.takeOff();
		sa.fly();
		sa.flyMode = SuperAirplane.SUPERSONIC;
		sa.fly();
		sa.flyMode = SuperAirplane.NORMAL;
		sa.fly();
		sa.land();
	}

}
