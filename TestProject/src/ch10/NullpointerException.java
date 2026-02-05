package ch10;

public class NullpointerException {

	public static void main(String[] args) {
		// 참조하는 객체가 없는 참조변수(null)에 . 연산자 사용한 경우 발생
		String data = null;
		System.out.println(data.charAt(0));

	}

}
