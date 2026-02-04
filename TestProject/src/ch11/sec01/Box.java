package ch11.sec01;

public class Box {
	// Object -> 모든 타입을 표현하는 타입(객체)
	private Object object;
	
	public void set(Object object) {
		this.object = object;
	}
	
	public Object get() {
		return object;
	}
}
