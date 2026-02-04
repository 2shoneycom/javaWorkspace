package ch11.sec05;

// sub 클래스에서 super클래스의 타입파라미터를 표기해야함
public class ChildProduct<T, M, C> extends Product<T, M> {
	private C company;

	public C getCompany() {
		return company;
	}

	public void setCompany(C company) {
		this.company = company;
	}
}
