package ch05.sec04;
import java.util.Calendar;

public class EnumWeekEx {

	public static void main(String[] args) {
		// 열거 타입 사용 예시
		Week today = null;
		
		// Calendar 클래스는 Instance를 생성하는 getInstance 메소드를 제공함
		Calendar cal = Calendar.getInstance();
//		System.out.println(cal.get(Calendar.DAY_OF_WEEK)); // 현재 요일 정수로 반환
		int week = cal.get(Calendar.DAY_OF_WEEK);
		
		switch (week) {
		case 1:
			today = Week.SUNDAY;
			break;
		case 2:
			today = Week.MONDAY;
			break;
		case 3:
			today = Week.TUESDAY;
			break;
		case 4:
			today = Week.WEDNESDAY;
			break;
		case 5:
			today = Week.THURSDAY;
			break;
		case 6:
			today = Week.FRIDAY;
			break;
		case 7:
			today = Week.SATURDAY;
			break;
		}
		
		System.out.println("오늘 요일: " + today);
		
		if (today == Week.SUNDAY)
			System.out.println("일요일에는 축구를 합니다");
		else
			System.out.println("열심히 공부합시다");
		
		today = Week.SUNDAY;
		String name = today.name();
		System.out.println(name);
		
		int ordinal = today.ordinal();
		System.out.println(ordinal);	// 순번은 0부터 시작
	}

}
