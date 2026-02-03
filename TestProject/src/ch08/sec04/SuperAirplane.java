package ch08.sec04;

public class SuperAirplane extends Airplane {
	static final int NORMAL = 1;
	static final int SUPERSONIC = 2;
	
	int flyMode = NORMAL;
	
	@Override
	public void fly() {
		if (flyMode == NORMAL) {
			super.fly();
		}
		else if (flyMode == SUPERSONIC) {
			System.out.println("초음속 비행합니다");
		}
	}
}
