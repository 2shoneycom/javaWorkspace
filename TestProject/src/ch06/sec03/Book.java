package ch06.sec03;

public class Book {
	String title;
	String author;
	int price;
	
	public Book() {
//		title = "미정";
//		author = "미정";
//		price = 0;
		this("미정", "미정", 0);	// this()는 클래스내의 다른 생성자 호출
	}
	
	public Book(String t, String a, int p) {
		title = t;
		author = a;
		price = p;
	}
	
	public void getBook() {
		
	}
}
