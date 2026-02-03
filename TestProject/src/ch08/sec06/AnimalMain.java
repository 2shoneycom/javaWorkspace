package ch08.sec06;

public class AnimalMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a = new Animal();
		a.sound();
		
		Cat c = new Cat();
		c.sound();
		
		Dog d = new Dog();
		d.sound();
		
		a = c;
		a.show();
		a.sound();
//		a.catMethod();
		
		((Cat)a).catMethod();
	}

}
