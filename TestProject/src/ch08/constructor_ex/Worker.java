package ch08.constructor_ex;

public class Worker {
	protected String joominNo, name;
	
	public Worker(String joominNo, String name) {
		this.joominNo = joominNo;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "주민 번호 : " + joominNo + "\n" + "성명 : " + name + "\n";
	}
}
