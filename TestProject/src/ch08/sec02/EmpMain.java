package ch08.sec02;

import ch08.sub_p.Manager;
import ch08.super_b.Employee;

public class EmpMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager mg = new Manager();
		
		mg.setManager();
		mg.showManagerInfo();
		
		Employee.sc.close();
	}

}
