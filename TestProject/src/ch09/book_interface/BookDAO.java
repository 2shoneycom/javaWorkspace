package ch09.book_interface;

import java.util.ArrayList;

public class BookDAO implements IBookDAO {

	@Override
	public void createBookInfo(BookDTO dto) {
		// DB에 책 정보 등록
		System.out.println("책 정보 등록 완료");
		System.out.println(dto.getBookId() + "\t" + dto.getBookTitle() + "\t" + dto.getAuthor() + "\t" + dto.getPrice());
	}

	@Override
	public void deleteBookInfo(String bookId) {
		// DB에서 bookId에 해당하는 책 정보 삭제
		System.out.println(bookId + " 정보 삭제 완료");
	}

	@Override
	public BookDTO searchBookInfo(String bookId) {
		// DB에서 bookId에 해당하는 책 정보 반환
		return null;
	}

	@Override
	public ArrayList<BookDTO> searchBooksByTitle(String bookTitle) {
		// DB에서 책 제목으로 검색하여 나온 책 정보들을 BookDTO로 구성하여 ArrayList에 넣고 반환
		return null;
	}

	@Override
	public ArrayList<BookDTO> searchBooksByAuthor(String author) {
		// DB에서 작가 이름으로 검색하여 나온 책 정보들을 BookDTO로 구성하여 ArrayList에 넣고 반환
		return null;
	}

}
