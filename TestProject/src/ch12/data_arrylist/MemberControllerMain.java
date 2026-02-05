package ch12.data_arrylist;

import java.util.List;
import java.util.Scanner;

public class MemberControllerMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String id, pass, name, phone, address;
		IMemberDAO idao = new MemberDAO(); // 인터페이스 타입 사용을 권장

		boolean isRunning = true; // 프로그램 계속 실행 여부
		while (isRunning) {
			System.out.println("메뉴를 선택해주세요");
			System.out.println("1. 회원 가입 2. 회원 탈퇴 3. 전체 회원 조회 4. 개인 회원 조회 5. 회원 정보 수정 6. 종료");
			int menu = sc.nextInt();

			switch (menu) {
			// 회원 가입
			case 1:
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
				
				MemberDTO dto = new MemberDTO(id, pass, name, phone, address);
				idao.insertMember(dto);
				break;
				
			// 2. 회원 탈퇴
			case 2:
				System.out.print("id 입력: ");
				id = sc.next();
				idao.deleteMember(id);
				break;
				
			// 3. 전체 회원 조회
			case 3:
				System.out.println("전체 회원정보 조회");
				List<MemberDTO> ar = idao.getAllMember();
				if (ar.size() == 0) {
					System.out.println("조회할 회원이 없습니다.");
				}
				else {
					for (int i = 0; i < ar.size(); i++) {
						System.out.println((i+1) + ". " + ar.get(i).getMemName() + "님");
					}
				}
				break;
				
			// 4. 개인 회원 조회
			case 4:
				System.out.println("회원정보를 조회");
				System.out.print("id 입력: ");
				id = sc.next();
				MemberDTO mDTO = idao.searchMember(id);
				if(mDTO == null) {
					System.out.println("입력하신 id에 해당하는 회원이 존재하지 않습니다");
				}
				else {
					System.out.println("조회 성공!");
					System.out.println(mDTO.getMemName() + "\t" + mDTO.getMemPhone() + "\t" + mDTO.getMemAddress());
				}
				break;
				
			// 5. 회원 정보 수정
			case 5:
				System.out.println("회원정보를 수정합니다");
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
				break;
				
			// 6. 종료
			case 6:
				isRunning = false;
				break;
			default:
				System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
				break;
			}
		}
		
		System.out.println("프로그램을 종료합니다. 이용해주셔서 감사합니다");
	}

}
