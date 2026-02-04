package ch11.sec04;

public class Util {
	public static <T> Box<T> boxing(T t) {
		Box<T> box = new Box<T>();
		box.set(t);
		return box;
	}
	
	public static <T> T anyFunc(T t) {
		T ret = t;
		return ret;
	}
}
