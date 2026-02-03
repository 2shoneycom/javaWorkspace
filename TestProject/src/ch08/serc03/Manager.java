package ch08.serc03;
import ch08.serc03.Employee;

public class Manager extends Employee {
	private String position; // 직위
	
	public Manager(String empNo, String name, String part, String position) {
		super(empNo, name, part);
		this.position = position;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\t" + position;
	}
}
