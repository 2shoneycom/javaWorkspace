package ch09.book_interface;

import java.util.ArrayList;
import java.util.Scanner;

public class BookMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String bookId, title, author;
		int price;

		// 새로운 책 정보 DTO 생성
		System.out.println("책 정보를 입력해주세요");
		System.out.print("책 고유 번호 입력: ");
		bookId = sc.next();
		System.out.print("책 제목 입력: ");
		title = sc.next();
		System.out.print("책 저자 입력: ");
		author = sc.next();
		System.out.print("책 가격 입력: ");
		price = sc.nextInt();

		BookDTO dto = new BookDTO(bookId, title, author, price);

		// DAO 객체 생성
		IBookDAO iDAO = new BookDAO();

		// 1. 책 정보 등록
		System.out.println("책 정보를 등록합니다");
		iDAO.createBookInfo(dto);

		// 2. 책 정보 삭제
		System.out.println("책 정보를 삭제합니다");
		iDAO.deleteBookInfo(dto.getBookId());

		// 3. 책 정보 검색 (ID)
		System.out.println("책 정보 검색 (ID)");
		BookDTO resultDTO = iDAO.searchBookInfo(dto.getBookId());

		// 4. 책 정보 검색 (제목)
		System.out.println("책 정보 검색 (제목)");
		ArrayList<BookDTO> ar = iDAO.searchBooksByTitle(dto.getBookTitle());

		// 5. 책 정보 검색 (저자)
		System.out.println("책 정보 검색 (저자)");
		ar = iDAO.searchBooksByTitle(dto.getBookTitle());

		sc.close();
	}

}
