package ch09.book_interface;

public class BookDTO {
	private String bookId;
	private String bookTitle;
	private String author;
	private int price;
	
	public BookDTO (String bookId, String bookTitle, String author, int price) {
		this.bookId = bookId;
		this.bookTitle = bookTitle;
		this.author = author;
		this.price = price;
	}

	public String getBookId() {
		return bookId;
	}

	public void setBookId(String bookId) {
		this.bookId = bookId;
	}

	public String getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}
