package ch09.data_interface;

import java.util.ArrayList;

public class MemberDAO implements IMemberDAO {

	@Override
	public void insertMember(MemberDTO dto) {
		// DB에 저장했다고 가정
		System.out.println("회원가입 성공");
		System.out.println(dto.getMemId() + "\t" + dto.getMemPass() + "\t" + dto.getMemName() + "\t" + dto.getMemPhone()
				+ "\t" + dto.getMemAddress());
	}

	@Override
	public void deleteMember(String memId) {
		// memId로 DB에서 삭제했다고 가정하졍ㅋ
		System.out.println(memId + "의 회원정보가 영구 삭제되었습니다");
	}

	@Override
	public ArrayList<MemberDTO> getAllMember() {
		// DB에서 받은 모든 회원정보를 ArrayList에 넣어서 반환
		return null;
	}

	@Override
	public MemberDTO searchMember(String memId) {
		// DB에서 회원 검색 후 MemeberDTO로 구성 후 반환
		return null;
	}

	@Override
	public void updateMember(MemberDTO dto) {
		// MemberDTO 활용해서 DB 에서 수정
		System.out.println("회원 정보 수정이 완료되었습니다");
	}

}
