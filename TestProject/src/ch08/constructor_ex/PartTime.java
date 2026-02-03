package ch08.constructor_ex;

public class PartTime extends Worker {
	int hours, unitPrice;
	
	public PartTime (String joominNo, String name, int hours, int unitPrice) {
		super(joominNo, name);
		this.hours = hours;
		this.unitPrice = unitPrice;
	}
	
	@Override
	public String toString() {
		return super.toString() + "시급 : " + unitPrice + " 원\n" + "근무시간 : " + hours + " 시간\n" + "총지불액 : " + calculatePay() + " 원\n";
	}
	
	private int calculatePay() {
		return hours * unitPrice;
	}
}
