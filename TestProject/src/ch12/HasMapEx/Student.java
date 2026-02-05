package ch12.HasMapEx;

public class Student {
	private String stdNo;
	private String stdName;

	public Student(String stdNo, String stdName) {
		super();
		this.stdNo = stdNo;
		this.stdName = stdName;
	}

	public String getStdNo() {
		return stdNo;
	}

	public void setStdNo(String stdNo) {
		this.stdNo = stdNo;
	}

	public String getStdName() {
		return stdName;
	}

	public void setStdName(String stdName) {
		this.stdName = stdName;
	}
	
	@Override
	public int hashCode() {
		System.out.println(stdNo.hashCode() + stdName.hashCode());
		return stdNo.hashCode() + stdName.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			Student student = (Student)obj;
			return (stdNo.equals(student.stdNo)) && (stdName.equals(student.stdName));
		} else {
			return false;
		}
	}
}
