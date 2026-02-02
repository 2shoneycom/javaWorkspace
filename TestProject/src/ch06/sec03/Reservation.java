package ch06.sec03;

public class Reservation {
	String flight, name, departure, arrival, seatNo;
	int price;
	
	public Reservation() {

	}
	
	public Reservation(String f1, String na, String dpt, String arv, int p, String s) {
		flight = f1;
		name = na;
		departure = dpt;
		arrival = arv;
		price = p;
		seatNo = s;
	}
	
	public void showRsvInfo() {
		System.out.println("**항공권 예약 정보**");
		System.out.println("항공기: " + flight);
		System.out.println("예약자: " + name);
		System.out.println("출발지: " + departure);
		System.out.println("도착지: " + arrival);
		System.out.println("금액: " + price);
		System.out.println("좌석번호: " + seatNo);
	}
}
