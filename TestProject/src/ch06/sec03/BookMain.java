package ch06.sec03;

public class BookMain {
	public static void main(String[] args) {
		Book book1 = new Book();
		Book book2 = new Book("Lemiserable", "Ann", 13000);
		
		System.out.println(book1);
		System.out.println(book2);
	}
}
