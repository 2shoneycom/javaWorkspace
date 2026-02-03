package ch08.sec07;

public class Circle extends DrawingObject {
	public Circle (String color) {
		super(color);
	}
	
	@Override
	public void draw() {
		System.out.println(penColor + "색상으로 원 그리기");
	}
}
