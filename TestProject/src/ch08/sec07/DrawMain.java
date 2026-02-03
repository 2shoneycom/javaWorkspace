package ch08.sec07;

public class DrawMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DrawingObject myDraw = new Line("red");
		myDraw.draw();
		myDraw = new Circle("blue");
		myDraw.draw();
		myDraw = new Rect("green"); 
		myDraw.draw();
		myDraw = new Poly("black");
		myDraw.draw();
	}

}
