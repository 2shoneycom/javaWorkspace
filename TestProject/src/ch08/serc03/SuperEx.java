package ch08.serc03;

class Super {
	int x, y;
	
	public Super() {
		x = 50;
		y = 5;
	}
}

class Sub extends Super {
	int x, y;
	
	public Sub() {
		x = 10;
		y = 15;
	}
	public void show() {
		System.out.println("x : " + x); // 내 객체 x 출력
		System.out.println("super.x : " + super.x);
		System.out.println("this.y : " + this.y);
	}
}

public class SuperEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sub sub = new Sub();
		
		sub.show();
	}

}
