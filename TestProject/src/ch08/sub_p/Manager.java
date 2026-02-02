package ch08.sub_p;
import ch08.super_b.Employee;

public class Manager extends Employee {
	private String position; // 직위
	
	public void setManager() {
		setEmployee();
		System.out.print("직위 입력: ");
		position = sc.next();
	}
	
	public void showManagerInfo() {
		showEmpInfo();
		System.out.println("직위 : " + position);
	}
}
