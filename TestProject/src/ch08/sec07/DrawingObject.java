package ch08.sec07;

public abstract class DrawingObject {
	public String penColor;
	
	public DrawingObject (String color) {
		penColor = color;
	}
	
	public abstract void draw();
}
