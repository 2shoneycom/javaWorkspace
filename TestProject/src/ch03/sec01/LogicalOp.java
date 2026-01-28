package ch03.sec01;

public class LogicalOp {

	public static void main(String[] args) {
		int charCode = 'A';
		
		System.out.println((charCode >= 65) & (charCode <= 90));
		System.out.println((charCode >= 65) && (charCode <= 90));
		System.out.println(true & true);
		System.out.println(true & false);
		System.out.println(false & true);
		System.out.println(false & false);
		
		if((charCode >= 65) && (charCode <= 90)) {
			System.out.println("대문자입니다");
		}
		
		if((charCode >= 97) && (charCode <= 122)) {
			System.out.println("소문자입니다");
		}
		
		// (charCode >= 48) && (charCode <= 57)
		if(!(charCode < 48) && !(charCode > 57)) {
			System.out.println("숫자입니다");
		}
		
		int value = 6;
		if ((value % 2 == 0) | (value % 3 == 0)) {
			System.out.println("2 또는 3의 배수");
		}
	}

}
