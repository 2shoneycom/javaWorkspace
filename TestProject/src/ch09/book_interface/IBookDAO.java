package ch09.book_interface;

import java.util.ArrayList;

public interface IBookDAO {
	
	// 책 정보 DB에 등록
	public void createBookInfo(BookDTO dto);
	
	// bookId를 통해 해당 책 정보 DB에서 삭제
	public void deleteBookInfo(String bookId);
	
	// bookId를 통해 해당 책 정보 검색
	public BookDTO searchBookInfo(String bookId);
	
	// 책 제목을 통해 검색
	public ArrayList<BookDTO> searchBooksByTitle(String bookTitle);
	
	// 저자를 통해 검색
	public ArrayList<BookDTO> searchBooksByAuthor(String author);
}
