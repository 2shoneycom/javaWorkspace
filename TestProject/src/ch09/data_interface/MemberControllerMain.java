package ch09.data_interface;

import java.util.ArrayList;
import java.util.Scanner;

public class MemberControllerMain {

	public static void main(String[] args) {
		String id, pass, name, phone, address;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("회원정보를 입력합니다");
		System.out.print("id 입력: ");
		id = sc.next();
		System.out.print("password 입력: ");
		pass = sc.next();
		System.out.print("이름 입력: ");
		name = sc.next();
		System.out.print("전화번호 입력: ");
		phone = sc.next();
		System.out.print("주소 입력: ");
		address = sc.next();
		
		// 회원 등록 모듈
		// 1. DTO
		MemberDTO dto = new MemberDTO(id, pass, name, phone, address);
		// 2. DAO
		MemberDAO dao = new MemberDAO();   // 이래도 상관은 없지만
		dao.insertMember(dto);
		IMemberDAO idao = new MemberDAO(); // 인터페이스 타입 사용을 권장
		idao.insertMember(dto);
		
		// 회원 삭제
		System.out.println("회원정보를 삭제합니다");
		System.out.print("id 입력: ");
		id = sc.next();
		idao.deleteMember(id);
		
		// 전체 회원 조회
		System.out.println("전체 회원정보 조회");
		ArrayList<MemberDTO> ar = idao.getAllMember();
		System.out.println(ar);
		
		// 한명 회원 조회
		System.out.println("회원정보를 조회");
		System.out.print("id 입력: ");
		id = sc.next();
		MemberDTO mDTO = idao.searchMember(id);
		System.out.println("mDTO 출력코드");
		
		// 회원 정보 수정
		System.out.println("회원정보를 수정합니다");
		System.out.print("회원 id 입력: ");
		id = sc.next();
		mDTO = idao.searchMember(id);
		System.out.print("id 입력: ");
		id = sc.next();
		System.out.print("password 입력: ");
		pass = sc.next();
		System.out.print("이름 입력: ");
		name = sc.next();
		System.out.print("전화번호 입력: ");
		phone = sc.next();
		System.out.print("주소 입력: ");
		address = sc.next();
		dto = new MemberDTO(id, pass, name, phone, address);
		idao.updateMember(dto);
	}

}
