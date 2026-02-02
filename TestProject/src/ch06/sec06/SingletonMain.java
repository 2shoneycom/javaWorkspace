package ch06.sec06;

public class SingletonMain {

	public static void main(String[] args) {
		Singleton s1 = Singleton.instance;
		Singleton s2 = Singleton.instance;
		
		s1.printHash();
		s2.printHash();
		Singleton.instance.printHash();
		
		s1 = null;
//		s1.printHash();
		s2.printHash();
		Singleton.instance.printHash();
		Singleton.instance = null;
	}

}
