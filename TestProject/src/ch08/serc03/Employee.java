package ch08.serc03;

public class Employee {
	private String empNo, name, part;
	
	public Employee(String empNo, String name, String part) {
		this.empNo = empNo;
		this.name = name;
		this.part = part;
	}
	
	// Object 클래스에 의해 상속되어지는 toString() 메소드를 재정의
	@Override
	public String toString() {
		
		return empNo + "\t" + name + "\t" + part;
	}
	
	public void showEmpInfo() {
		System.out.println("\n******************************");
		System.out.println("사번: " + empNo);
		System.out.println("성명: " + name);
		System.out.println("부서: " + part);
	}
}
