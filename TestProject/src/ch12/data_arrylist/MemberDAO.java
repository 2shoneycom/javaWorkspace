package ch12.data_arrylist;

import java.util.ArrayList;
import java.util.List;

public class MemberDAO implements IMemberDAO {
	// DB 대신 사용할 저장소
	private List<MemberDTO> listData = new ArrayList<>();

	@Override
	public void insertMember(MemberDTO dto) {
		// 아이디 중복 검사
		// List.stream(): 컬렉션 순회하며 전달된 코드를 처리, Stream<T> 객체가 반환됨 (=forEach 와 비슷하지만 조금 더
		// 많은 기능)
		// Stream.filter(조건) : 반환된 Stream 객체에 대한 조건 연산
		// findFirst(): filter 조건에 맞는 객체가 찾아지면 Optional 객체로 반환
		// Optional.orElse(null): 조건에 맞는 객체가 없으면 null 반환

		String tmpId = dto.getMemId();
		MemberDTO optDto = listData.stream().filter(member -> member.getMemId().equals(tmpId)).findFirst().orElse(null);

		if (optDto != null) {
			System.out.println("회원가입 실패 (ID 중복)");
			return;
		}

		listData.add(dto);
		System.out.println("회원가입 성공");
//		System.out.println(dto.getMemId() + "\t" + dto.getMemPass() + "\t" + dto.getMemName() + "\t" + dto.getMemPhone()
//				+ "\t" + dto.getMemAddress());
	}

	@Override
	public void deleteMember(String memId) {
		// memId 활용해서 db에서 삭제를 위한 코드
		// ArrayList에서 memId값과 동일한 id를 갖고있는 객체를 찾음
		MemberDTO delDto = listData.stream().filter(member -> member.getMemId().equals(memId)).findFirst().orElse(null);
		if (delDto != null) {
			listData.remove(delDto);
			System.out.println("회원정보가 영구 삭제되었습니다");
		} else {
			System.out.println("해당 id의 회원이 없습니다");
		}
	}

	@Override
	public List<MemberDTO> getAllMember() {
		// DB에서 받은 모든 회원정보를 List에 넣어서 반환
		return listData;
	}

	@Override
	public MemberDTO searchMember(String memId) {
		// DB에서 회원 검색 후 MemeberDTO로 구성 후 반환
		MemberDTO resultDto = listData.stream().filter(member -> member.getMemId().equals(memId)).findFirst()
				.orElse(null);
		return resultDto;
	}

	@Override
	public void updateMember(MemberDTO dto) {
		// MemberDTO 활용해서 ArrayList 에서 수정
		// 해당 id의 객체 참조를 추출
		MemberDTO updateDto = listData.stream().filter(member -> member.getMemId().equals(dto.getMemId())).findFirst()
				.orElse(null);
		if (updateDto != null) {
			int idx = listData.indexOf(updateDto); // 수정할 객체의 index값을 반환
			listData.set(idx, dto);
			System.out.println("회원 정보 수정이 완료되었습니다");
		} else {
			System.out.println("회원 정보를 찾을 수 없습니다");
		}
	}

}
