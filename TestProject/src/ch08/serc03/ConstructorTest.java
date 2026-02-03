package ch08.serc03;

class A {
	public A() {
		System.out.println("기본생성자 A");
	}
}

class B extends A {
	public B(int x) {
		System.out.println("생성자 B " + x);
	}
}

public class ConstructorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b = new B(5);
		
		Employee emp1 = new Employee("1234", "Jack", "Marketing");
		System.out.println(emp1);
	}

}
