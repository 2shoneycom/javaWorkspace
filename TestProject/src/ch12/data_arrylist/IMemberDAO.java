package ch12.data_arrylist;
import java.util.List;

// 컨트롤러와 DAO의 중간자 역할을 진행
public interface IMemberDAO {
	// 회원 등록: 1명의 회원 정보를 받아서 DB에 저장
	public void insertMember(MemberDTO dto);
	
	// 회원 정보 삭제: 회원의 아이디(memId)를 통해 DB에서 삭제
	public void deleteMember(String memId);
	
	// 전체 회원 조회: DB(회원테이블)에서 전체 회원 정보 (MemberDTO 가변배열) 반환
	public List<MemberDTO> getAllMember();
	
	// 한 명 회원 정보 조회: memId를 통해 DB에서 검색
	public MemberDTO searchMember(String memId);
	
	// 회원 정보 수정: DB에서 회원 정보 수정
	public void updateMember(MemberDTO dto);
}
