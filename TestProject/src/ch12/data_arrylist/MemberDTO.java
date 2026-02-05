package ch12.data_arrylist;

//회원관리 모듈에서 데이터 교환에 사용할 클래스
//MemberDTO 인스턴스 1개가 1명의 회원을 표현
public class MemberDTO {
	private String memId; // key (고유)
	private String memPass;
	private String memName;
	private String memPhone;
	private String memAddress;
	
	public MemberDTO(String memId, String memPass, String memName, String memPhone, String memAddress) {
		this.memId = memId;
		this.memPass = memPass;
		this.memName = memName;
		this.memPhone = memPhone;
		this.memAddress = memAddress;
	}
	
	// private 필드이기 때문에 다른 클래스에서 필드값을 추출하거나 변경 (Getter/Setter)
	public String getMemId() {
		return memId;
	}
	
	public void setMemId(String setValue) {
		this.memId = setValue;
	}

	public String getMemPass() {
		return memPass;
	}

	public void setMemPass(String memPass) {
		this.memPass = memPass;
	}

	public String getMemName() {
		return memName;
	}

	public void setMemName(String memName) {
		this.memName = memName;
	}

	public String getMemPhone() {
		return memPhone;
	}

	public void setMemPhone(String memPhone) {
		this.memPhone = memPhone;
	}

	public String getMemAddress() {
		return memAddress;
	}

	public void setMemAddress(String memAddress) {
		this.memAddress = memAddress;
	}
}
